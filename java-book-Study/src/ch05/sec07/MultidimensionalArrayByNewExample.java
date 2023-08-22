package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        // 각 반의 학생 수가 3명으로 동일한 경우 점수 저장을 위한 2차원 배열 생성
        int[][] mathScores = new int[2][3];
        // 배열 항목 초기값 출력
        for(int i=0; i<mathScores.length; i++){
            for(int j=0; j<mathScores[i].length; j++){
                System.out.println(mathScores[i][j]);
            }
        }
        // 배열 항목 값 변경
        mathScores[0][0] = 33;
        mathScores[0][1] = 43;
        mathScores[0][2] = 53;
        mathScores[1][0] = 66;
        mathScores[1][1] = 76;
        mathScores[1][2] = 86;


        // 전체 학생의 수학 평균 구하기
        int totalMathSum = 0;
        int totalMathStudents = 0;
        for(int i=0; i<mathScores.length; i++){
            totalMathStudents += mathScores[i].length;
            for(int j=0; j<mathScores[i].length; j++){
                totalMathSum += mathScores[i][j];
            }
        }
        double mathAvg = (double) totalMathSum / totalMathStudents;
        System.out.println(mathAvg);

        // 각 반의 학생수가 다를 경우 점수 저장을 위한 2차원 배열을 생성
        int[][] engScores = new int[2][];
        engScores[0] = new int[3];
        engScores[1] = new int[4];
        // 배열 항목 초기값 출력
        for(int i=0; i<engScores.length; i++){
            for(int j=0; j<engScores[i].length; j++){
                System.out.println(engScores[i][j]);
            }
        }
        // 배열 항목 값 변경
        engScores[0][0] = 11;
        engScores[0][1] = 12;
        engScores[0][2] = 21;
        engScores[1][0] = 78;
        engScores[1][1] = 44;
        engScores[1][2] = 15;
        engScores[1][3] = 81;
        // 전체 학생의 영어 평균 구하기
        int totalEngSum = 0;
        int totalEngStudents = 0;
        for(int i=0; i<engScores.length; i++){
            totalEngStudents += engScores.length;
            for(int j=0; j<engScores[i].length; j++){
                totalEngSum += engScores[i][j];
            }
        }
        double engAvg = (double) totalEngSum / totalEngStudents;
        System.out.println(engAvg);
    }
}
