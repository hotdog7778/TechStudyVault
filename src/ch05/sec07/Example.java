package ch05.sec07;

public class Example {
    public static void main(String[] args) {
        int[][] score = {
            {70, 87, 77, 88},  // 1차원 배열의 0 인덱스에 점수들
            {30, 25, 40 }  // 1차원 배열의 1 인덱스에 점수들
        };

        // 0반과 1반의 점수 출력
        for(int i = 0; i< score.length; i++){
            for(int j=0; j<score[i].length; j++){
                System.out.print(score[i][j]+" ");
            }
            System.out.println();
        }
    }
}
