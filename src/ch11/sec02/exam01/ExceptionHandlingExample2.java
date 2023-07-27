package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        // 메서드 내부에서 try-catch-fianlly 문으로 예외처리하기
        try {
            int result = data.length(); // data가 null 일 경우 NullpointerExcetion이 발생한다.
            System.out.println("문자수: " + result);
        } catch (NullPointerException e) { // NullPointerException(예외클래스) 의 객체 를 생성해준다
            // e.getMessage(); ** 예외가 발생한 이유를 리턴
            // e.toString(); ** 예외가 발생한 이유 + 예외의 종류 를 리턴
            // e.printStackTrace(); ** 예외가 발생한 이유 + 예외의 종류 + 어디서 발생했는지 추적한 내용 을 리턴
            System.out.println(e.getMessage());

        } finally {
            System.out.println("finally 블록입니다.");
        }
    }

    public static void main(String[] args) {
        System.out.println(" 프로그램 시작 ");
        printLength("123"); // 문자수: 3
        printLength(null); // NullPointerException 발생
        System.out.println(" 프로그램 종료 ");
    }
}
