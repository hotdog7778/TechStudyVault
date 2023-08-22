package ch06.sec13.exam03.package1;

public class A {
    // 필드선언
    // public
    public int field1;
    // default
    int field2;
    //private
    private int field3;

    // 생성자 선언
    public A(){
        field1 = 1;  // pub OK
        field2 = 2;  // default OK
        field3 = 3;  // private OK
    }

    // 메소드 선언
    public void method1(){
        System.out.println("public void method1() 실행되었음.");
        System.out.println("private method3() 호출해보기");
        method3();
    }     // pub OK
    void method2(){}            // default Ok
    private void method3(){
        System.out.println("private void method3() 실행되었음.");
    }    // pri OK



}
