package ch09.sec05.exam02;

public class A {
    // this 를 사용해서 바깥 클래스와 중첩 클래스의 동일한 이름을 가진 필드와 메서드를 사용해보겠습니다.

    // A 인스턴스 필드 선언
    String field = "A-field";

    // A 인스턴스 메소드 선언
    void method() {
        System.out.println("A-method 실행");
    }

    // B 인스턴스 멤버 클래스 선언 (중첩클래스)
    class B {
        // B 인스턴스 필드 선언
        String field = "B-field";

        // B 인스턴스 메소드 선언
        void method() {
            System.out.println("B-method 실행");
        }

        // A,B의 필드와 메서드를 사용하기 위한 print 메서드를 선언
        void print() {
            // B의 필드와 메서드 사용
            System.out.println(this.field); // 여기서 this 는 B의 객체 입니다.
            this.method();

            // A의 필드와 메서드 사용
            System.out.println(A.this.field); //
            A.this.method();
        }
    }
    // A의 객체를 생성했을 때 b의 print 메서드를 실행하도록 useB 메서드를 작성.
    void useB() {
        B b = new B();
        b.print();
    }
}
