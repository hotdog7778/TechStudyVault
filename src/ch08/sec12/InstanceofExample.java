package ch08.sec12;

interface Vehicle {
    void run();
}

class Bus implements Vehicle {
    @Override
    public void run(){
        System.out.println("버스가 달립니다.");
    }
}

class Taxi implements Vehicle {
    @Override
    public void run(){
        System.out.println("택시가 달립니다.");
    }

    public void CheckFare() {
        System.out.println("승차요금을 확인합니다.");
    }
}

public class InstanceofExample {
    public static void main(String[] args) {
        // 버스와 택시로 달리는것 구현. 자동형변환 사용
        driver(new Bus());
        driver(new Taxi());
    }

    // 인터페이스를 매개변수로 받는 메서드 선언
    public static void driver(Vehicle vehicle){
        if (vehicle instanceof Taxi) {
            // 강제 형변환
            Taxi taxi = (Taxi) vehicle;

            // CheckFare 메서드 실행
            taxi.CheckFare();
        }
        vehicle.run();
    }

}
