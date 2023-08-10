package ch12.sec03.exam02;

public class HashCodeExample {
    public static void main(String[] args) {
        Student student1 = new Student(1, "홍길동");
        Student student2 = new Student(1, "홍길동");
        Student student3 = new Student(3, "홍길동");

        // 재정의한 hashCode 와 equals 를 사용해서 동등비교 하기
        if (student1.hashCode() == student2.hashCode()) {
            if (student1.equals(student2)){
                System.out.println("동등합니다.");
            } else {
                System.out.println("equals의 결과가 false 입니다.");
            }
        } else {
            System.out.println("해쉬코드가 다릅니다.");
        }

    }
}
