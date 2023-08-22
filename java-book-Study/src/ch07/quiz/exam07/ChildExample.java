package ch07.quiz.exam07;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

// child 인스턴스생성
// Child() 호출
// super()로 Parent() 호출
// this 로 Parent(String nation) 호출
// this.nation = "대한민국"
// Parent(String nation) call 프린트
// 다시돌아가서 Parent() call 프린트
// 다시 자식으로 돌아가서
// this 로 Child(String name) 호출
// this.name = "홍길동"
// Child(String name) call 프린트
// 다시돌아가서 Child() call 프린트

// Parent(String nation) call 프린트
// Parent() call 프린트
// Child(String name) call 프린트
// Child() call 프린트