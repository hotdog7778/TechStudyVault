package ch07.sec09;

public class WhoAreYouExample {
    public static void main(String[] args) {
        WhoAreYou whoAreYou = new WhoAreYou();

        Child child = new Child();

        whoAreYou.Question(child);
        Parent parent = new Parent();

        whoAreYou.Question(child); // 매개변수로 Parent 형 객체를 넘겨달라했지만, Child 형 객체인 child 를 넘겨줘도 괜찮다. 자동형변환이 이루어진다.
                                   // 왜 자동형변환이 이루어졌냐면, Question 메소드에 child 가 넘어가면서 Parent parent = child 가 수행된거다.
        // 자동형변환을 이용해서 다형성을 구현한다.
        // 자식 객체를 넘기면 오버라이딩 된 자식 메소드를 실행할 것이고,
        // 또 다른 자식 객체를 넘기면 오버라이딩 된 자식 메소드를 실행할 것이다.
        // 동작방식은 같지만, 실행 결과는 어떻게 오버라이딩 되었느냐에 따라 다르다.
    }
}
