package ch07.sec07.exam03;

class Parent {
    String field1;

    void method1(){}
}

class Child extends Parent{
    String field2;

    void method2(){}
    void method3(){}
}

public class ChildExample {
    public static void main(String[] args) {

        // 부모타입으로 자동 형변환
        Parent parent = new Child();

        parent.field1 = "test";
        parent.method1();

        // 자식타입으로 강제 형변환
        Child child = (Child) parent;
        child.field2 = "test";
        child.method2();
        child.method3();

        // 부모타입객체를 바로 자식타입으로 강제변환 하면 실행시 Exception 이 난다.
        // class ch07.sec07.exam03.Parent cannot be cast to class ch07.sec07.exam03.Child (ch07.sec07.exam03.Parent and ch07.sec07.exam03.Child are in unnamed module of loader 'app')
//        Parent parent = new Parent();
//        Child child = (Child) parent;
//        child.field2 = "zz";
//        System.out.println(child.field2);

    }
}
