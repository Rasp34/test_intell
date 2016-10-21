package threadtest;

/**
 *
 */
public class ThreadTest {

    public static void main(String[] args) {
        Thread threadMain = Thread.currentThread();
        threadMain.setName("thread Main");
        System.out.println(threadMain.getName());


        //1 метод: Объекты являются наследниками Thread, их запуск
        Runner1 run1 = new Runner1("run1");
        run1.start();
        Runner1 run2 = new Runner1("run2");
        run2.start();

        //2 метод: Объекты имплементирующие класс интерфейс Runnable
        Runner2 run3 = new Runner2("run3");
        Runner2 run4 = new Runner2("run4");
        //Создаем threads, помещаем в них объекты Runnable, запускаем
        Thread rn3 = new Thread(run3);
        rn3.start();
        Thread rn4 = new Thread(run4);
        rn4.start();
        System.out.println("End main;");

    }
}
