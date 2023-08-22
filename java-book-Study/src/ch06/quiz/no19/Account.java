package ch06.quiz.no19;

public class Account {
    // 필드 선언
    private int balance;
    // 상수 선언
    final static private int MIN_BALANCE = 0;
    final static private int MAX_BALANCE = 1000000;
    // 잔고 조회 Getter
    public int getBalance(){
        return balance;
    }
    // 잔고에 돈넣기, 잔고는 누적되지 않음 Setter
    public void setBalance(int balance){
        if(balance < Account.MAX_BALANCE || Account.MAX_BALANCE < balance) {
            // 예외 처리
            return;
        }
        this.balance = balance;
    }

}
