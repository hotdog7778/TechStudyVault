package ch08.sec09;

public class InterfaceChildImpl implements InterfaceChild {
    // InterfaceChild 의 구현 클래스

    // 추상메서드 구현
    // A의 추상메서드 구현
    @Override
    public void methodA(){
        System.out.println("구현 클래스의 메소드A");
    }

    // B의 추상메서드 구현
    @Override
    public void methodB(){
        System.out.println("구현 클래스의 메소드B");
    }

    // C의 추상메서드 구현
    @Override
    public void methodC(){
        System.out.println("구현 클래스의 메소드C");
    }
}
