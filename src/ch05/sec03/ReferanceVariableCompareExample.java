package ch05.sec03;

public class ReferanceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1,2,3};
        arr2 = new int[] {1,2,3};
        arr3 = arr2; // arr3는 arr2가 참조하는 배열을 참조한다.

        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);

        int[] arry1 = null;
        arry1[0] = 10; //
    }
}
