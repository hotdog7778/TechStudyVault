package ch06.sec08.exam03;

public class Car {
    // 필드 선언
    byte gas;

    // 리턴값은 없고 매개변수를 받는 메소드
    // gas 필드값 선언
    void setGas(byte gas){
        this.gas = gas;
        System.out.println("가스를 "+gas+"만큼 충전하였습니다.");
        System.out.println();
    }

    // boolean 리턴값이 있고, 매개변수가 없는 메소드
    // 가스가 있는지 없는지 판단.
    boolean isLeftGas(){
        if (gas <= 0){
            System.out.println("현재 가스가 없습니다.");
            System.out.println();
            return false;
        }
        System.out.println("현재 가스 잔량 : " + gas);
        System.out.println();
        return true;
    }

    // 리턴값이 없고, 매개변수가 없는 메서드
    // 계속 달리다가 가스값이 없어지면 return문으로 메소드 종료
    void run() {
        while(true){
            if(gas > 0) {
                System.out.println("----------run 메서드 실행-------------");
                gas -= 1;
                System.out.println("----------남은 가스량 : "+gas+"-------------");
                System.out.println();
            } else {
                System.out.println("----------run 메서드 실행-------------");
                System.out.println("가스가 없어서 출발할 수 없습니다.");
                return; // 메소드 종료
            }
        }
    }
}
