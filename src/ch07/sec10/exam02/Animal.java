package ch07.sec10.exam02;

public abstract class Animal {
    // 일반 메서드
    public void Breath(){
        System.out.println("숨을 쉰다.");
    }

    // 추상 메소드
    public abstract void Sound();
}
