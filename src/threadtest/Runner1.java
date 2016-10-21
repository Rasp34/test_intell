package threadtest;

/**
 *
 */

public class Runner1 extends Thread {

    String name;

    public Runner1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            System.out.println(name + " :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End of " + name);
    }
}
