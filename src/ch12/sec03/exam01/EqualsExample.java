package ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        // Member 클래스에서 재정의한 equals 사용
        if(obj1.equals(obj2)) {
            System.out.println("obj1 동등 obj2");
        } else {
            System.out.println("obj1 동등 하지 않음 obj2");
        }

        if(obj1.equals(obj3)) {
            System.out.println("obj1 동등 obj3");
        } else {
            System.out.println("obj1 동등 하지 않음 obj3");
        }



    }
}
