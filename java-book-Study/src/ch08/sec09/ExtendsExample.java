package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {

        // 구현 클래스 객체를 부모인터1 형, 부모인터2 형, 자식인터 형 참조변수에 대입시켜서 확인해보자

        // 부모인터1 형
        InterfaceA intA = new InterfaceChildImpl();
        intA.methodA(); // 구현 클래스의 메소드A
        // intA.methodB(); // 컴파일 에러
        // intA.methodC(); // 컴파일 에러
        // methodA만 사용 가능한 것을 확인할 수 있다.

        // 부모인터2 형
        InterfaceB intB = new InterfaceChildImpl();
        // intB.methodA(); // 컴파일 에러
        intB.methodB(); // 구현 클래스의 메소드B
        // intB.methodC(); // 컴파일 에러
        // methodB만 사용 가능한 것을 확인할 수 있다.

        // 부모인터3 형
        InterfaceChild intC = new InterfaceChildImpl();
        intC.methodA(); // 구현 클래스의 메소드A
        intC.methodB(); // 구현 클래스의 메소드B
        intC.methodC(); // 구현 클래스의 메소드C
        // methodA,B,C 모두 사용 가능한 것을 확인할 수 있다.





    }
}
