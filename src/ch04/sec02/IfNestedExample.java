package ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {
        // 81 <= ~ <= 100 중에서 하나의 점수를 뽑는다.
        // 뽑은 점수를 조건식으로 a+, a, b+, b 식으로 출력
        int num = ((int)(Math.random()*20)) + 81;
        // 81 <= x < 101
        System.out.println("이번 숫자는 : "+num);

        String grade;

        if( num >= 90 ) {
            if (num > 95){
                grade = "A+";
                System.out.println(grade);
            } else {
                grade = "A";
                System.out.println(grade);
            }
        } else {
            if (num > 85){
                grade = "B+";
                System.out.println(grade);
            } else {
                grade = "B";
                System.out.println(grade);
            }
        }
    }
}
