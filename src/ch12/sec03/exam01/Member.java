package ch12.sec03.exam01;

public class Member {
    public String id;

    public Member(String id){
        this.id = id;
    }

//    @Override
//    // 재정의 이후에는 id 문자열을 비교하는 equals 가 되었습니다.
//    public boolean equals(Object obj){
//        if(obj instanceof Member target) { // obj 가 Member 타입인지 검사하고 맞으면 target 변수에 대입 . java12 부터 가능
//            if(id.equals(target.id)) {
//                return true;
//            }
//        }
//        return false;
//    }
    @Override
    // 재정의 이후에는 id 문자열을 비교하는 equals 가 되었습니다.
    public boolean equals(Object obj){
        if(obj instanceof Member) { // obj 가 Member 타입인지 검사하고 맞으면 target 변수에 대입
            Member target = (Member) obj;
            if(id.equals(target.id)) {
                return true;
            }
        }
        return false;
    }
}
