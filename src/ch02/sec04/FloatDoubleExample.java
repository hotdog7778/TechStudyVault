package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // 소수 이하 자릿수를 확인하기 위해 출력해보자.
        float a = 0.1234567890123456789f;
        double b = 0.1234567890123456789;
        System.out.println(a); // 0.12345679  반올림 되나??
        System.out.println(b); // 0.12345678901234568

        // 10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6f;
        double var5 = 2e-3;
        System.out.println(var3); // 3000000.0
        System.out.println(var4); // 3000000.0
        System.out.println(var5); // 0.002

    }
}
