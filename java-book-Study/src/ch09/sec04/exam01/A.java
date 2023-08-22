package ch09.sec04.exam01;

public class A {
    // 생성자
    A() {
        // 생성자 내부에서 로컬 클래스 선언
        class B{}

        // 생성자 내부에서 로컬 객체 생성
        B b = new B();
    }

    // 메소드
    void method() {
        class B{}

        B b = new B();
    }

}
