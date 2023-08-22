package ch08.sec11.exam01;

public class Car {
    // 필드를 사용해서 다형성 구현
    Tire tire;

    public void run(){
        tire.roll();
    }

}
