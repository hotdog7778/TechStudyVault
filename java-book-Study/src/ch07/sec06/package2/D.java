package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
    // A와 다른패키지에 있는 D에서(상속O) A의 필드,생성자,메서드를 사용

    D(){
        super(); // 생성자 사용
    }

    @Override
    public void method(){
    }

    public void method1(){
        // A 필드값 변경
        this.field = "테스트";
        // A의 메소드 호출
        this.method();
    }

    public void method2(){
        // A a = new A();     // 객체를 생성해서 사용할 순 없다.
        // a.field = "value"; // X
        // a.method();        // X
    }

}
