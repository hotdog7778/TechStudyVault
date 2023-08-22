package ch11.sec04;

public class TryWithResourceExample {
    public static void main(String[] args) {

        // 예외가 발생하지 않은 try-catch 구문
        //MyResource res1 = new MyResource("홍길동");
        try (MyResource res = new MyResource("홍길동")) {
            // a.close(); ** 내가 close() 를 호출해도 자동으로 한번더 close 합니다.
            res.read2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // finally 는 생략해도 된다 try-with-resource 를 사용했기 때문에 자동으로 close 된다.

        System.out.println("--------------------");

        // 예외가 발생하지 않은 try-catch 구문 2
        try (MyResource res = new MyResource("홍길동")) {
            // a.close(); ** 내가 close() 를 호출해도 자동으로 한번더 close 합니다.

            String data = res.read1(); // res.read1() 는 "100" 을 리턴한다.
            int value = Integer.parseInt(data);

        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }

        System.out.println("--------------------");

        // 예외가 발생한 try-catch 구문
        try (MyResource res = new MyResource("홍길동")) {

            String data = res.read2(); // res.read2() 는 "abc" 을 리턴한다.
            System.out.println("예외가 발생하기 직전");
            int value = Integer.parseInt(data); // "abc"는 int 타입으로 바꾸려 하면 예외가 발생될게 예상된다. 예외가 발생됐을때 파일이 닫히는지 확인하면 됩니다.
            System.out.println("예외가 발생하기 직후");
        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }
//          출력된 :
//          [MyResource (홍길동) 열기]
//          [MyResource (홍길동) 읽기]
//          [MyResource (홍길동) 닫기]
//          예외처리 : For input string: "abc"
//          ** 파일닫기 -> 예외처리가 마지막에 된것은 아래와 같다.
//          ** try블록 안에서 예외 발생 -> 리소스.close()가 실행됨(자동으로) -> catch 블록에서 예외처리

        System.out.println("--------------------");

        // 두개의 리소스를 한번에 사용하기. 동작 순서를 보자. 외부에 리소스를 가져다 사용하는건 자바9부터 가능
        MyResource res1 = new MyResource("철수의 리소스");
        MyResource res2 = new MyResource("영수의 리소스");
        try (res1; res2) {
            String data1 = res1.read1(); // res.read1() 는 "100" 을 리턴한다.
            String data2 = res2.read1(); // res.read1() 는 "100" 을 리턴한다.
        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }
        // 출력값
        //[MyResource (철수의 리소스) 열기]
        //[MyResource (영수의 리소스) 열기]
        //[MyResource (철수의 리소스) 읽기]
        //[MyResource (영수의 리소스) 읽기]
        //[MyResource (영수의 리소스) 닫기] ** 왜 영수의 리소스가 먼저 닫힐까?
        //[MyResource (철수의 리소스) 닫기]
    }
}
