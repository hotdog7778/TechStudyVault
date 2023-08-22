package ch07.sec10.exam02;

public class AnimalExample {

    public static void main(String[] args) {

        // 따로객체를 만들고 울음소리 호출
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.Sound();
        dog.Sound();

        // 다형성을 사용해서 울음소리 호출

        //AnimalExample t1 = new AnimalExample();
        //t1.AnimalsSound(cat); // 자동 형변환 이루어짐. Animal animal = (Cat) cat
        //t1.AnimalsSound(dog);

        AnimalsSound(cat);
        AnimalsSound(dog);

    }

    public static void AnimalsSound(Animal animal){

        // 전달받은 객체의 sound 메소드를 실행하는 코드
        animal.Sound();

    }

}
