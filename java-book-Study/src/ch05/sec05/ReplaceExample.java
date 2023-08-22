package ch05.sec05;

public class ReplaceExample {
    public static void main(String[] args) {
        String orgStr = new String("자바 프로그래밍, 자바 문자열");
        String replaceStr = orgStr.replace("자바","JAVA");

        System.out.println(replaceStr); // JAVA 프로그래밍, JAVA 문자열
        System.out.println(orgStr == replaceStr); // false, 자바 문자열은 수정할 수 없다. 따라서 replace 메소드의 결과로 나오는 값들은 수정된 것이 아니라 새로 생성된것. 서로 다른 주소를 가리키는게 맞다.
    }
}
