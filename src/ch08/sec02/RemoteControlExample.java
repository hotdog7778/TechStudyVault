package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {

        // 인터페이스 변수에 구현클래스의 객체주소 대입
        RemoteControl rc = new Television();

        // 오버라이딩한 turnOn 메서드 호출
        rc.turnOn();

        // 구현클래스에만 있는 메서드 호출
        // rc.normal(); // 컴파일 에러

        // 구현래스에만 있는 필드 호출
        // rc.testPoint; // 컴파일 에러

    }
}
