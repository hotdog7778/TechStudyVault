package ch09.quiz.q7;

public class Chatting {

    // 인스턴스 멤버 클래스
    class Chat {
        void start() {}
        void sendMessage(String message){}
    }

    // 메서드
    void startChat(String chatId){
        // 로컬변수
        // String nickName = null;
        // nickName = chatId;
        // 아래서 nickName은 아래 익명객체의 멤버로 사용되고 있기 때문에 여기서 nickName은 final 특성을 갖게 됩니다.
        // 따라서 null 값이 들어간 이후에 chatId를 대입하는것은 할 수 없습니다.
        // 즉, String nickName = chatId 로 변경해야 합니다.
        String nickName = chatId;

        // 익명 클래스 객체
        Chat chat = new Chat() {
            @Override
            public void start(){
                while (true) {
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "]" + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
}
