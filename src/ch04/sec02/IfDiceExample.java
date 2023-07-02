package ch04.sec02;

public class IfDiceExample {
    public static void main(String[] args) {
        // 1~6 사이 정수 랜덤
        // 0.0 <= Math.random() < 1.0

        // 1부터 시작하는 6개의 정수 중 랜덤값을 리턴
//        int num = ((int)( Math.random()*6 )) + 1;
//        System.out.println(num);

        int num = ((int)(Math.random()*6)) + 1;

        if(num == 1) {
            System.out.println("주사위 값 : 1");
        } else if(num == 2) {
            System.out.println("주사위 값 : 2");
        } else if(num == 3) {
            System.out.println("주사위 값 : 3");
        } else if(num == 4) {
            System.out.println("주사위 값 : 4");
        } else if(num == 5) {
            System.out.println("주사위 값 : 5");
        } else {
            System.out.println("주사위 값 : 6");
        }
    }
}
