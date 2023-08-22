package ch09.sec06.exam01;

public class Button {
    // 정적 중첩 인터페이스
    public static interface ClickListener {
        // 추상 메서드
        void onClick();
    }

    // 필드
    private ClickListener clickListener; // 인터페이스 타입의 필드 선언

    // 메서드
    public void setClickListener (ClickListener clickListener){  // 매개변수로 인스턴스 타입을 받음
        this.clickListener = clickListener;
    }

    // Button 이 클릭되었을 때 실행하는 메소드 선언
    public void click() {
        this.clickListener.onClick();
    }

}
