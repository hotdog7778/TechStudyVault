package ch06.sec13.exam02.package1;

public class A {
    // 같은 클래스 내의 필드 선언 (A to A)
    // Case) public
    A a1 = new A(true);
    // Case) default
    A a2 = new A(123);
    // Case) private
    A a3 = new A("멍충이");

    // 생성자
    // public 접근 제한자
    public A(boolean b){
        b = true;
    }

    // default
    A(int a){
    }

    // private 접근 제한자
    private A(String b){
        System.out.println(b);
    }
}
