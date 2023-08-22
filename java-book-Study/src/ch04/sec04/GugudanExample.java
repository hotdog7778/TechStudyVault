package ch04.sec04;

public class GugudanExample {
    public static void main(String[] args) {
        // 중첩 for 문을 사용해서 구구단
        for(int m = 2; m<10; m++){
            System.out.println("*** "+ m +" 단 ***");
            for( int i = 1; i<10; i++){
                System.out.println(m+"X"+i+" = "+(m*i));
            }
        }
    }
}
