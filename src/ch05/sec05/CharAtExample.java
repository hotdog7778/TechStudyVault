package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        // 주민등록번호에서 성별에 해당하는 7번째 문자를 읽고 남자 또는 여자인지를 출력
        String num = "920404-2014416";
        char sex = num.charAt(7);
//        System.out.println(sex);

        switch (sex) {
            case '1' :
            case '3' :
                System.out.println("남자 입니다.");
                break;
            case '2' :
            case '4' :
                System.out.println("여자 입니다.");
                break;
        }

    }
}
