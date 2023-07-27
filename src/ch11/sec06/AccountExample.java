package ch11.sec06;

// 기능 사용하는 프로그램
public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);

        account.getBalance();

        // 잔고보다 많은 양을 출금
        // account.withdraw(30000); // 넘겨받은 예외처리를 해야 한다. JVM 에게 넘겨버리자
        // 직접 예외 처리하는 코드
        try {
            account.withdraw(30000);
        } catch (InsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
