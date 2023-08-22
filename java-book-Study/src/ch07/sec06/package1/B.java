package ch07.sec06.package1;

public class B {
    // A와 같은 패키지 B에서 A의 protected 필드,생성자,메서드 사용

    public void method(){
        A a = new A();      // 생성자 사용
        a.field = "테스트";   // 필드 사용
        a.method();         // 메서드 사용
    }

}
