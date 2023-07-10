package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();

        // 잘못된 속도 변경
        // Setter 와 speed 를 이용해보자
        myCar.setSpeed(-50);
        System.out.println(myCar.getSpeed());


        // 올바른 속도 변경
        myCar.setSpeed(100);
        System.out.println(myCar.getSpeed());

        // 멈춤
        System.out.println(myCar.isStop());
        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("현재 속도" + myCar.getSpeed());
    }
}
