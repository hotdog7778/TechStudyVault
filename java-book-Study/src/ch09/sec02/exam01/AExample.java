package ch09.sec02.exam01;

public class AExample {
    // 외부에서 인스턴스 멤버 클래스의 객체를 생성해보기
    public static void main(String[] args) {
        // A 객체 생성
        A a = new A();

        // B 객체 생성
        A.B b = a.new B();
    }
}
