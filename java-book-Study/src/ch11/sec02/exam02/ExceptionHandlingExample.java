package ch11.sec02.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Class.forName("패키지...클래스") 는 주어진 클래스를 찾는 코드 이다.
            Class.forName("java.lang.String"); // 예외가 발생할 수도 있는 코드
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Class.forName("java.lang.String2"); // 예외가 발생할 수도 있는 코드
            System.out.println("java.lang.String2 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
