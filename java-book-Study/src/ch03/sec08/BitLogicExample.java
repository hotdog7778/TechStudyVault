package ch03.sec08;

import jdk.jfr.Unsigned;

public class BitLogicExample {
    public static void main(String[] args) {
        System.out.println("45 & 25 = " + (45 & 25) ); // 비트 논리 곱
        System.out.println("45 | 25 = " + (45 | 25) ); // 비트 논리 합
        System.out.println("45 ^ 25 = " + (45 ^ 25) ); // 비트 베타적 논리 합
        System.out.println("~45 = " + (~45) ); // 비트 논리 부정
        System.out.println("-----------------------");

        byte receiveData = -120;

        // 방법1 : 비트 논리곱 연산으로 Unsigned 정수 얻기. 여기서 sign은 부호 이다.
        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1); // 136

        // 방법2 : 자바 API를 활용
        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2); // 136

        // 반대로 136을 바이트로 전환해서 값을 확인
        int val = 136;
        byte valB = (byte) val;
        System.out.println(valB); // -120


    }
}
