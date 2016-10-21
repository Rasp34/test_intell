package threadtest;

/**
 *
 */
public class ConnectorNorth extends Thread {

    CentralServer centSer;

    public ConnectorNorth(CentralServer CSER) {
        this.centSer = CSER;
        this.start();
    }

    public void takeUsers(){
        System.out.println("North :" + centSer.getNumUsers()); //Invoke method and print
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            takeUsers();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
