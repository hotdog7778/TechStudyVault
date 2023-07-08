package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        Korean userInfo = new Korean("고길동","990101-1011111");

        System.out.println(userInfo.nation);
        System.out.println(userInfo.name);
        System.out.println(userInfo.ssn);
    }
}
