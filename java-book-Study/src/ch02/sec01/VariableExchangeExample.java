package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        // x ,y 의 값을 서로 바꿔보자
        int x = 3;
        int y = 5;
        System.out.println("X: "+x+", Y: "+y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("X: "+x+", Y: "+y);
    }
}
