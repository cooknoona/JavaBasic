package JavaBasic;

import java.util.Scanner;

/* 국어, 영어, 수학 성적을 입력 받아서 총점을 구하고
*  평균이 90점 이상이면 A
*  평균이 80점 이상이면 B
*  평균이 70점 이상이면 C
*  평균이 60점 이상이면 D
*  그 이외에는 F
*  각각의 성적은 0 ~ 100사이의 정수 값만 입력 받으며 입력 값이 잘못된 경우 재입력을 받아야 함 */
public class OutputGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("학생의 이름을 입력해 주세요 : ");
            String studentName = sc.next();
            System.out.print("국어 점수를 입력 해 주세요 : ");
            int korScore = sc.nextInt();
            System.out.print("영어 점수를 입력 해 주세요 : ");
            int engScore = sc.nextInt();
            System.out.print("수학 점수를 입력 해 주세요 : ");
            int matScore = sc.nextInt();
            double avg = (double)(korScore + engScore + matScore) / 3;
            if (avg > 100 || avg < 0) {
                System.out.println("잘못된 입력 입니다.");
            } else {
                if (avg >= 90) {
                    System.out.println(studentName + "의 점수는 A");
                } else if (avg >= 80) {
                    System.out.println(studentName + "의 점수는 B");
                } else if (avg >= 70) {
                    System.out.println(studentName + "의 점수는 C");
                } else if (avg >= 60) {
                    System.out.println(studentName + "의 점수는 D");
                } else {
                    System.out.println(studentName + "의 점수는 F");
                }
            }break;
        }
    }
}
