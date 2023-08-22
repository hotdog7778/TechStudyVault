package ch09.quiz.q6;

public class Anonymous {

    // 익명 구현객체를 필드에 대입해서 사용
    Vehicle field = new Vehicle(){
        @Override
        public void run(){
            System.out.println("자전거가 달립니다.");
        }
    };

    // 익명 구현객체를 로컬 변수에 대입해서 사용
    void method1() {
        Vehicle localVar = new Vehicle(){
            @Override
            public void run(){
                System.out.println("승용차가 달립니다.");
            }
        };
        localVar.run();
    }

    // 익명 구현객체를 매개값에 대입해서 사용
    void method2(Vehicle v){
        v.run();
    }
}
