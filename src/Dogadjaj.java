import java.util.Date;

public abstract class Dogadjaj implements Comparable<Dogadjaj> {

    private String naziv;
    private Date vremePocetka;


    public Dogadjaj(String naziv, Date vremePocetka){
        this.naziv = naziv;
        this.vremePocetka = vremePocetka;

    }

    public String getNaziv() {
        return naziv;
    }

    public Date getVremePocetka() {
        return vremePocetka;
    }

    @Override
    public int compareTo(Dogadjaj dogadjaj) {

        return (int) this.vremePocetka.getTime() - (int) dogadjaj.getVremePocetka().getTime();

    }

    @Override
    public String toString() {

        return this.vremePocetka.getDay() + "." + this.vremePocetka.getMonth() + "." + this.vremePocetka.getYear()
                + " " + this.vremePocetka.getHours() + ":" + this.vremePocetka.getMinutes() + " - " + this.naziv;

    }
}
