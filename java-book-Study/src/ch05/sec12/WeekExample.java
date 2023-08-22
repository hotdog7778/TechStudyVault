package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        // Calendar 이용해보기

        // Week 열거 타입 변수 선언
        Week myWeek = null;
        // Calendar 얻기
        Calendar cal = Calendar.getInstance();
        // 오늘의 요일 얻기(1~7)
        int week = cal.get(Calendar.DAY_OF_WEEK);
        // 숫자를 열거 상수로 변환해서 변수에 대입
        switch (week){
            case 1 : myWeek = Week.MONDAY;      break;
            case 2 : myWeek = Week.TUESDAY;     break;
            case 3 : myWeek = Week.WEDNESDAY;   break;
            case 4 : myWeek = Week.THURSDAY;    break;
            case 5 : myWeek = Week.FRIDAY;      break;
            case 6 : myWeek = Week.SATURDAY;    break;
            case 7 : myWeek = Week.SUNDAY;
        }
        // 열거 타입 변수를 사용
        System.out.println("요일은 : " + myWeek);
    }
}
