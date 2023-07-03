package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location); // 3 (인덱스 값)
        String cutSubject = subject.substring(location);
        System.out.println(cutSubject); // 프로그래밍

        System.out.println(subject);

        location = subject.indexOf("자바");
        if(location == -1){
            System.out.println("자바와 관련 없는 책이군요");
        } else {
            System.out.println("자바와 관련 있는 책이군요");
        }

        boolean val = subject.contains("자바");
        if(val){
            System.out.println("자바와 관련 있는 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }
    }
}
