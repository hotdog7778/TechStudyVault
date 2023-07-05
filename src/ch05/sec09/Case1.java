package ch05.sec09;

public class Case1 {
    public static void main(String[] args) {

        // Case) int[]
        System.out.println("===== Case int[] =====");
        int[] intArr1; // 배열 변수 선언
        intArr1 = new int[] {10,10,30}; // 배열 초기화

        System.out.println(intArr1);    // arr1 출력 > [I@4517d9a3 >주소값
        System.out.println(intArr1[0]); // arr1[0] 출력 > 10 > 데이터
        System.out.println(intArr1[0] == intArr1[1]); // true
        System.out.println(intArr1[0] == intArr1[2]); // false
        System.out.println();

        // Case) int[] 2
        System.out.println("===== Case int[] 2 =====");
        int[] intArr2 = new int[3];
        intArr2[0] = 10;
        intArr2[1] = 10;
        intArr2[2] = 30;  // new int(10); 은 안됌

        System.out.println(intArr2);    // 주소값
        System.out.println(intArr2[0]); // 데이터
        System.out.println(intArr2[0] == intArr2[1]); // true
        System.out.println(intArr2[0] == intArr2[2]); // false

        // int[]배열과 다른 int[]비교
        System.out.println("*** int[]배열과 다른 int[]비교 ***");
        System.out.println(intArr2 == intArr1); // false > intArr1 배열과 intArr2 배열은 서로 다른 주소를 저장
        System.out.println(intArr2[0] == intArr1[0]); // true > 값은 같지만 주소는 다른 상황
        System.out.println(intArr2[0] == intArr1[1]); // true
        System.out.println(intArr2[0] == intArr1[2]); // false
        System.out.println();

        // Case) String[]
        System.out.println("===== Case String[] =====");
        String[] strArr1; // 배열 변수 선언
        strArr1 = new String[] { "10번","10번",new String("10번")};  // 배열 초기화

        System.out.println(strArr1);    // strArr1 출력 > [Ljava.lang.String;@372f7a8d > 주소값
        System.out.println(strArr1[0]); // strArr1[0] 출력 > 10번 > 데이터
        System.out.println("** strArr1[0]의 주소값과 strArr1[1]의 주소값이 같다.");
        System.out.println(strArr1[0] == strArr1[1]); // true, 데이터가 같은건지 주소값이 같은건지 구분할 수 없다.
        System.out.println("** strArr1[0]의 주소값과 strArr1[2]의 주소값이 같다.");
        System.out.println(strArr1[0] == strArr1[2]); // false, 데이터는 같으니, 주소값이 다른것이다. 따라서, 주소값을 비교한다.
        System.out.println("** strArr1[1]의 주소값과 strArr1[2]의 주소값이 같다.");
        System.out.println(strArr1[1] == strArr1[2]);


        // Case) String[] 2
        System.out.println("===== Case String[] 2 =====");
        String[] strArr2 = new String[3];
        strArr2[0] = "10번";
        strArr2[1] = "10번";
//        strArr2[2] = "30번";
        strArr2[2] = new String("10번");

        System.out.println(strArr2);    // 주소값
        System.out.println("strArr2[0] 출력 : " + strArr2[0]); // 데이터
        System.out.println("strArr2[1] 출력 : " + strArr2[1]); // 데이터
        System.out.println("strArr2[2] 출력 : " + strArr2[2]); // 데이터
        System.out.println("[0] == [1] 비교 : " + (strArr2[0] == strArr2[1]));
        System.out.println("[0] == [2] 비교 : " + (strArr2[0] == strArr2[2]));
        System.out.println("[1] == [2] 비교 : " + (strArr2[1] == strArr2[2]));

        // string case 1,2 비교
        System.out.println(" ### strArr1 과 strArr2 비교 ###");
        System.out.println("strArr1[0] == strArr2[0] 비교 : " + ( strArr1[0] == strArr2[0] ) ); // true
        System.out.println("strArr1[0] == strArr2[1] 비교 : " + ( strArr1[0] == strArr2[1] ) ); // true
        System.out.println("strArr1[0] == strArr2[2] 비교 : " + ( strArr1[0] == strArr2[2] ) ); // false
        System.out.println("strArr1[1] == strArr2[0] 비교 : " + ( strArr1[1] == strArr2[0] ) ); // true
        System.out.println("strArr1[1] == strArr2[1] 비교 : " + ( strArr1[1] == strArr2[1] ) ); // true
        System.out.println("strArr1[1] == strArr2[2] 비교 : " + ( strArr1[1] == strArr2[2] ) ); // false
        System.out.println("strArr1[2] == strArr2[0] 비교 : " + ( strArr1[2] == strArr2[0] ) ); // false
        System.out.println("strArr1[2] == strArr2[1] 비교 : " + ( strArr1[2] == strArr2[1] ) ); // false
        System.out.println("strArr1[2] == strArr2[2] 비교 : " + ( strArr1[2] == strArr2[2] ) ); // false
        // 스트링배열을 따로따로 선언한 strArr1 와 strArr2 를 비교했을때,
        // strArr2 를 선언할때 똑같은 리터럴 배열을 재사용 하는것 같다. 총 배열요소는 6개이고, 전부 데이터는 "10번" 으로 같지만 객체는 6개가 아니라 3개다.
        System.out.println();

        // Case) String[] 3 값 목록으로 배열 생성
        String[] strArr3 = { "10번", "10번", "30번"};
        System.out.println(strArr3);
        System.out.println(strArr3[0] == strArr3[1]);
        System.out.println(strArr3[0] == strArr2[0]); // true
        System.out.println(strArr3[0] == strArr2[1]); // true
        System.out.println(strArr3[0] == strArr2[2]); // false
    }
}
