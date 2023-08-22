package ch05.sec10;

public class AdvanceForExample {
    public static void main(String[] args) {
        // 배열변수 선언과 배열생성
        int[] scores = { 95, 71, 84, 93, 87};

        // 배열 항목 전체 합 구하기
        int sum = 0;
        for(int score:scores){
            sum += score;
        }

        // 배열 항목 전체 평균 구하기
        double totalAvg = (double) sum / scores.length;

        // 평균값 출력하기
        System.out.println(totalAvg);
    }
}