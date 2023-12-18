package com.itheima_03;

public class AnimalDemo {
    public static void main(String[] args) {
       Animal a = new Cat("加菲",4);
       a.eat();
//       a.jump();
//        a.jump();
        System.out.println("-----------------");
        Cat c = new Cat();
        c.setAge(10);
        c.setName("花猫");
        System.out.println(c.getName()+c.getAge());
        c.eat();
        c.jump();
    }
}
