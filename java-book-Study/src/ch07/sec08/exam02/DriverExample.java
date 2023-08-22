package ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {

        Driver driver = new Driver();

//        Vehicle vehicle = new Vehicle();  // Vehicle 의 run 메서드 실행
//        Vehicle vehicle = new Bus();      // Bus 의 run 메서드 실행
//        Vehicle vehicle = new Taxi();       // Taxi 의 run 메서드 실행
//        driver.play(vehicle);

        // 구지 위처럼 안해도
        Bus bus = new Bus();
        driver.play(bus); // play 메서드에서 받을때 자동 형변환 된다.

        Taxi taxi = new Taxi();
        driver.play(taxi);


    }
}
