package ch09.sec07.exam03;

import ch09.sec06.exam01.Button;

public class ButtonExample {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btnOk = new Button();

        // Ok버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new Button.ClickListener(){
            @Override
            public void onClick(){
                System.out.println("OK 버튼 클릭");
            }
        });

        // Ok버튼 클릭하기
        btnOk.click();

        //------------------

        // Cancel 버튼 객체 생성
        Button btnC = new Button();

        btnC.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼 클릭");
            }
        });

        // Cancel 버튼 클릭
        btnC.click();

    }
}
