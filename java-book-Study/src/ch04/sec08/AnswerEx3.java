package ch04.sec08;

public class AnswerEx3 {
    public static void main(String[] args) {

//        while (true) {
//            int num1 = ((int)(Math.random()*6)) + 1 ;
//            int num2 = ((int)(Math.random()*6)) + 1 ;
//            System.out.println("(" + num1 + ", " + num2 + ")");
//            if( (num1 + num2) == 5){
//                break;
//            }
//        }

        int num2;
        int num1;
        do {
            num1 = ((int) (Math.random() * 6)) + 1;
            num2 = ((int) (Math.random() * 6)) + 1;
            System.out.println("(" + num1 + ", " + num2 + ")");
        } while ((num1 + num2) != 5);

//
//        int num1 = ((int)(Math.random()*6)) + 1 ;
//        int num2 = ((int)(Math.random()*6)) + 1 ;
//        System.out.println("(" + num1 + ", " + num2 + ")");


    }
}
