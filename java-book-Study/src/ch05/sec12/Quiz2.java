package ch05.sec12;

public class Quiz2 {
    public static void main(String[] args) {
        // 배열 항목의 전체 합과 평균을 구해 출력
        int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int totalCount = 0;
        for(int i=0; i< array.length; i++){
            // 전체 항목 숫자 변수에 저장
            totalCount += array.length;
            for(int j=0; j<array[i].length; j++){
                sum += array[i][j];
            }
        }
        double ourAvg = (double) sum / totalCount;
        System.out.println(ourAvg);

    }
}
