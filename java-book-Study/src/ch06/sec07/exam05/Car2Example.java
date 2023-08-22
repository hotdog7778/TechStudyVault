package ch06.sec07.exam05;

public class Car2Example {
    public static void main(String[] args) {
        Car2 myCar2 = new Car2();
        System.out.println(myCar2.model);
        System.out.println(myCar2.color);
        System.out.println(myCar2.maxSpeed);

        Car2 myCar2_1 = new Car2("소나타");
        System.out.println(myCar2_1.model);
        System.out.println(myCar2_1.color);
        System.out.println(myCar2_1.maxSpeed);
    }
}
