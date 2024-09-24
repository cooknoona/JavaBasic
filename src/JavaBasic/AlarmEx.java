package JavaBasic;
/*
* 상근이의 알람 */
import java.util.Scanner;

public class AlarmEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력 하세요 : ");  // 시간 입력
        int hour = sc.nextInt();    // 시간 입력 값 저장
        System.out.print("분을 입력 하세요 : ");   // 분 입력
        int min = sc.nextInt(); // 분 입력 값 저장
        int timeToMin = (hour * 60) + min;  // 총 시간 계산 방법
        if (timeToMin < 45) {   // 총 시간이 45 보다 작다면
            timeToMin = (24 * 45) + min;    // 하루의 시간을 더해줌
        }
        timeToMin -= 45;    // 계산된 시간에서 45를 빼줌
        // 시간은 60으로 나누어 나온 값을 저장하며 분은 60으로 나눈 값의 나머지를 저장해 출력
        System.out.println((timeToMin/60)+ " 시" + " " + (timeToMin%60) + " 분 에 알람을 맞추세요");
    }
}
