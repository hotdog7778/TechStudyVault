package ch07.sec07;

class Parent {
    void method1(){
        System.out.println("Parent 클래스의 method1 호출");
    }
    void method2(){
        System.out.println("Parent 클래스의 method2 호출");
    }
}

class Child extends Parent{
    void method3(){
        System.out.println("Child 클래스의 method3 호출");
    }
    @Override
    void method1(){
        System.out.println("Child 클래스에서 오버라이딩 한 Parent 클래스의 method1 호출");
    }
}

public class Prac {
    public static void main(String[] args) {
        Child child = new Child(); // 자식 클래스의 인스턴스 생성
        Parent parent = child; // 위에서 생성한 인스턴스를 Parent 타입으로 형변환(자동)

        // parent 객체는 Parent 클래스에 소속된 메소드만 사용 할 수 있다.

        parent.method1(); // Child 클래스에서 오버라이딩 한 Parent 클래스의 method1 호출
                          // >> 즉 자식메소드에서 오버라이딩을 했다면, 오버라이딩한 메소드를 사용하게 된다.

        parent.method2(); // Parent 클래스의 method2 호출

        // parent.method3(); // 컴파일 에러

    }
}
