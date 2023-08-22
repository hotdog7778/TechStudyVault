package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) {
        // 1에서 10 사이의 수 중에서 짝수만 출력하고 홀수인 경우에는 다음 반복으로 넘어간다.
        for(int i = 1; i < 11; i++){
            if( i%2 == 1){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
