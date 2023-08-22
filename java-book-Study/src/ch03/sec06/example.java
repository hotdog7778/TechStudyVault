package ch03.sec06;

public class example {
    public static void main(String[] args) {
        boolean b = 'A' == 65;
        System.out.println(b);
        boolean a = 3 == 3.0;
        System.out.println(a);
        boolean c = 0.1f == (float)0.1;
        System.out.println(c);

        // 문자열 비교연산
        String str1 = "바보";
        String str2 = "김태균";
        boolean result = str1.equals(str2);
        System.out.println(result); // false
        boolean result2 = str1.equals("바보");
        System.out.println(result2); // true

    }
}
