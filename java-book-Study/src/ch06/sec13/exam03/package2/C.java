package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
        public static void main(String[] args) {
                // 다른 패키지의 필드와 메소드 조회/호출 확인 (pub default pri)

                // 필드 조회
                A a = new A();
                System.out.println(a.field1); // pub
//                System.out.println(a.field2); // default  // 다른 패키지라 컴파일 에러
//                System.out.println(a.field3); // pri  // 다른 패키지라 컴파일 에러

                // 메소드 호출
                a.method1(); // pub
//                a.method2(); // default
//                a.method3(); // pri

        }
}
