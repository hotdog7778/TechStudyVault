package ch09.sec07.exam02;

public class HomeExample {
    public static void main(String[] args) {
        Home myHome = new Home();

        myHome.use1();

        myHome.use2();

        myHome.use3(new RemoteControl() {
            @Override
            public void turnOn(){
                System.out.println("냉장고를 켭니다");
            }
            @Override
            public void turnOff(){
                System.out.println("냉장고를 끕니다.");
            }
        });
    }
}
