package ch12.sec03.exam03;

public class SmartPhone {
    // 필드
    private String company;
    private String os;

    // 생성자
    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    // Object 객체의 toString 메서드 오버라이딩
    @Override
    public String toString() {
        return company + "," + os;
    }

}
