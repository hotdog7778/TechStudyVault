package ch05.sec12;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {

        // 스캐너 생성
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        int studentsCount = 0;
        int[] scores = null;

        while(run){
            System.out.println("----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택> ");

//            String strSelVal = scanner.nextLine();
            int intSelVal = Integer.parseInt(scanner.nextLine());

            if(intSelVal == 1){
                System.out.print("학생수> ");
                String strStudentsCount = scanner.nextLine();
                studentsCount = Integer.parseInt(strStudentsCount);
                if(studentsCount <= 0){
                    System.out.println("학생수는 1명 이상으로 입력해 주세요");
                    studentsCount = 0;
                    continue;
                }
                scores = new int[studentsCount];
            } else if (intSelVal == 2){
                if (studentsCount <= 0){
                    System.out.println("먼저 학생수를 입력하세요");
                    continue;
                } else {
                    for(int i=0; i< scores.length; i++){
                        System.out.print("scores["+i+"]> ");
                        // scores = new int[studentsCount];
                        scores[i] = Integer.parseInt(scanner.nextLine());
                    }
                }
            } else if (intSelVal == 3){
                if (studentsCount <= 0) {
                    System.out.println("먼저 점수를 입력하세요");
                    continue;
                } else {
                    for(int i=0; i< scores.length; i++){
                        System.out.println("scores["+i+"]: " + scores[i]);
                    }
                }
            } else if (intSelVal == 4){
                if (studentsCount <= 0) {
                    System.out.println("먼저 점수를 입력하세요");
                    continue;
                } else {
                    int sum = 0;
                    for(int i=0; i< scores.length; i++){
                        sum += scores[i];
                    }
                    double avg = (double) sum / scores.length;

                    int newVal = 0;
                    int beforeVal = 0;
                    for(int kk : scores){
                        newVal = kk;
                        if(kk == beforeVal){
                            newVal = kk;
                        } else if (kk > beforeVal){
                            newVal = kk;
                        } else {
                            newVal = beforeVal;
                        }
                        beforeVal = newVal;
                    }
                    System.out.println("최고 점수: "+newVal);
                    System.out.println("평균 점수: "+avg);
                }
            } else if (intSelVal == 5){
                System.out.println("프로그램 종료");
                //break;
                run = false;
            } else {
                System.out.println("숫자를 제대로 다시 입력해주세요");
            }
        }
    }
}

