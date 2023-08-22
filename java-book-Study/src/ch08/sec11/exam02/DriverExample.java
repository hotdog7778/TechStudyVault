package ch08.sec11.exam02;

interface Vehicle {
    // 추상 메서드
    void run();
}

class Driver {
    void drive(Vehicle vehicle){
        vehicle.run();
    }
}

class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스로 달립니다.");
    }
}

class Taxi implements Vehicle {
    @Override
    public void run(){
        System.out.println("택시로 달립니다.");
    }
}

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.drive(new Bus()); // 버스로 달립니다. 인터페이스 타입으로 자동 형변환 된다.
        driver.drive(new Taxi()); // 택시로 달립니다.
    }
}
