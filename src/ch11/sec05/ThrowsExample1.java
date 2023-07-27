package ch11.sec05;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass(); // 예외처리를 해야하는 의무를 넘겨받았기 때문에 try-catch 사용
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.string.lang2"); // 예외 발생 코드
    }
}
