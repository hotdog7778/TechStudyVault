package ch07.sec09;

public class UpCastingExample {
    public static void main(String[] args) {
        // * 업캐스팅 연습
        Child child = new Child();
        System.out.println(child);

        Parent parent = child; // 형변환되었고, 업캐스팅 완료됨.
        System.out.println(parent);
        // 업캐스팅이 되었으니 child 객체에서는 무조건 부모가 가지고있는 메서드만 사용 가능할까?
        // 형변환 되기전에도 child 객체를 참조하고 있었던 레퍼런스변수 child 를 사용해서 부모클래스와 다른 child 객체만의 runChild() 메서드를 호출해보자
        child.runChild(); // 나는 Child 입니다. runChild 메서드

        // 부모클래스에 명시된 멤버만 사용할 수 있다고 알고있는 형변환 후의 child 객체를 사용해서 runChild() 메서드를 호출해보자
        //parent.runChild(); // 메서드를 찾을수 없다는 컴파일 에러가 발생. 배운대로다.

        // 레퍼런스 변수 parent 로 객체 내부를 호출하면 부모클래스의 멤버만 사용할 수 있는것 같다.
        // 그럼 배운대로 자식클래스에서 오버라이딩된 부모클래스의 메서드는 오버라이딩 된 대로 호출될까?
        parent.iAm(); // 나는 Child 입니다. iAM 메서드
        // 맞다.

        // 예상하기론 생성된 자식객체는 형변환 된 후에 자식객체에만 존재하는 멤버들을 전부 사용 못하게 되는줄 알았는데,
        // 형변환 전에 사용하던 레퍼런스변수를 사용해서 호출하면 자식객체만의 메서드도 호출이 가능하네?
        // 형변환 후에 child.runChild(); 를 사용가능한것 보면 그런것 같다.
        System.out.println(child == parent); // true
        // 같은 객첸데, 어떤 레퍼런스 변수로 부르느냐에 따라 다르네
        // 그럼결국 객체가 바뀐게 아니라 레퍼런스 변수에 따라 다른것 아닌가?

        // * 다운캐스팅 연습
        // 다시 강제 형변환을 사용해서 원상태로 복구 시킨다.
        Child child2 = (Child) parent;
        System.out.println(child2);

        /*
        최조 생성된 자식클래스의 객체 (레퍼런스 변수 = child)
        두번쨰로, 부모형으로 형변환된 객체 (레퍼런스 변수 = parent)
        세번쨰로, 다시 자식형으로 형변환된 객체 (레퍼런스 변수 = child2)
        모두 주소값이 같은 객체이다.
         */
        // 레퍼런스 변수를 많이 만들지 않으려면
        // Child child = new Child();
        // Parent parent = child;
        // 보다는
        // Parent parent = new Child();
        // 가 낫다.
    }
}
