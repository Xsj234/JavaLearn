package com.itheima_05;
/*


*/
public class AnimalDemo {
    public static void main(String[] args) {
//      猫创建对象进行测试
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+a.getAge());
        a.eat();

        a = new Cat("加菲",5);
        System.out.println(a.getName()+a.getAge());
        a.eat();

    }
}
