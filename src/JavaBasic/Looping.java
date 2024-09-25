package JavaBasic;

import java.util.Scanner;

/* 반복문이란? 주어진 조건이 참인 동안 혹은 정해진 횟수 만큼 반복적으로 프로그램을 수행 하는 것
*  while 문, do ~ while 문, for 문(범위 기반), Enhanced for 문(요소의 개수를 자동 순회) */
public class Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) { // 자바에서는 n만 넣으면 참으로 구별하지 않아 조건 식이 확실하게 참이게 만들어 줘야 한다
            sum += n;   // sum = sum + 1
            n-- ;        // n = n - 1 감소연산자
        }
        System.out.println("합계 : " + sum);
    }
}
