package ch09.sec06.exam01;

public class ButtonExample {
    public static void main(String[] args) {
        // OK 버튼 객체 생성
        Button btnOk = new Button();

        // onClick 하면 어떻게 할건지. >> OK 함 >> 구현 클래스 (로컬 클래스)
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick(){
                System.out.println("OK");
            }
        }

        // 세터로 클릭의 반응을 어떤 객체로 할것인지 정하기.
        btnOk.setClickListener(new OkListener());

        // 객체 자신의 오버라이딩된 onClick 메서드를 호출 합니다.
        btnOk.click();

        // onClick 하면 어떻게 할건지. >> Cancel 함 >> 구현 클래스 (로컬 클래스)
        class CancelListener implements Button.ClickListener {
            // 추상메서드를 구현합니다.
            @Override
            public void onClick(){
                System.out.println("Cancel");
            }
        }

        // btnCancel 객체를 생성합니다.
        Button btnCancel = new Button();
        // 세터로 CancelListener 세팅을 합니다.
        btnCancel.setClickListener(new CancelListener());
        // 객체 내에서 오버라이딩된 onClick 메서드를 실행하는 click 메서드를 실행합니다.
        btnCancel.click();

    }
}
