import java.io.FileWriter;
import static java.lang.Thread.sleep;

public class Astronave implements Runnable {
    public String giocatore;
    public int posizione;
    public String nomeAstronave;
    public int giriMassimi;
    public int giroCorrente = 1;
    public GestoreGara g;

    public Astronave(String giocatore, String nomeAstronave, int giri, GestoreGara g) {
        this.giocatore = giocatore;
        posizione = 0;
        this.nomeAstronave = nomeAstronave;
        giriMassimi = giri;
        this.g = g;
    }

    @Override
    public void run() {
        for (giroCorrente = 0; giroCorrente < giriMassimi; giroCorrente++) {
            try {
                sleep(1000);
                System.out.println("Giro "+giroCorrente+" completato per " + giocatore + " con auto: " + nomeAstronave);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        g.traguardo(this);
    }
}