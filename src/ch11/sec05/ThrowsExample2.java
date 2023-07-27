package ch11.sec05;

public class ThrowsExample2 {
    public static void main(String[] args) throws Exception {
        findClass(); // 예외처리 의무를 넘겨받았으니 try-catch 로 예외 처리를 하면 되지만,
                     // 한번더 throws 로 의무를 넘겨보자
                     // 그럼 예외처리를 해야할 의무는 JVM 에게 있다.
    }
    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2"); // 예외 발생 코드
    }
}
