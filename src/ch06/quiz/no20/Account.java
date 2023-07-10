package ch06.quiz.no20;

import java.security.PublicKey;

public class Account {
    // 필드 선언
    private String ano;
    private String owner;
    private int balance;
    // 생상자 선언
    public Account(String ano, String owner, int balance){
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }
    // Getter Setter
    public String getAno(){
        return ano;
    }
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
    public void setAno(String ano){
        this.ano = ano;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}
