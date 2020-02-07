import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Festival festival = new Festival("L&F");

        Dogadjaj koncert1 = new Koncert("prvi koncert", new Date(2020, Calendar.FEBRUARY, 7, 20,0), "sicksoul");
        Dogadjaj koncert2 = new Koncert("drugi koncert", new Date(2020, Calendar.FEBRUARY, 7, 20,30), "bjesovi");
        Dogadjaj koncert3 = new Koncert("treci koncert", new Date(2020, Calendar.FEBRUARY, 7, 21,30), "bekstvo iz la " +
                "zmija");

        Takmicenje turnir = new Turnir("turnir", new Date(2020, Calendar.FEBRUARY, 7, 19,0));

        Takmicenje izBOR = new Izbor("izbor", new Date(2020, Calendar.FEBRUARY, 7, 18,0));

        Ucesnik u1 = new Ucesnik("marko", TipUcesnika.MUZICAR);
        Ucesnik u2 = new Ucesnik("uros", TipUcesnika.MUZICAR);
        Ucesnik u3 = new Ucesnik("sima", TipUcesnika.MUZICAR);
        Ucesnik u4 = new Ucesnik("apostol", TipUcesnika.MUZICAR);
        Ucesnik u5 = new Ucesnik("djole", TipUcesnika.MUZICAR);

        Ucesnik u6 = new Ucesnik("vlada dzet", TipUcesnika.GOST);
        Ucesnik u7 = new Ucesnik("djordje david", TipUcesnika.GOST);
        Ucesnik u8 = new Ucesnik("milic vukasinovic", TipUcesnika.GOST);
        Ucesnik u9 = new Ucesnik("moja mama", TipUcesnika.GOST);
        Ucesnik u10 = new Ucesnik("tocak", TipUcesnika.GOST);

        izBOR.dodajUcesnika(u1);
        izBOR.dodajUcesnika(u2);
        izBOR.dodajUcesnika(u3);
        izBOR.dodajUcesnika(u4);
        izBOR.dodajUcesnika(u5);
        //izBOR.dodajUcesnika(u2);

        turnir.dodajUcesnika(u1);
        turnir.dodajUcesnika(u2);
        turnir.dodajUcesnika(u3);
        turnir.dodajUcesnika(u4);
        turnir.dodajUcesnika(u5);
        turnir.dodajUcesnika(u6);
        turnir.dodajUcesnika(u7);
        turnir.dodajUcesnika(u8);
        turnir.dodajUcesnika(u9);
        turnir.dodajUcesnika(u10);
        //turnir.dodajUcesnika(u4);

        festival.dodajDogadjaj(koncert1);
        festival.dodajDogadjaj(koncert2);
        festival.dodajDogadjaj(koncert3);

        festival.dodajDogadjaj(turnir);

        festival.dodajDogadjaj(izBOR);

        festival.odrziGlasanje();

        festival.ispisiProgram("file.txt");

        festival.ispisiRangListe();
    }
}
