package ch07.quiz.exam07;

public class Child extends Parent{
    public String name;

    // 생성자
    public Child(){
        this("홍길동");
        System.out.println("Child() call");
    }

    // 생성자
    public Child(String name){
        this.name = name;
        System.out.println("Child(String name) call");
    }

}
