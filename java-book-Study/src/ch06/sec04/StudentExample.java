package ch06.sec04;

public class StudentExample {
    public static void main(String[] args) {
        // Student 클래스를 사용해서 객체를 만들어보자.
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또다른 Student 객체를 참조합니다.");

        System.out.println( s1 == s2 );


    }
}
