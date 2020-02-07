import java.util.Objects;

public class Ucesnik implements Glasanje, Comparable<Ucesnik>{

    private String ime;
    private int brojGlasova;
    private TipUcesnika tipUcesnika;

    public Ucesnik(String ime, TipUcesnika tipUcesnika){
        this.ime = ime;
        this.tipUcesnika = tipUcesnika;
    }

    public String getIme() {
        return ime;
    }

    public TipUcesnika getTipUcesnika() {
        return tipUcesnika;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ucesnik ucesnik = (Ucesnik) o;
        return Objects.equals(getIme(), ucesnik.getIme()) && getTipUcesnika() == ucesnik.getTipUcesnika();
    }

    @Override
    public void dodajGlas() {

        this.brojGlasova++;

    }

    @Override
    public int getBrojGlasova() {

        return this.brojGlasova;

    }

    @Override
    public int compareTo(Ucesnik ucesnik) {

        return ucesnik.getBrojGlasova() - this.brojGlasova;

    }

    @Override
    public String toString() {
        return this.ime;
    }
}
