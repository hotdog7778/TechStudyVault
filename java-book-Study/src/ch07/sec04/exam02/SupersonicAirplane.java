package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane{
    // 자식 클래스

    // 상수 선언
    static final int NORMAL_FLY_MODE = 1;
    static final int SUPER_FLY_MODE = 2;

    // 상태 선언
    int state = NORMAL_FLY_MODE;

    @Override
    void fly() {
        if (state == 2) {
            System.out.println("초음속 비행 합니다.");
        } else super.fly(); // 부모인 Airplane 객체의 메서드 호출
    }

}
