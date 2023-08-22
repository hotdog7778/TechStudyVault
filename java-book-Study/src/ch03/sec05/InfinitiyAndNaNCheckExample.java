package ch03.sec05;

public class InfinitiyAndNaNCheckExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int result = a/b; // Exception 발생
        System.out.println(result);

//        int a = 5;
//        double b = 0.0;
//        double result = a/b;
//        System.out.println(result); // Infinity 출력
//
//        result = a%b;
//        System.out.println(result); // NaN 출력
//
//        boolean check = Double.isNaN(result);
//        System.out.println(check);
    }
}
