package ch02.sec09;

public class Examplefloat {
    public static void main(String[] args) {
        System.out.println((float)1.1 == 1.1f);  // 결과 : true
        // 이건잘 이해가 안되네

        System.out.println(0.1f == (double)0.1f);  // 결과 : true
        // double로 형변환 해봤자 정밀도는 0.1f 때랑 똑같다.

        System.out.println(0.1 == (double)0.1f);  // 결과 : false
        // (double)0.1f 는 0.1f 와 같은 정밀도임

    }
}
