package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        // gas 매개변수를 사용해서 차를 출발시켜보자.
        // setGas, isLeftGas, run 메소드를 사용하자.

        // gas 주입
        Car myCar = new Car(); // 인스턴스 생성. 세팅한 생성자가 없으니 매개변수는 필요없다
        myCar.setGas((byte) 130); // 7만큼 가스 주입

        // gas 유무 판단
        myCar.isLeftGas();

        // 차를 작동해보기
        myCar.run();

    }
}
