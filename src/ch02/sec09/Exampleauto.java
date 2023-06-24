package ch02.sec09;

public class Exampleauto {
    public static void main(String[] args) {
        // byte 강제 변환
        byte x = 10;
        byte y = 20;
        byte result = (byte)(x+y);
        System.out.println(result);

        //
        int a = 10;
        int b = 20;
//        int result2 = x+y;
        long result2 = x + y;
        System.out.println(result2);

        // 번수가 기본타입 일때 무슨 타입인지 확인 하는방법
        System.out.println(((Object)result2).getClass().getSimpleName());

        // 변수가 기본타입이 아닐때
        String sName = "바보똥개";
        System.out.println( sName.getClass().getName() );
    }
}
