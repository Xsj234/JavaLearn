package it.cast2;

public class FinalDemo {
    public static void main(String[] args) {
        final int age =10;
//        age = 100;
        System.out.println(age);

        final Student s = new Student();
        s.age =100;
        System.out.println(s.age);

//        s = new Student();

    }
}
