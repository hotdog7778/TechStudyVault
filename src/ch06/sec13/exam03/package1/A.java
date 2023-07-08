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
    public void method1(){}     // pub OK
    void method2(){}            // default Ok
    private void method3(){}    // pri OK



}
