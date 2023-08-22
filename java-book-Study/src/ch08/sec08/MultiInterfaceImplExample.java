package ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        // 인터페이스를 사용하는 구현 클래스를 사용해서 프로그램을 동작시키기

        // 필드
        String url = "www.naver.com";

        // 리모트컨트롤 인터페이스를 사용하는 객체생성
        RemoteControl rc = new SmartTelevision();

        // 구현 메소드 호출
        rc.turnOn(); // TV를 켭니다.
        rc.turnOff(); // TV를 끕니다.

        // 서치에이블 인터페이스를 사용하는 객체생성
        Searchable searchable = new SmartTelevision();

        // 구현 메소드 호출
        searchable.search(url); // www.naver.com 를 검색합니다.
    }

}
