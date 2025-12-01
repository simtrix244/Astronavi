//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        GestoreGara g = new GestoreGara();


        Astronave a1 = new Astronave("simone", "METRJE", 20, g );
        Thread t1 = new Thread(a1);

        Astronave a2 = new Astronave("Luca", "RAZOR", 10, g);
        Thread t2 = new Thread(a2);



        t1.start();
        t2.start();

    }
}


