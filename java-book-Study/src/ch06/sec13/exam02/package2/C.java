package ch06.sec13.exam02.package2;
import ch06.sec13.exam02.package1.*;
public class C {
    // 다른 패키지 내의 A class의 필드를 선언해보자.
    // 다른 패키지니까 public 만 가능

    // Case) 외부 패키지의 public 클래스의(Public 수준 생성자) 필드 선언
    A a1 = new A(true);

    // Case) 외부 패키지의 default 클래스의(Default 수준 생성자) 필드 선언
//    A a2 = new A(1);
    // 컴파일 에러요

    // Case) 외부 패키지의 default 클래스의(private 수준 생성자) 필드 선언
//    A a3 = new A("Private 생성자 나와라");
    // 컴파일 에러요
}
