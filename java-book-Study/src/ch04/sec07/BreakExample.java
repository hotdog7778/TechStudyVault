package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) {
        // 주사위 중 6이 나오면 프로그램을 종료
        while(true){
            int numRandom = (int)(Math.random()*6) + 1;
            System.out.println(numRandom);
            if (numRandom == 6){
                break;
            }
        }
        System.out.println("프로그램 종료");

    }
}
