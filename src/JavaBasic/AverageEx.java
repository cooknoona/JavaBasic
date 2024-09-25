package JavaBasic;

import java.util.Scanner;

/* 학생수 5명에 대한 성적을 입력 받음
*  입력 받은 성적 중에서 40점 미만이 있으면 40점 올림
*  평균 점수를 구해서 출력 하기
*  점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따랏, 평균 점수는 항상 정수이다. */
public class AverageEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int [] score = new int[5];
        int total = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if (score[i] < 40) score[i] = 40;
            total += score[i];
        }
        System.out.println(total / 5);
    }
}
