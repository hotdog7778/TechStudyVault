package ch09.sec02.exam02;

public class A {
    // 중첩 클래스인 인스턴스 멤버 클래스에도 필드, 생성자, 메소드 선언을 할 수 있다.
    class B{
        // 인스턴스 필드 선언 및 초기화
        int field1 = 1;

        // 정적필드 (자바17 부터 허용)
        static int field2 = 2;

        // 생성자
        B(){
            System.out.println("B의 생성자 실행");
        }

        // 인스턴스 메소드 선언
        void method1(){
            System.out.println("B의 method1 실행");
        }

        // 정적 메소드 선언 (자바 17부터 허용)
        static void method2(){
            System.out.println("B의 method2 실행");
        }
    }

    // 인스턴스 메소드 (A의 영역)
    void usbB() {
        // B 객체 생성 및 인스턴스 필드 및 메소드 사용
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        // B 클래스의 정적 필드 및 메소드 사용
        System.out.println(B.field2);
        B.method2();
    }

}
