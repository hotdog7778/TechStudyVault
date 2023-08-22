package ch11.sec06;

// 예외 클래스
public class InsufficientException extends Exception { // Exception 은 일반예외와 실행예외의 부모입니다.
    // 생성자
    public InsufficientException() {}

    public InsufficientException(String message){
        super(message); // 객체생성시 전달받은 message 를 부모 예외객체에게 넘깁니다. message 는 getMessage()의 리턴값으로 쓰입니다.
    }
}
