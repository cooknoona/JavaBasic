package JavaBasic;

import java.util.Scanner;

public class OperatorPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수값을 입력 하세요 : ");
        int num = sc.nextInt();
        int fNum = num / 100;
        int sNum = (num % 100)/10;
        int tNum = num % 10;
        System.out.println("100의자리는\n" + fNum + "\n" + "10의자리는\n" + sNum + "\n" + "1의 자리는\n"+ tNum);
    }
}
