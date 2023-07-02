package ch04.sec06;
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        // 키보드로 입력받은 내용을 조사하여 계속 반복할것인지 여부를 판단한다.
        System.out.println("프로그램을 시작합니다. 메시지를 입력하세요. [종료는 q 키를 누르세요]");

        Scanner scanner = new Scanner(System.in);
        String InputStr;

        // do - while 문 활용
        do {
            System.out.print(">");
            InputStr = scanner.nextLine();
            System.out.println("입력하신 내용은 " + InputStr + " 입니다.");
        } while (! InputStr.equals("q"));

        System.out.println("프로그램을 종료합니다.");
    }
}
