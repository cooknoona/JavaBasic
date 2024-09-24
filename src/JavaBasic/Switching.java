package JavaBasic;

import java.util.Scanner;

/* Switch 는 if 문과 마찬가지로 조건 제어문 입니다.
*  if 문은 조건식의 결과가 True 또는 False 에 따라 분기하고,
*  Switch 문은 변수의 값에 따라 실행문이 결정
* switch (변수) {
* case 값: 정수, 문자, 문자열이 올 수 있다
*   실행문
*   break; */
public class Switching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력 하세요 : ");
        String season = sc.next();

        // ---Switch case 를 사용할 때---
        switch (season) {
            case "spring":
                System.out.println("따듯한 봄");
                break;
            case "summer":
                System.out.println("파란 하늘의 여름");
                break;
            case "fall":
            case "autumn":
                System.out.println("단풍의 계절 가을");
                break;
            case "winter":
                System.out.println("눈꽃의 겨울");
                break;
            default:
                System.out.println("잘못된 입력 입니다");
        }

        // ---IF 문을 사용 했을때---
//        if (season.equals("spring")) {
//            System.out.println("따듯한 봄");
//        } else if (season.equals("summer")) {
//            System.out.println("파란 하늘의 여름");
//        } else if (season.equals("fall") || season.equals("autumn")) {
//            System.out.println("단풍의 계절 가을");
//        } else if (season.equals("winter")) {
//            System.out.println("눈꽃의 겨울");
//        } else {
//            System.out.println("잘못 입력 하였습니다.");
//        }
    }
}
