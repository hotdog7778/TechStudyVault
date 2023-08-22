package ch07.sec10;

// abstract 로 부모 클래스 만들기
public abstract class Phone {
    // 필드 선언
    String owner;

    // 생성자 선언
    public Phone(String owner){
        this.owner = owner;
    }

    // 메소드 선언
    void turnOn(){
        System.out.println("전원을 켭니다.");
    }
    void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
