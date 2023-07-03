package ch05.sec05;

public class example {
    public static void main(String[] args) {
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = new String("홍길동");

        boolean test = name1.equals(name3);
        System.out.println(test); // true
    }
}
