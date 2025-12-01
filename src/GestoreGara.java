import java.util.ArrayList;

public class GestoreGara{
    public int contaGiri;
    public ArrayList<String> classifica = new ArrayList<>();
    public int posizione = 0;

    public GestoreGara(){

    }

    public synchronized void traguardo(Astronave astronave){
        System.out.println("Traguardo raggiunto da " +astronave.giocatore);
        posizione++;
        classifica.add(posizione+") "+astronave.giocatore +" con astronave " + astronave.nomeAstronave+"\n");
    }
}
