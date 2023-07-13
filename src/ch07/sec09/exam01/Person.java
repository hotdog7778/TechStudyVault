package ch07.sec09.exam01;

public class Person {
    // 부모
    // 필드선언
    public String name;

    // 생성자 선언
    public Person(String name){
        this.name = name;
    }

    // 메소드 선언
    public void walk() {
        System.out.println("걷습니다.");
    }
}
