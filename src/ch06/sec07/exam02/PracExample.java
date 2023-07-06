package ch06.sec07.exam02;

public class PracExample {
    public static void main(String[] args) {
        Prac first = new Prac("철수", "24세");
        System.out.println(first.nation+first.name+first.age);

        Prac sec = new Prac("영수","30세");
        System.out.println(sec.nation+sec.name+sec.age);


    }
}
