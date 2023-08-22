package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        // 한국 타이어 객체를 Tire 인터페이스 타입으로 자동변환
        myCar.tire = new HankookTire();
        myCar.run(); // 한국타이어로 달립니다.

        // 금호타이어 객체로 교체
        myCar.tire = new KumhoTire();
        myCar.run(); // 금호타이어로 달립니다.
    }
}
