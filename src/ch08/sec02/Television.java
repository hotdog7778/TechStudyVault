package ch08.sec02;

public class Television implements RemoteControl{
    // 필드
    private int testPoint;

    @Override
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }

    public void normal(){
        System.out.println("normal 메서드");
    }



}
