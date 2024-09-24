package JavaBasic;

import java.util.Scanner;

/* 이름 : String
*  주소 : String
*  성별 : char
*  나이 : int
*  === 회원 정보 출력 ===
*  이름 :
*  주소 :
*  성별 :
*  나이 : */
public class ScannerEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.nextLine();
//        String name = sc.next();  // next()로 입력을 받고 아래에 nextLine()으로 줄맞춤 가능
//        sc.nextLine();
        System.out.print("주소를 입력 하세요 : ");
        String addr = sc.nextLine();
        System.out.print("성별을 입력 하세요 : ");
        char gender = sc.next().charAt(0);
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();
        System.out.println("=== 회원 정보 출력 ===");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);

        sc.close();
    }
}
