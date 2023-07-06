package ch06.sec07.exam05;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;



    // 생성자 1
    Car() {
        this("아반떼","빨강",3);
        // 생성자2의 실행문을 공유해서 사용하자.
        // 호출하고 싶은 생성자2의 매개변수 항목에 맞게 this(...) 괄호에 작성한다.
        // 그렇다면 생성자2의 실행문을 호출해 사용할 수 있다.

        // 밑에 추가할 실행문을 작성하면 호출한 생성자2의 실행문이 모두 진행되고 그다음에 진행된다.
        this.color = "추가할 실행문";

    }

    // 생성자 2
    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}