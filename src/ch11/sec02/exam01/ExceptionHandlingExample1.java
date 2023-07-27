package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {

    public static void printLength(String data) {
        int result = data.length(); // data가 null 일 경우 NullpointerExcetion이 발생한다.
        System.out.println("문자수: " + result);
    }

    public static void main(String[] args) {
        System.out.println(" 프로그램 시작 ");
        printLength("123"); // 문자수: 3
        printLength(null); // NullPointerException 발생
        System.out.println(" 프로그램 종료 ");
    }
}
