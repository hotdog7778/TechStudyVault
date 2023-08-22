package ch07.sec10;

public class SmartPhone extends Phone {
    // 생성자
    SmartPhone(String owner){
        super(owner);
    }

    // 메소드 선언
    public void InternetSearch(){
        System.out.println("인터넷 검색 합니다.");
    }
}
