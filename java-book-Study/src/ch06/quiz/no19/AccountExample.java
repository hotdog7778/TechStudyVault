package ch06.quiz.no19;

import ch06.sec13.exam02.package1.A;

public class AccountExample {
    public static void main(String[] args) {
        Account account01 = new Account();

        System.out.println(account01.getBalance()); // 0

        account01.setBalance(1000);
        System.out.println(account01.getBalance()); // 1000

        Account account02 = new Account();
        System.out.println(account02.getBalance()); // 0

        account01.setBalance(-100);
        System.out.println(account01.getBalance()); // 1000, 조건에 의해 잔고값 유지

        account01.setBalance(2000000);
        System.out.println(account01.getBalance()); // 1000

        account01.setBalance(300000);
        System.out.println(account01.getBalance()); // 301000
    }
}
