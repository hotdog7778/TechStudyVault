package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
    // 구현 클래스

    // 리모트컨트롤의 추상메소드를 구현
    @Override
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    // 서치에이블의 추상 메서드를 구현
    @Override
    public void search(String url){
        System.out.println(url + " 를 검색합니다.");
    }
}
