package JavaBasic;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        char op = sc.next().charAt(0);
        int y = sc.nextInt();

        switch (op) {
            case '+':
                System.out.println("덧셈 : " + (x + y));
                break;
            case '-':
                System.out.println("뺄셈 : " + (x - y));
                break;
            case '*':
                System.out.println("곱셈 : " + (x * y));
                break;
            case '/':
                System.out.println("나눗셈 : " + ((double)x / y));
                break;
            default:
                System.out.println("잘못된 입력 입니다.");
        }
    }
}
