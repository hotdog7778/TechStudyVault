package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "920404-1014416";
        String startStr = ssn.substring(0,6);  // 6번째는 삭제됨
        String endStr = ssn.substring(7); // 7번째부터 ~ 끝까지

        System.out.println(startStr);
        System.out.println(endStr);
    }
}
