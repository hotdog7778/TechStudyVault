package ch12.sec03.exam04;

import java.util.Objects;

public record Member(String id, String name, String age) {
}
//public class Member {
//    private final String id;
//    private final String name;
//    private final String age;
//
//    public Member(String id, String name, String age){
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
//
//    public String id() {
//        return id;
//    }
//
//    public String name() {
//        return name;
//    }
//
//    public String age() {
//        return age;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Member member = (Member) o;
//        return Objects.equals(id, member.id) && Objects.equals(name, member.name) && Objects.equals(age, member.age);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, age);
//    }
//
//    @Override
//    public String toString() {
//        return "Member{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", age='" + age + '\'' +
//                '}';
//    }
//}
