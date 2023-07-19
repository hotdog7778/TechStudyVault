package ch09.sec02.exam01;

public class A {
    // 인스턴스 멤버 클래스 선언
    class B{}// 생략했으니 접근제한은 default

    // 인스턴스 필드 값으로 B 객체 대입
    // >> 인스턴스 필드에서는 인스턴스 멤버 객체를 생성할 수 있다.
    B field = new B();

    // 생성자
    // >> 생성자에서는 인스턴스 멤버 객체를 생성할 수 있다.
    A(){
        B b = new B();
    };

    // 인스턴스 메소드
    // >> 인스턴스 메소드에서는 인스턴스 멤버 객체를 생성할 수 있다.
    void method(){
        B b = new B();
    }
}
