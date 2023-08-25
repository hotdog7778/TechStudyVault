package ch12.sec05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) throws UnsupportedEncodingException {

        // 인코딩
        // String -> 바이트 배열 만들기
        String data = "자바";
        System.out.println(data.getBytes("utf-8")); // [B@4517d9a3
        byte[] arr1 = data.getBytes();
        System.out.println(Arrays.toString(arr1));

        // 디코딩
        // 바이트 배열 -> String 만들기
        String str1 = new String(arr1, "utf-8");
        System.out.println(str1); // 자바

    }
}
