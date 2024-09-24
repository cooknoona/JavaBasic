package JavaBasic;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 값 입력 : ");
        int num = sc.nextInt();

        // 조건문 내의 코드가 한줄인 경우는 중괄호 {} 생략 가능
        if (num > 100) {
            System.out.println(num + "이 100보다 커요");
        } else if (num == 100) {
            System.out.println(num + "이 100과 같아요");
        } else {
            System.out.println(num + "이 100보다 작아요");
        }

        // 입력 받은 문자가 대문자인지 소문자인지 출력
        System.out.print("문자를 입력 : ");
        Scanner sc2 = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {   // AND 연산자를 통해 두가지 조건에 적합할때 "a ~ z"
            System.out.println(ch + "는 소문자 입니다.");  // 첫번째 조건 출력
        } else if (ch >= 'A' && ch<='Z') {  // AND 연산자를 통해 두가지 조건에 적합할때 "A ~ Z"
            System.out.println(ch + "는 대문자 입니다.");  // 두번째 조건 출력
        } else {
            System.out.println(ch + "는 알파벳이 아닙니다.");    // else 위에 if, else if 에 포함되지 않을때?
        }
    }
}
