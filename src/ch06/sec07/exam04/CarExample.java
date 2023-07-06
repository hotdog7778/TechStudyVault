package ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        // 객체생성 1
        Car car1 = new Car();
        // 객체생성 2
        Car car2 = new Car("소나타");
        // 객체생성 3
        Car car3 = new Car("소나타","빨강");
        // 객체생성 4
        Car car4 = new Car("소나타","빨강",10);

        System.out.println( car1.model ); // 생성자는 String 변수에 값을 대입해주지 않으면 null로 초기화 해준다.
        System.out.println( car1.model == car2.model ); // false, car1이 가리키는 객체는 model값이 기본값, car2가 가리키는 객체는 model값이 소나타 이다.
        System.out.println( car2.color); // null
        System.out.println( car2.color == car3.color); // false

        System.out.println( car2.model);
        System.out.println( car2.color);
        System.out.println( car2.maxSpeed);

        System.out.println(car1.model == car1.company);

    }
}
