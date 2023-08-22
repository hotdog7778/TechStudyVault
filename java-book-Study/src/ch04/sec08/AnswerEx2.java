package ch04.sec08;

public class AnswerEx2 {
    public static void main(String[] args) {
        // for문, 1 ~ 100 까지 정수, 3의 배수의 총합, 출력
        int sum = 0;

        for (int i = 1; i < 101; i++){
            if(i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
