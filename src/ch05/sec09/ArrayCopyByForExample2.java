package ch05.sec09;

public class ArrayCopyByForExample2 {
    public static void main(String[] args) {
        // 길이3인 string 배열을 길이5로 만들어라.

        // 길이3 스트링 배열 선언(원본)
        String[] oldStr = { "김","태","균" };
        // 길이5 스트링 배열 생성(새통)
        String[] newStr = new String[5];

        // 배열 복사 arraycopy 활용
        System.arraycopy(oldStr,0,newStr,0,oldStr.length);

        // 배열 출력
        for(int i=0; i<newStr.length; i++){
            System.out.print(newStr[i]+", ");
        }
    }
}
