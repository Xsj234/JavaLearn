package com.itheima_05;

public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer("王浩",30);

        ppp.eat();
        ppp.speak();
        ppp.study();


        BasketballPlayer bp = new BasketballPlayer("姚明",35);

        bp.eat();
        bp.study();
    }
}
