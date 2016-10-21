package GenericTest;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        GenClass<Integer> int1 = new GenClass<>(77);
        System.out.println(int1.showClass());

        GenClass<String> str1 = new GenClass<>("Hello");
        System.out.println(str1.showClass());

    }
}
