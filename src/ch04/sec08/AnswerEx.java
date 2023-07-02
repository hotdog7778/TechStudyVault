package ch04.sec08;

public class AnswerEx {
    public static void main(String[] args) {
        String grade = "B";
//        int score1 = 0;

        int scroe1 = switch(grade){
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println(grade);
        System.out.println(scroe1);
    }
}
