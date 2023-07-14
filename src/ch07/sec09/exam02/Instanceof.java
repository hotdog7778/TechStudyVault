package ch07.sec09.exam02;

class Parent{}
class Child extends Parent {}

public class Instanceof {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // 객체 instanceof 클래스

        // 부모 is 자식
        System.out.println(parent instanceof Child); // false

        // 자식 is 부모
        System.out.println(child instanceof Parent); // true
    }

}
