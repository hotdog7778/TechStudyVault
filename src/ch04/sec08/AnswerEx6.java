package ch04.sec08;
import java.util.Scanner;

public class AnswerEx6 {
    public static void main(String[] args) {

        int sum = 0;

        while (true) {
            System.out.println();
            System.out.println("----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------------");
            System.out.print("선택>");

            Scanner scanner = new Scanner(System.in);
            String inputNum = scanner.nextLine();

            if (inputNum.equals("1")) {
                System.out.print("예금액>");
                String inputNum1 = scanner.nextLine();
                // string을 int 로 바꿔서 저장
                sum += Integer.parseInt(inputNum1);
            } else if (inputNum.equals("2")) {
                System.out.print("출금액>");
                String inputNum1 = scanner.nextLine();
                sum -= Integer.parseInt(inputNum1);
            } else if (inputNum.equals("3")) {
                System.out.print("잔고>");
                System.out.println(sum);
            } else {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
