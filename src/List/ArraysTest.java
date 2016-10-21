package List;

import java.util.*;

/**
 *
 */
public class ArraysTest {

    public static void main(String[] args) {


        /**
         * ---------LISTS----------
         */

        ArrayList<Integer> intList = new ArrayList<>();
        for(int i = 0; i<100; i++){
            intList.add(i);
        }

//        for (int n = 0; n < intList.size(); n++){
//            System.out.println(intList.get(n));
//        }

        ArrayList<String> catNames = new ArrayList<>();
        catNames.add("Jack");
        catNames.add("Lick");
        catNames.add("Nort");
        catNames.add("Lili");

//        Присутствуют ли элементы в списке
        System.out.println("Lili in list :" + catNames.contains("Lili"));
        System.out.println("Phil in list :" + catNames.contains("Phil"));

//        Удалим элемент
        System.out.println("\nRemove element");
        catNames.remove("Nort");
        for (int n = 0; n < catNames.size(); n++){
            System.out.println(catNames.get(n));
        }

//        Заменим элемент массива
        System.out.println("\nAfter set element");
        catNames.set(1, "Phil");
        for (int n = 0; n < catNames.size(); n++){
            System.out.println(catNames.get(n));
        }

//        Количество одинаковых элементов
        System.out.println("\nCloned element");
        catNames.set(2, "Jack");
        System.out.println(Collections.frequency(catNames, "Jack"));
        catNames.set(2, "Lili"); //Вернем Lili

//        Создадим еще один список и объединим с предидущим
/*        List<String> catName_v2 = new ArrayList<>();
        catName_v2.add("Gorg");
        catName_v2.add("Helen");
        catName_v2.add("Lucky");
        catName_v2.add("Hurt");

        List<String> catUnionList = ListUtils.union(catNames, catName_v2);
        //Для действия необходимо подтянуть библиотеку http://developer.alexanderklimov.ru/android/java/unsorted.php#apache
        //но мне лень
        */

//        Задание параметров при создании объекта
        List<Integer> arrayInt = Arrays.asList(1, 3, 14, 10, 15);
        try{
            arrayInt.add(9); //При таком задании массива нельзя добавлять или удалять элементы
        }catch (Exception e){
            System.out.println("Error operation " + e.getClass());
        }

        /**
         *  ---------SET----------
         */

//        HashSet - использует хеширование для ускорения выборки, порядок получается случайным
        HashSet<String> countrySet = new HashSet<>();
        countrySet.add("France");
        countrySet.add("Austria");
        countrySet.add("Gemany");
        countrySet.add("Italy");

        Iterator<String> countryIterator = countrySet.iterator();
        while (countryIterator.hasNext()){
            System.out.println(countryIterator.next().toString() + ", ");
        }

//        TreeSet - сет выполняет сортировку элементов хранящихся в нем
        TreeSet<String> planetsSet  = new TreeSet<>();
        planetsSet.add("Saturn");
        planetsSet.add("Mercury");
        planetsSet.add("Earth");
        planetsSet.add("Venus");

        System.out.println();
        System.out.println("Size of planet tree : " + planetsSet.size());

        for (String planet :
                planetsSet) {
            System.out.println(planet + ";");
        }


        //Поместим другую коллекцию в дерево
        TreeSet<String> countryTree = new TreeSet<>(countrySet);

        System.out.println();
        System.out.println("Size of country tree : " + countryTree.size());

        for (String country :
                countryTree) {
            System.out.println(country + ";");
        }

        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        String str = new String(chars, 2, 3);

        System.out.println(str);




    }



}
