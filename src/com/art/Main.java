package com.art;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        if (args.length > 0){
            print_word(args[0]);
            System.out.println(caption());
        }else {
            System.out.println("Error 401; String not detect;");
            System.exit(0);
        }

        int[] cats = new int[10];

        for (int i=0; i<cats.length; i++){
            cats[i]=i;
        }
        System.out.println("link of array " + cats.toString());
        System.out.println(Arrays.toString(cats));

        //Create objects
        Cat Tom = new Cat("Tom", 1, "Grey");
        Cat cloneTom = new Cat("Tom", 1, "Grey");
        Cat Hurry = new Cat("Hurry", 2, "Black");
        Cat Jack = new Cat("Jack", 3, "White with blackspot");
        CatLittle Kitty = new CatLittle("Kitty", 1, "Black", "Hurry");

        //Object to list
        ArrayList<Cat> Cats= new ArrayList<>();
        Cats.add(Tom);
        Cats.add(Hurry);
        Cats.add(Jack);
        Cats.add(Kitty);

        //Print object properties
        for (Cat takeCat :
                Cats) {
            System.out.println("Cat number " + Cat.numberCats);
            System.out.println("Name " + takeCat.name);
            System.out.println("Age " + takeCat.age);
            System.out.println("Color " + takeCat.color);
//            System.out.println(takeCat.getClass().toString());
//            if (takeCat.getClass().toString() == "com.art.CatLittle"){
//                CatLittle takeCatLittle = (CatLittle) takeCat;
//                System.out.println("Father " + takeCatLittle.father);
//            }
            System.out.println("\n");
        }

        //Equals objects
        if (Tom.equals(Kitty)) {
            System.out.println("Cats True");
        }else System.out.println("Cats False");


    }

    static void print_word(String word){
        System.out.println(word);
    }

    static String caption(){
        return "by Art";
    }
}
