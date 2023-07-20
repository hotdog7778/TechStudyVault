package ch09.sec05.exam01;

public class A {
    // A 클래스의 인스턴스 필드와 메서드 선언
    int field1 = 1;
    void method1(){System.out.println("A의 method1 실행");}

    // A 클래스의 정적 필드와 메서드 선언
    static int field2 = 2;
    static void method2(){System.out.println("A의 static method2 실행");}

    // 중첩 클래스인 인스턴스 멤버 클래스 선언
    class B {
        void method3(){
            // A 클래스의 인스턴스 필드와 메서드를 사용
            System.out.println(field1);
            method1();

            // A 클래스의 정적 필드와 메서드 사용
            System.out.println(field2);
            method2();
        }
    }

    // 중첩 클래스인 정적 멤버 클래스 선언
    static class C {
        void method4() {
            // A 클래스의 인스턴스 필드와 메서드를 사용
            // System.out.println(field1); // 정적 멤버 클래스 내부에서 field1을 사용할 수 없다.
            // method1();                  // 정적 멤버 클래스 내부에서 method1을 사용할 수 없다.
                                        // static 은 컴파일시 메모리에 올라가고 그떄에는 코드 수행시 필요한 인스턴스 필드나,메서드를 메모리에서 찾을수 없기 떄문임.
            // A 클래스의 정적 필드와 메서드 사용
            System.out.println(field2);
            method2();
        }
    }
}
