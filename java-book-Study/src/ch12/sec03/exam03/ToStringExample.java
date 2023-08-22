package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("애플", "mac");

        System.out.println("myPhone = " + myPhone.toString());

        System.out.println("123"); // System.out.println() 메소드는 기본타입 + 문자열은 그냥 출력
        System.out.println(myPhone); // myPhone은 객체이니까 이 객체의 toString() 메서드를 호출해서 리턴값을 출력한다.
    }
}
