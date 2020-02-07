import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Takmicenje extends Dogadjaj {

    private List<Ucesnik> listaUcesnika;

    public Takmicenje(String naziv, Date vremePocetka){
        super(naziv, vremePocetka);
        listaUcesnika = new ArrayList<>();
    }

    public abstract boolean dodajUcesnika(Ucesnik ucesnik);


    public List<Ucesnik> getListaUcesnika() {
        return listaUcesnika;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + this.listaUcesnika.size() + " ucesnika)";
    }
}
