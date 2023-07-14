package ch07.quiz.exam08;

public class SnowTireExample {
    public static void main(String[] args) {

        SnowTire snowTire = new SnowTire();

        Tire tire = snowTire; // 업캐스팅. 자동형변환

        snowTire.run(); // 오버라이딩 된 메서드가 실행. 스노우 타이어가 굴러갑니다.
        tire.run(); // 자식이지만 부모것만 사용 가능하다. 하지만 오버라이딩 된 메서드는 자식걸 사용 가능. 스노우 타이어가 굴러갑니다.

    }
}
