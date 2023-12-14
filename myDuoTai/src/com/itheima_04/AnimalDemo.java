package com.itheima_04;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
//        a.palyGame();
        Cat c = (Cat) a;
        c.eat();
        c.playGame();

    }
}
 