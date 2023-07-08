package ch06.sec10.exam01;

public class Example {
    static String name = "홍길동";
    static int height = 176;
    static String info;

    static {
        info = name + height;
    }

    static int push(int x, int y){
        return x + y;

    }
}
