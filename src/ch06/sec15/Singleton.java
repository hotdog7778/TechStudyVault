package ch06.sec15;

public class Singleton {

    private static Singleton singleton1 = new Singleton();

    private Singleton(){
        System.out.println("생성자 초기화");
        System.out.println(singleton1);
    }



    public static Singleton getInstance(){
        System.out.println("singleton 생성");

        return singleton1;
    }
}
