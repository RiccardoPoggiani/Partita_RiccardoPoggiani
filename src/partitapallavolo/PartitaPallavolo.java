package partitapallavolo;

//@author Riccardo Poggiani

public class PartitaPallavolo {
    public static void main(String[] args) {

        Giocatore g1 = new Giocatore(1);
        Giocatore g2 = new Giocatore(2);
        
        Thread t1 = new Thread(g1);
        t1.setPriority(Thread.MAX_PRIORITY);

        Thread t2 = new Thread(g2);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("idGiocatore: " + g1.getId() + ", priorità: " + t1.getPriority() + ", nome: " + t1.getName());
        t1.start();

        System.out.println("idGiocatore: " + g2.getId() + ", priorità: " + t2.getPriority() + ", nome: " + t2.getName());
        t2.start();
    }
}
