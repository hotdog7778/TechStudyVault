package ch04.sec08;

public class AnswerEx5 {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++ ){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
                if(i == j) {
                    System.out.println();
                }
            }
        }

    }
}
