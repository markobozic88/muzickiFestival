import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Festival {

    private String naziv;
    List<Dogadjaj> listaDogadjaja;
    List<Ucesnik> listaUcesnika;

    public Festival(String naziv){
        this.naziv = naziv;
        listaDogadjaja = new ArrayList<>();
        listaUcesnika = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public boolean dodajDogadjaj(Dogadjaj dogadjaj){

        boolean dodato = false;

            if (!this.listaDogadjaja.contains(dogadjaj)){
                this.listaDogadjaja.add(dogadjaj);
                dodato = true;
            } else {
                System.out.println("dogadjaj " + dogadjaj.getNaziv() + " je vec u listi");
            }

        return dodato;
    }

    public void odrziGlasanje(){

        Random r = new Random();

        for (Dogadjaj d : this.listaDogadjaja){

            if (d instanceof Takmicenje){

                this.listaUcesnika = ((Takmicenje) d).getListaUcesnika();

                for (Ucesnik ucesnik : this.listaUcesnika){

                    if (r.nextDouble() <= 0.3){

                        ucesnik.dodajGlas();

                    }

                }

            }

            if (d instanceof Koncert){

                if (r.nextDouble() <= 0.2){

                        ((Koncert) d).dodajGlas();

                }
            }
        }
    }

    public void ispisiProgram(String nazivFajla){

        PrintWriter writer;

        Collections.sort(this.listaDogadjaja);

        try {
            writer = new PrintWriter(nazivFajla);
            writer.print(this.listaDogadjaja);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void ispisiRangListe(){

        for (Dogadjaj d : this.listaDogadjaja){

            if (d instanceof Turnir){

                System.out.println(d.getNaziv() + " - " + ((Turnir) d).odrediPobednika());

            }

            if (d instanceof Izbor){

                System.out.println(d.getNaziv());

                Collections.sort(((Izbor) d).getListaUcesnika());

                for (int i = 0; i < ((Izbor) d).getListaUcesnika().size(); i++){

                    System.out.println((i + 1) + ". mesto: " + ((Izbor) d).getListaUcesnika().get(i).getIme()
                            + " - " + ((Izbor) d).getListaUcesnika().get(i).getBrojGlasova());

                }

            }

        }




    }
}
