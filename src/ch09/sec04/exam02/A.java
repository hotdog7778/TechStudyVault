package ch09.sec04.exam02;

public class A {
    // 로컬클래스 내부에도 필드, 메소드, 생성자를 선언할 수 있다.
    // 로컬클래스 내부에 정적 필드,메소드는 자바 17부터 허용한다.

    // 메서드
    void useB() {
        // 메서드 내부의 로컬 클래스
        class B {
            // 로컬클래스 내부의 인스턴스 필드
            int field1 = 1;

            // 정적 필드_자바 17이후 허용
            static int field2 = 2;

            // 생성자
            B(){
                System.out.println("로컬클래스 B의 생성자 실행");
            }

            // 인스턴스 메서드
            void method1(){
                System.out.println("로컬클래스 내부의 인스턴스 메소드실행");
            }

            // 정적 메서드 _ 자바 17이후 허용
            static void method2(){
                System.out.println("로컬클래스 내부의 정적 메서드 실행");
            }
        }

        // usbB 메서드 영역

        // 로컬 객체 생성. 메서드 내부니까 가능
        B b = new B();
        // 로컬 객체의 인스턴스 메서드와 인스턴스 필드 사용
        System.out.println(b.field1);
        b.method1();
        // 로컬 객체의 정적 메서드, 정적 필드 사용
        System.out.println(B.field2);
        B.method2();
    }


}
