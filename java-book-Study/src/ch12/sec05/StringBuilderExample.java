package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {

        // StringBuilder 객체에 저장후 toString 으로 결과 얻는 방법
        StringBuilder sb = new StringBuilder()
                .append("나는")
                .insert(2, "humanAB")
                .delete(7, 9) // 시작위치, 끝위치
                .append(" 아닙니다.");

        String result = sb.toString();
        System.out.println(result); // 나는human 아닙니다.

        // 바로 스트링 변수에 저장하는 방법
        String result2 = new StringBuilder()
                .append("나는")
                .insert(2, "humanAB")
                .delete(7, 9) // 시작위치, 끝위치
                .append(" 아닙니다.")
                .toString();
        System.out.println("====================");
        System.out.println(result); // 나는human 아닙니다.

    }
}
