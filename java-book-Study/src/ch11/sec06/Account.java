package ch11.sec06;

// 기능 구현
public class Account {
    private long balance; // 잔고

    // 생성자
    public Account() {}

    // 잔고 호출 게터
    public long getBalance() {
        return balance;
    }

    // 입금 메서드
    public void deposit(int money){
        balance += money;
    }

    // 출금 메서드 (잔고보다 출금액이 클경우 예외처리 필요)
    public void withdraw(int money) throws InsufficientException{
        if (money > balance) {
            throw new InsufficientException("예외 메세지: 잔고가 부족합니다.");
        }
        balance -= money;
    }
}
