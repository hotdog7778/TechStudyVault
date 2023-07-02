package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        // 주사위 번호 하나 뽑기
        int num = ((int)(Math.random()*6)) + 1;
        String grade;
        // Switch Case 문 사용
        switch(num) {
            case 1:
                grade = "a";
                System.out.println(grade);
                break;
            case 2:
                System.out.println("2 입니다.");
                break;
            case 3:
                System.out.println("3 입니다.");
                break;
            case 4:
                System.out.println("4 입니다.");
                break;
            case 5:
                System.out.println("5 입니다.");
//                break;
            default:
                System.out.println("6 입니다.");
        }
    }
}
