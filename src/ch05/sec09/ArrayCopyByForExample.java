package ch05.sec09;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        // 배열은 생성후 길이를 변화시킬수 없다.
        // 3길이의 배열을 5길이로 변화시키고 싶다면,
        // 새로운 배열을 만들어 기존의 배열을 복사해 넣어야 한다.
        // 보통 for문을 활용해서 항목을 하나씩 읽고 새로운 배열에 저장한다.

        // 길이3 배열
        int[] oldIntArray = { 1, 2, 3};
        // 길이5 배열을 새로 생성
        int[] newIntArray = new int[5];

        // 배열 항목 복사 (for문)
        for(int i=0; i < oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
        }

        // 배열 항목 복사 (arraycopy)
        // 원본, 인덱스, 사본, 인덱스, 카피길이
        System.arraycopy(oldIntArray, 0,newIntArray,0,oldIntArray.length);

        // 배열 항목 출력
        for(int i=0; i<newIntArray.length; i++){
            System.out.print(newIntArray[i]+" ");
        }

    }
}
