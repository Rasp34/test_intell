package com.art;

/**
 * Created by a.krivosheev on 20.06.2016.
 */
public class Cat {

    String name;
    int age;
    String color;
    static int numberCats = 0;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        numberCats++;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false; // check nullpoint link
        if (super.equals(obj)) return true; //check to himself
        if (this.getClass() == obj.getClass()) { //check Class
            Cat otherCat = (Cat)obj;
            if (otherCat.name == this.name)
                if (otherCat.age == this.age)
                    if (otherCat.color == this.color)
                        return true;
        }
        return false;
    }
}
