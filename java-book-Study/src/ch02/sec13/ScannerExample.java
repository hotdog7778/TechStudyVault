package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // 입력. Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("X 값 입력");
        String strX = scanner.nextLine();
        int intX = Integer.parseInt(strX);

        System.out.println("Y 값 입력");
        String strY = scanner.nextLine();
        int intY = Integer.parseInt(strY);

        int result = intX + intY;
        System.out.println("X + Y : " + result);

        // while 문으로 문자열 q 를 입력할 동안 계속 입력받게 만들고 문자열을 출력하도록.

        while(true){
            String data = scanner.nextLine();
            if (data.equals("q")){
                break;
            }
            System.out.println(data);
        }

    }
}
