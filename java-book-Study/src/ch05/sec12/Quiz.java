package ch05.sec12;

public class Quiz {
    public static void main(String[] args) {
        // 배열에서 최대값을 출력하시오 (for문 사용)
        int[] array = {1,5,3,8,2};

        int newVal = 0;
        int beforeVal = 0;

        for(int kk : array){
            newVal = kk;
            if(kk == beforeVal){
                newVal = kk;
            } else if (kk > beforeVal){
                newVal = kk;
            } else {
                newVal = beforeVal;
            }
            beforeVal = newVal;
        }

        System.out.println(newVal);

    }
}
