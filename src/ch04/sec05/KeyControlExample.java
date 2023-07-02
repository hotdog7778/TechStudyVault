package ch04.sec05;
import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        // 1,2를 입력했을 때 속도를 증속, 감속시키고 3을 입력하면 프로그램을 종료
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while(run){
            System.out.println("------------------------------");
            System.out.println("|  1. 증속 | 2. 감속 | 3. 중지  |");
            System.out.println("------------------------------");
            System.out.print("입력 : ");

            String InputStr = scanner.nextLine();

            if (InputStr.equals("1")){
                speed++;
                System.out.println("현재속도는 : " + speed);
            } else if (InputStr.equals("2")){
                speed--;
                System.out.println("현재속도는 : " + speed);
            } else if (InputStr.equals("3")){
                run = false;
                System.out.println("프로그램을 중지합니다.");
            }
        }
    }
}
