package ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {
//        Singleton singletonInstance = new Singleton(); 컴파일 에러
        Singleton a1 = Singleton.getInstance();
        Singleton a2 = Singleton.getInstance();

        System.out.println(a1);
        System.out.println(a1 == a2); // true

    }
}
