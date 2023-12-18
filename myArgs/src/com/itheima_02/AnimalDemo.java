package com.itheima_02;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        ao.useAnimal(new Cat());

        Animal c = ao.getAnimal();
        c.eat();
    }
}
