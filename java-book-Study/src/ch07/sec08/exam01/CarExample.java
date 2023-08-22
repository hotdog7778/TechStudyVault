package ch07.sec08.exam01;

public class CarExample {

    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();
        System.out.println(myCar.tire); // 현재 Tire 클래스형 필드 tire 에는 Null 값이 있다.

        // tire 가 가리키는 곳을 (상태값을) FirstTire 로 바꿔보자 [타이어부품을 FirstTire 로 장착]
        myCar.tire = new FirstTire(); // 자동 형변환
        // 부모객체 = 자식객체
        // tire 에는 FirstTire 객체의 주소값이 저장된다.
        // tire ----> FirstTire 의 객체 (자식객체)
        // tire 은 Tire 형(부모클래스) 이므로 자식클래스인 FirstTire 는 자동형변환되어
        // tire 는 부모클래스 형식 이지만 자식클래스의 오버라이딩된 메서드를 사용하게 된다.
        System.out.println(myCar.tire); // 주소값. 자식인 FirstTire 객체의 주소일 것임.
        myCar.run(); // tire.roll() 이 수행된다. --> FirstTire 의 roll() 이 실행된다.

        // 부품을 SecTire로 바꿔보자
        // 바라보는 객체를 바꾼것이니까 부품을 바꾼것과 같다.
        myCar.tire = new SecTire(); // 자동 형변환. 부모:Tire, 자식:SecTire
        System.out.println(myCar.tire); // 주소값. SecTire 객체의 주소일 것임.
        myCar.run();

        // 그냥 Tire로 부품 교체
        myCar.tire = new Tire();
        myCar.run();

    }
}
