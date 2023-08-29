package ch12.sec08;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatExample {
    public static void main(String[] args) {

        // DecimalFormat
        DecimalFormat df = new DecimalFormat("#,###.0");
        String result = df.format(1234567.89);
        System.out.println(result); // 1,234,567.9

        // SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월-dd일");
        String strDate = sdf.format(new Date());
        System.out.println(strDate); // 2023년-08월-29일

    }
}
