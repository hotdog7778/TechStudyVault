package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        // 인스턴스 생성
        SupersonicAirplane ap = new SupersonicAirplane();

        // 메소드 호출
        ap.land();
        ap.fly();
        ap.takeOff();

        // 오버라이딩한 메서드 호출
        ap.state = SupersonicAirplane.SUPER_FLY_MODE;
        ap.fly();

    }
}
