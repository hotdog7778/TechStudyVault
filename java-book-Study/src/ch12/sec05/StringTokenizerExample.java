package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
    
        String str = "홍길동-김성수&박자바";
        String[] arr = str.split("-|&");

        for(String token : arr) {
            System.out.println(token);
        }


        String data = "홍길동/김성수/박자바";
        StringTokenizer st = new StringTokenizer(data, "/");

        // 토큰은 구분자로 구분된 각 문자를 의미하며, hasMoreTokens() 로 토큰이 있는지 판별한다.
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    
    }
}
