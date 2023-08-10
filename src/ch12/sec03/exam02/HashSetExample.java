package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashset = new HashSet();

        Student s1 = new Student(1, "홍길동");
        hashset.add(s1);
        Student s2 = new Student(1, "홍길동");
        hashset.add(s2);
        Student s3 = new Student(1, "홍길동");
        hashset.add(s3);

        // HashSet에 저장된 객체수 확인
        System.out.println(hashset.size()); // 1
        // hashset은 객체를 저장할 때 객체의 hashCode와 equals 를 사용해서 동등비교를 한 후에 동등한건 저장하지 않는다.

    }
}
