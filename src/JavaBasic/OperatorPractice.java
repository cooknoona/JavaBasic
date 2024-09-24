package JavaBasic;

import java.util.Scanner;

public class OperatorPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 객체 생성
        System.out.println("정수값을 입력 하세요 : ");   // 사용자로부터 Scanner 입력 받기
        int num = sc.nextInt(); // 입력 값을 변수 num 에 저장
        int firstNum = num / 100;   // 100의 자리수 변수
        int secondNum = (num % 100)/10;  // 10의 자리수 변수
        int thirdNum = num % 10;    // 1의 자리수 변수
        System.out.println("100의자리는\n" + firstNum + "\n" + "10의자리는\n" + secondNum + "\n" + "1의 자리는\n"+ thirdNum);
    }
}
