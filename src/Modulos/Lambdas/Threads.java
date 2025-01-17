package Modulos.Lambdas;

public class Threads {

    public static void main(String[] args) {

        Runnable tarefa1 = new Trabalho();

        Runnable tarefa2 = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Tarefa #02");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                }
            }
        };

        Runnable trabalho3 = Threads::trabalho3;

        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);
        Thread t3 = new Thread(trabalho3);

        t1.start();
        t2.start();
        t3.start();
    }

    static void trabalho3(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Tarefa #02");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}
