package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        // 구현객체를 인터페이스형으로 자동변환
        Vehicle vehicle = new Bus();

        // vehicle 객체에서 구현 메서드를 사용
        vehicle.methodVehicle();

        // vehicle 객체에서 Bus의 일반 메서드를 사용
        // vehicle.methodBus(); // 컴파일 에러

        // vehicle 객체에서 Bus의 일반 메서드를 사용할 수 없는걸 확인했다.
        // 다시 강제 형변환을 시켜서 Bus의 메서드를 사용할 수 있게 해보자
        Bus bus = (Bus) vehicle;

        bus.methodVehicle();
        bus.methodBus();
    }
}
