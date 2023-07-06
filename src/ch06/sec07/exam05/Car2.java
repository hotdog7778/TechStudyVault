package ch06.sec07.exam05;

public class Car2 {
    // 필드 선언
    String company = "대한민국";
    String model;
    String color;
    int maxSpeed;

    // 모두 매개변수로 받는 뭔가 가장 수용을 많이하는 생성자를 만든다.
    Car2(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // 위 생성자를 호출하는 생성자를 만들어보자
    Car2(String model) { // 매개변수로 "model"만 받는다.
        // 위 생성자 호출, 위 생성자의 매개변수 자료형에 맞게 ()안에 데이터를 작성
        this(model,"컬러",33);
    }

    Car2(){ // 매개변수로 아무것도 안받는다.
        // 위 생성자 호출, 위 생성자의 매개변수 자료형에 맞게 ()안에 데이터를 작성
        this("모델","컬러",33);
    }
}
