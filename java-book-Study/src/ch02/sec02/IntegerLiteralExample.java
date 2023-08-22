package ch02.sec02;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011;  // 2진
        int var2 = 0206;    // 8진
        int var3 = 365;     // 10진
        int var4 = 0xB3;    // 16진

        System.out.println("Var1 : "+var1); // 11
        System.out.println("Var2 : "+var2); // 134
        System.out.println("Var3 : "+var3); // 365
        System.out.println("Var4 : "+var4); // 179
        // 전부 10진수로 출력된다.

        // 아래같은 방법으로 출력을 10진수 말고 다른걸로도 할 수 있다.
        System.out.printf("%o",var1); // var1을 8진수로 출력. 13
    }
}
