package ch03.sec11;

public class example {
    public static void main(String[] args) {
        int myGrade = 85;
        String grade1 = (myGrade > 90) ? "A등급" : "A등급 미만입니다.";
        String grade2 = (myGrade > 90) ? "A등급" : (myGrade > 80 ? "B등급" : "C등급");

        System.out.println("내점수는 : " + myGrade + " 내 등급은 : " + grade1);
        System.out.println("내점수는 : " + myGrade + " 내 등급은 : " + grade2);
    }
}
