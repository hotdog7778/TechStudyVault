package ch06.quiz.no15;

public class MemberService {
    String id = "hong";
    String password = "12345";

    // 생성자
    MemberService(){}

    // 생성자 , id pass 직접 설정할 경우
    MemberService(String id, String password){
        this.id = id;
        this.password = password;
    }

    public boolean login(String id, String password){
        if((this.id).equals(id) && (this.id).equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public void logout(String id){
        System.out.println(id + " 님이 로그아웃 되었습니다.");
    }

}
