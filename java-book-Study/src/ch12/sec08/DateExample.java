package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.*;

// 현재 시간을 원하는 문자열로 얻고 싶다면 SimpleDateFormat 클래스와 Date 클래스를 함께 사용
// "년.월.일 시:분:초" 형식으로 얻어보기
public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        String str1 = now.toString();

        System.out.println(str1); // Tue Aug 29 19:03:48 KST 2023


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String str2 = sdf.format(now);

        System.out.println(str2); // 2023.08.29 19:03:48
    }
}
