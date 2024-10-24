package partitapallavolo;

public class Giocatore implements Runnable {
    private int id;
    private int numeroPassaggi;
    
    public Giocatore(int id){
        this.id = id;
        this.numeroPassaggi = 0;
    }

    public int getId(){
        return id;
    }
 
    public int getNumeroPassaggi(){
        return numeroPassaggi;
    }

    public void run() {

        while (true) {
            System.out.println("Giocatore " + id + " è a quota " + numeroPassaggi + " passaggi e ha ricevuto la palla.");
            numeroPassaggi++;
            System.out.println("Giocatore " + id + " ha passato la palla: è a quota " + numeroPassaggi + " passaggi.");
            Thread.currentThread().yield();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
