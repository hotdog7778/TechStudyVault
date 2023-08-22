package ch07.sec09;

class Child extends Parent{
    @Override
    void iAm(){
        System.out.println("나는 Child 입니다. 부모와 동일한 메서드이지만 오버라이딩 되었습니다.");
    }
    void runChild(){
        System.out.println("나는 Child 입니다. 부모에겐 없는 나만의 메서드 입니다.");
    }
}
