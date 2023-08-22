package ch07.quiz.exam07;

public class Parent {
    public String nation;

    // 생성자
    public Parent() {
        this("대한민국");
        System.out.println("Parent() call");
    }

    // 생성자
    public Parent(String nation){
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }

}
