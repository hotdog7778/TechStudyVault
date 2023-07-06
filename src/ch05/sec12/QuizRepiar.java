package ch05.sec12;

public class QuizRepiar {
    public static void main(String[] args) {
        // 배열에서 최대값을 출력하시오 (for문 사용)
        int[] array = {1,5,3,8,2};
        int max = 0;
        for(int num : array){
            if(max < num){
                max = num;
            }
        }
        System.out.println(max);

        // 배열에서 최대값을 출력하시오 (for문 사용) 삼항 조건 연산자
        int[] array2 = {1,5,3,8,2};
        int max2 = 0;
        for(int num : array2){
            max2 = (max2<num) ? (max2=num) : max2;
        }
        System.out.println(max2);
    }
}
