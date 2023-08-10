package ch12.sec04;

import java.util.Map;
import java.util.Properties;

public class ErrExample {
    public static void main(String[] args) {
        Map<String, String> getenv = System.getenv();
        Properties properties = System.getProperties();

//        System.out.println(getenv);
        System.out.println(properties);
    }
}
