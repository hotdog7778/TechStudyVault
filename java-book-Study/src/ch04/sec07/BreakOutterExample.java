package ch04.sec07;

public class BreakOutterExample {
    public static void main(String[] args) throws Exception{
        ExampleLabel: for(char upper='A'; upper <='Z'; upper ++){
            for(char lower='a'; lower <= 'z'; lower++){
                System.out.println(upper+"--"+lower);
                if(lower == 'g'){
                    break ExampleLabel;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
