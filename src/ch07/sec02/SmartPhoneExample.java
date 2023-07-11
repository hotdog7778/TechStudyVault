package ch07.sec02;

public class SmartPhoneExample {

    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone mySmartPhone = new SmartPhone("갤럭시","블랙");

        // Phone 으로부터 상속받은 필드 읽기
        System.out.println(mySmartPhone.model);
        System.out.println(mySmartPhone.color);

        // SmartPhone 의 필드 읽기
        System.out.println("와이파이 상태 : "+mySmartPhone.wifi);

        // Phone 으로부터 상속받은 메서드 호출
        mySmartPhone.bell();
        mySmartPhone.sendVoice("여보세요");
        mySmartPhone.receiveVoice("누구세요");
        mySmartPhone.hangUp();

        // SmartPhone 의 메서드 호출
        mySmartPhone.setWifi(true);
        mySmartPhone.internet();
    }
}
