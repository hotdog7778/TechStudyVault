package ch11.sec04;

public class MyResource implements AutoCloseable{
    // 필드
    private String name;

    // 생성자
    MyResource(String name){
        this.name = name;
        System.out.println("[MyResource ("+name+") 열기]");
    }

    // String 반환값이 있는 메서드
    public String read1() {
        System.out.println("[MyResource ("+name+") 읽기]");
        return "100";
    }

    public String read2() {
        System.out.println("[MyResource ("+name+") 읽기]");
        return "abc";
    }

    @Override
    public void close() throws Exception{
        System.out.println("[MyResource ("+name+") 닫기]");
    }
}
