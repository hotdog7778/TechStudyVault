package ch07.sec09.exam01;

public class InstanceofExample {

    // 메인 메소드에서 호출하기위한 static 메소드를 생성
    // 부모형 객체를 전달받아서, 그 객체가 형변환이 이루어졌었는지 판단한 후에 맞다면 다운캐스팅 진행 후
    // 자식 객체에서만 사용 할 수 있는 필드와 메서드를 실행한다.
    public static void personInfo(Person person){
        System.out.println("name: "+person.name);
        person.walk();

        // person 이 참조하는 객체가 Student 타입인지 확인
        // person 이 참조하는 객체가 Student 타입일 경우
        if(person instanceof Student){ // 업캐스팅 즉 형변환 됐는지 여부를 물어보는것 같음
            // 이미 형변환이 된 person 객체라면 실행할 것. 다운캐스팅. 강제변환
            Student student = (Student) person;

            // 다시 자식 객체로 다운캐스팅 되었으니. 자식객체에서만 가지고 있는 필드와 메서드 사용
            System.out.println("StudentNo: "+student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        // Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        // Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p2 = new Student("김자바",1);
        personInfo(p2); // 넘어가면서 형변환이 되었기 때문에, 자식객체의 멤버는 사용할 수 없다.
                        // 하지만 personInfo() 의 기능은, 다시 다운캐스팅을 진행하고,
                        // 자식객체에서만 사용할 수 있는 멤버들을 사용하는 것이다.

    }
}
