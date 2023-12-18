package com.itheima_01;

public class CatDemo {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        co.useCat(new Cat());

        Cat cat = co.getCat();
        cat.eat();

    }
}
