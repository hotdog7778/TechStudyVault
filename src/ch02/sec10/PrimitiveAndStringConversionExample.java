package ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {

        // 기본타입을 문자열로 변환
        byte val = 12;
        String a = String.valueOf(val);
        System.out.println( a.getClass().getName() );




        System.out.println("#################################");
        String str = "10";

        // String -> byte
        byte var1 = Byte.parseByte(str);
        System.out.println("String -> byte");
        System.out.println(str);
        System.out.println(((Object)var1).getClass().getSimpleName());

        // String -> short
        str = "10";
        short var2 = Short.parseShort(str);
        System.out.println("String -> short");
        System.out.println(str);
        System.out.println(((Object)var2).getClass().getSimpleName());

        // String -> int
        str = "10";
        int var3 = Integer.parseInt(str);
        System.out.println("String -> int");
        System.out.println(str);
        System.out.println(((Object)var3).getClass().getSimpleName());

        // String -> long
        str = "10";
        long var4 = Long.parseLong(str);
        System.out.println("String -> long");
        System.out.println(str);
        System.out.println(((Object)var4).getClass().getSimpleName());

        // String -> float
        str = "10.1";
        float var5 = Float.parseFloat(str);
        System.out.println("String -> float");
        System.out.println(str);
        System.out.println(((Object)var5).getClass().getSimpleName());

        // String -> long
        str = "10";
        long var6 = Long.parseLong(str);
        System.out.println("String -> long");
        System.out.println(str);
        System.out.println(((Object)var6).getClass().getSimpleName());

    }
}
