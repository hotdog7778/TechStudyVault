package ch09.sec04.exam03;

public class A {
    // 메서드
    public void method1 (int arg) {   // 여기서 arg 매개변수를 로컬 클래스 내부에서 사용할 경우 final int arg 로 동작한다
        // 로컬 변수
        int var = 1;

        // 로컬 클래스
        class B {

            // 메서드
            void method2() {
                // 로컬 변수 읽기
                System.out.println("arg: " + arg);
                System.out.println("var: " + var);

                // 로컬 변수 수정
                // arg = 10; // 메서드 내부에 생성된 로컬 클래스 내부에서 매개변수를 수정하는 케이스. 이때 로컬 변수는 final 이라 수정 불가능함.
                // var = 10; // 로컬 클래스 내부에서 로컬 변수를 수정하는 케이스. 이때 로컬 변수는 final 이라 수정 불가능함.
            }
        }

        // 로컬 객체 생성
        B b = new B();
        // 로컬 객체 메서드 호출
        b.method2();

        // 로컬 변수 수정
        // arg = 10;
        // var = 10; // 로컬 클래스 내부에서 사용하고 있는 로컬 변수이기때문에 이렇게하면, 로컬 클래스내부에서 해당 변수 사용시 컴파일 에러 납니다.

    }
}
