package ch06.sec10.exam01;

public class HoHow {
    // 인스턴스 필드와 메소드 선언
    int field1 = 1;
    void method1() {System.out.println("인스턴스 메소드 입니당.");}

    // 정적 필드와 메소드 선언
    static int field2 = 1;
//    static void method2() {System.out.println("정적 메소드 입니당.");}

    // 정적 블록 선언
    static{
//        field1 = 10; // 컴파일 에러
//        method1(); // 컴파일 에러
        field2 = 10;
//        method2() ;
    }

    // 정적 메소드 선언
    static void method2() {
//        this.field1 = 10; // 컴파일 에러
//        this.method1(); // 컴파일 에러
        field2 = 30;
        method2();
    }
}
