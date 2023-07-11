package ch07.sec04.exam01;

import ch06.sec13.exam02.package2.C;

public class ComputerExample {
    // 메인 메소드포함 클래스

    public static void main(String[] args) {
        int r = 10;

        Calculator cal = new Calculator();
        // cal.areaCircle(r);  // 매개변수는 dobule 형인데 인수는 int형이고, 근데 에러가 안나는 이유는 뭐지
        System.out.println(cal.areaCircle(r));

        Computer com = new Computer();
        System.out.println(com.areaCircle(r));
    }
}
