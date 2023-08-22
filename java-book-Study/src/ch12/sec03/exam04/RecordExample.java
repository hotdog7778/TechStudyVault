package ch12.sec03.exam04;

import jdk.jfr.DataAmount;
import lombok.Data;

public class RecordExample {
    public static void main(String[] args) {
        Member member = new Member("1", "tgkim", "32");
        Member member2 = new Member("1", "tgkim", "32");
        
        String a = member.id();
        String b = member.name();
        String c = member.age();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        boolean result = member.hashCode() == member2.hashCode();
        System.out.println("result = " + result);
    }
}
