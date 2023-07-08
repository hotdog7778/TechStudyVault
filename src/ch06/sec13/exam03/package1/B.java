package ch06.sec13.exam03.package1;

public class B {
    public static void main(String[] args) {
        // 같은 패키지 내의 필드&메소드 사용. pub / default / pri
        // 같은 패키지 의 A 클래스

        // A클래스의 객체를 생성 후 pub/default/pri 필드를 조회해보자
        A a1 = new A();
        System.out.println(a1.field1); // pub OK
        System.out.println(a1.field2); // default OK
//        System.out.println(a1.field3); // pri 컴파일 에러

        // A클래스의 객체를 생성 후 pub/default/pri 메소드를 호출해보자
        a1.method1(); // pub OK
        a1.method2(); // defaukt OK
//        a1.method3(); // pri 컴파일 에러 // 다른 클래스내 호출 불가


    }
}
