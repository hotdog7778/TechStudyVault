package ch06.quiz.no18;

public class ShopService {
    // 싱글톤 사용
    // private 생성자로 내부에서만 객체를 생성할 수 있게 한후에 객체를 생성해보자

    // 필드 선언
    private static ShopService shopService = new ShopService();

    // 내부용 생성자에서 객체 생성
    private ShopService(){

    }

    // 호출 할 수 있는 외부용 메서드
    // ShopService 클래스로 객체를 만들지 않고도 접근할 수 있어야 하기 때문에 static
    // static 메서드로는 인스턴스 필드를 호출할 수 없기때문에 위의 필드선언을 static으로 해야한다
    public static ShopService getInstance(){
        return shopService;
    }

}
