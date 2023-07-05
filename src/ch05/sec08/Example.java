package ch05.sec08;

public class Example {
    public static void main(String[] args) {
        String[] strArray = new String[5];
        strArray[0] = "JAVA";
        strArray[1] = "C++";
        strArray[2] = "C#";
        strArray[3] = "C#";
        strArray[4] = new String("C#");

        System.out.println(strArray[2] == strArray[3]); // true
        System.out.println(strArray[2].equals(strArray[3])); // true
        System.out.println(strArray[0] == strArray[2]); // false

        System.out.println(strArray[2] == strArray[4]); // false
        System.out.println(strArray[2].equals(strArray[4])); // true

//        int[] intArray = new int[5];
//        intArray[0] = 0;
//        intArray[1] = 0;
//        intArray[2] = 2;
//
//        System.out.println(intArray[0] == intArray[1]); // true
    }
}
