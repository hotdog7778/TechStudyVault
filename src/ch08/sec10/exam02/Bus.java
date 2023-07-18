package ch08.sec10.exam02;

public class Bus implements Vehicle{
    // 추상메서드를 구현
    public void methodVehicle(){
        System.out.println("이동합니다.");
    }

    // 자기자신의 메서드를 구현
    public void methodBus(){
        System.out.println("버스로 이동합니다.");
    }
}
