package ch06.sec08.exam04;

public class Calculator1 {
    // 메소드 오버로딩을 사용해서 정사각형과 직사각형의 넓이를구할 수 있는 코드를 만들어보자

    // 매번 다른 계산을 해야하니 필드는 선언하지 않는다.

    // 정사각형 케이스
    double run(double x) {
        return x * x;
    }

    // 직사각형 케이스
    double run(double x, double y) {
        return x * y;
    }
}
