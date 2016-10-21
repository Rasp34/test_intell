package threadtest;

/**
 *
 */
public class SynchronizedTest {

    public static void main(String[] args) {

        CentralServer CSER = new CentralServer(0);
        ConnectorNorth CN = new ConnectorNorth(CSER);
        ConnectorSouth CS = new ConnectorSouth(CSER);

    }

}
