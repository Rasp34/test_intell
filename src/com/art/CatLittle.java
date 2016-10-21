package com.art;

/**
 * CatLittle extend Cat
 */
public class CatLittle extends Cat {

    public String father;
    public int num;

    public CatLittle(String name, int age, String color, String father) {
        super(name, age, color);
        this.father = father;
        num = numberCats;

    }
}
