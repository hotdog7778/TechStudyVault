package ch06.sec08.exam04;

import ch01.sec12.Calculator;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator1 sizeCal = new Calculator1();

        // 리턴값이 있으니 변수에 저장해야한다.
        double result1 = sizeCal.run(2.5);
        System.out.println(result1);

        double result2 = sizeCal.run(2.5, 6);
        System.out.println(result2);

    }
}
