package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
//        long var3 = 10000000000; // 컴파일러는 해당 리터럴 값을 int로 간주하기때문에 에러 발생.
        long var4 = 10000000000L;

        System.out.println(var1);   // 10
        System.out.println(var2);   // 20
        System.out.println(var4);   // 10000000000
    }
}
