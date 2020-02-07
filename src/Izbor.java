import java.util.Date;

public class Izbor extends Takmicenje {

    public Izbor(String naziv, Date vremePocetka){
        super(naziv, vremePocetka);
    }

    @Override
    public boolean dodajUcesnika(Ucesnik ucesnik) {

        boolean dodato = false;

            if (!super.getListaUcesnika().contains(ucesnik) && ucesnik.getTipUcesnika() == TipUcesnika.MUZICAR){

                super.getListaUcesnika().add(ucesnik);

                dodato = true;

            } else {

                System.out.println("Ucesnik "+ ucesnik.getIme() +" je vec u listi izbor ili nije muzicar");

            }

        return dodato;
    }
}
