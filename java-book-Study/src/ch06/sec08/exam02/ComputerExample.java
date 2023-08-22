package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {

        // 객체 생성
        Computer com = new Computer();

        // 값을 바로 넘겨주기
        int sum = com.sum(13, 14, 15, 16);

        // 배열을 넘겨주기
        int[] values = {1,2,3,4,5};
        sum = com.sum(values);

        // 배열을 넘겨주기(new)
        sum = com.sum(new int[] {1,3,5,7,9,10});

        System.out.println(sum);


    }
}
