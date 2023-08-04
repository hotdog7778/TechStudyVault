package ch12.sec03;

public class ObjectMethod {
    public static void main(String[] args) {
        String str1 = "바보";
        String str2 = "바보";
        System.out.println(str1 == str2); // true
        // 리터럴이 같아서 내부적으로 같은 주소를 사용하는것 같음

        String str3 = "커피";
        String str4 = "머신";
        System.out.println(str3 == str4); // false

        str4 = "커피";
        System.out.println(str3 == str4); // true >> 주소가 같은것 같은데
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        // java String pool
        // String literal로 생성한 객체는 내용이 같다면 같은 객체, 즉 동일한 메모리 주소를 가리키고 있다.
        // str1 과 str2 가 그렇다.
        // str4 에 새로운 값을 대입할 때도 기존의 메모리에 저장된 '커피'를 가져오기때문에 같은 주소이다.

        System.out.println("----------------------");

        Object obj = new Object();
        Object obj2 = new Object();

        boolean result1 = obj.equals(obj2); // 객체의 번지를 비교하고 리턴
        System.out.println(result1);
        int result2 = obj.hashCode(); // 객체의 해시코드를 리턴
        System.out.println(result2);
        String result3 = obj.toString(); // 객체의 문자정보를 리턴
        System.out.println(result3);

    }

}
