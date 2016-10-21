package threadtest;

/**
 *
 */
public class CentralServer {

    private int numUsers;

    public CentralServer(int numUsers) {
        this.numUsers = numUsers;
    }

    //Синхронизированный метод объекта не позволяет обращаться к нему сразу от нескольких thread
    //Если убрать synchornized то вывод собъется
    synchronized public int getNumUsers() {
        int num = numUsers;
        for(int i = 0; i<10e4; i++){

        }
        numUsers++;
        return num;
    }
}
