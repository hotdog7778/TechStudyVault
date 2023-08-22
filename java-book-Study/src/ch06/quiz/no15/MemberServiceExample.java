package ch06.quiz.no15;

public class MemberServiceExample {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong","12345");

        if(result){
            System.out.println("로그인이 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("아이디 또는 패스워드가 틀렸습니다.");
        }



    }
}
