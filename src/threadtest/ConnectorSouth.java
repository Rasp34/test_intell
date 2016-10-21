package threadtest;

/**
 *
 */
public class ConnectorSouth extends Thread{

    CentralServer centSer;

    public ConnectorSouth(CentralServer CSER) {
        this.centSer = CSER;
        this.start();
    }

    public void takeUsers(){
        System.out.println("South :" + centSer.getNumUsers());
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
