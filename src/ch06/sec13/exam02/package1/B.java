package ch06.sec13.exam02.package1;

public class B {
    public static void main(String[] args) {
        // 같은 패키지 내의 A class의 필드를 선언해보자.
        // 같은 패키지니까 public, default 만 가능

        // Case) 같은 패키지의 public 클래스의(Public 수준 생성자) 필드 선언
        A a1 = new A(true);

        // Case) 같은 패키지의 default 클래스의(Default 수준 생성자) 필드 선언
        A a2 = new A(1);

        // Case) 같은 패키지의 default 클래스의(private 수준 생성자) 필드 선언
//        A a3 = new A("Private 생성자 나와라");
        // 컴파일 에러요
    }
}