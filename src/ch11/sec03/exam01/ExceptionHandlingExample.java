package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        // 배열의 길이보다 한번더 실행되는 반복문
        for(int i=0; i<= array.length; i++){
            try {
                // 배열의 요소들을 숫자로 변환해서 변수에 저장
                int intArray = Integer.parseInt(array[i]);
                System.out.println("array["+i+"] = "+intArray);
            } catch (NumberFormatException e) { // catch (NumberFormatException | ArrayIndexOutOfBoundsException e) 도 가능
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("프로그램 종료");
    }
}
