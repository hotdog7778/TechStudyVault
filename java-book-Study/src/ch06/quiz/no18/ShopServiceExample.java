package ch06.quiz.no18;

public class ShopServiceExample {
    public static void main(String[] args) {
        ShopService a1 = ShopService.getInstance();
        ShopService a2 = ShopService.getInstance();

        if ( a1 == a2 ){
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }

}
