import java.util.Date;
import java.util.Random;

public class Turnir extends Takmicenje {

    public Turnir(String naziv, Date vremePocetka){
        super(naziv, vremePocetka);
    }

    @Override
    public boolean dodajUcesnika(Ucesnik ucesnik) {

        boolean dodato = false;

            if (!super.getListaUcesnika().contains(ucesnik)){

                super.getListaUcesnika().add(ucesnik);

                dodato = true;

            } else {

                System.out.println("ucesnik " + ucesnik.getIme() + " je vec u listi turnir");

            }

        return dodato;
    }

    public Ucesnik odrediPobednika(){

        Random random = new Random();

        int izabrani = random.nextInt(super.getListaUcesnika().size());

        Ucesnik pobednik = this.getListaUcesnika().get(izabrani);

        return pobednik;

    }
}
