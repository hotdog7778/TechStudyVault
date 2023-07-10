package ch06.quiz.no20;

import ch06.sec13.exam02.package1.A;

import java.util.Scanner;

public class BankApplication {
    // 필드 선언
    private static Account[] accountArray = new Account[100]; // 유지되는 배열객체
    private static Scanner scanner = new Scanner(System.in);

    // 메인 메서드
    public static void main(String[] args) {
        // 어플리케이션 실행시 메뉴와 선택> 까지 출력
        // 반복문을 사용해서 종료 메뉴를 선택하기 전까지는 메뉴를 계속해서 보여준다.
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|종료");
            System.out.println("--------------------------------");
            System.out.print("선택> ");

            int selNum = Integer.parseInt(scanner.nextLine());

            if (selNum == 5) {
                break;
            } else if (selNum == 1) {
                // 계좌생성 메서드를 호출하자
                createAccount();
            } else if (selNum == 2) {
                getList();
            } else if (selNum == 3) {
                addAccount();
            } else if (selNum == 4) {
                minusAccount();
            } else {
                System.out.println("올바른 숫자를 입력하세요");
            }
        }
    }

    // 계좌생성 메서드
    private static void createAccount() {
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("계좌주: ");
        String owner = scanner.nextLine();
        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        // 입력받은 값을 가지고  생성자를 통해 객체를 생성하고 필드값을 초기화 한다.
        // newAccount에 저장된 주소값을 accountArray[i] 에 넣어주는 것이 목표
        // createAccount()의 호출이 끝나면 스택에 저장되어있던 newAccount에 저장된 주소값은 해제된다.
        Account newAccount = new Account(ano, owner, balance);

        // 클래스 배열을 돌면서 빈곳에 계좌를 생성.
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌목록 조회 메서드
    private static void getList() {
        System.out.println("--------");
        System.out.println("계좌 목록");
        System.out.println("--------");

        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (account != null) {
                System.out.print(account.getAno());
                System.out.print("    ");
                System.out.print(account.getOwner());
                System.out.print("    ");
                System.out.print(account.getBalance());
                System.out.println();
            } else break;
        }
    }

    // 예금 메서드 (계좌 잔액 추가)
    private static void addAccount() {
        System.out.println("--------");
        System.out.println("예금");
        System.out.println("--------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        // 계좌 비교
        Account account = checkAccount(ano);
        if (account == null) {
            System.out.println("결과:계좌가 없습니다.");
            return; // 리턴되면 메소드 종료
        }

        // 예금액 입력
        System.out.print("예금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        // 예금액에 따른 총액 플러스
        account.setBalance(account.getBalance()+balance);
        System.out.println("결과: 예금이 성공되었습니다.");
    }


    // 출금 메서드
    private static void minusAccount() {
        System.out.println("--------");
        System.out.println("출금");
        System.out.println("--------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        // 계좌 비교
        Account account = checkAccount(ano);

        if(account == null){
            System.out.println("결과:계좌가 없습니다.");
            return;
        }

        // 출금액 입력
        System.out.print("출금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        // 출금액에 따른 총액 마이너스
        account.setBalance(account.getBalance()-balance);
        System.out.println("결과: 출금이 성공되었습니다.");

    }


    // Account 배열에서 ano와 동일한 객체 찾기
    // 계좌 조회
    private static Account checkAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                String dbAno = accountArray[i].getAno(); // 변수에 현재 조회중인 계좌의 계좌번호를 저장
                if (dbAno.equals(ano)) {
                    account = accountArray[i];
                    break; // for문 종료
                }
            }
        }
        return account; // 입력한 계좌번호와 같은 계좌번호가 있는 객체 배열의 주소를 account에 저장해서 반환
    }

}
