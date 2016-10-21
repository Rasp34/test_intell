package threadtest;

/**
 *
 */
public class Runner2 implements Runnable{

    String name;

    public Runner2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            System.out.println(name + " :" + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End of " + name);
    }
}

