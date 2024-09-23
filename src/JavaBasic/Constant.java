package JavaBasic;

import java.util.Scanner;

/* 상수(Constant)란? 메모리에 값이 한번 지정되면 변경 할 수 없음
*  자바에서는 상수 정의를 final 키워드를 사용해 지정
*  상수는 관례상 모두 대문자로 선언한다 */
public class Constant {
    public static void main(String[] args) {
        double TAX_RATE = 0.10; // 상수 선언시 관례상 대문자로 변수 이름 선언
        // 콘솔에서 입력 받기 위해서는 스캐너 클래스에 대한 객체를 생성해야 함
        Scanner sc = new Scanner(System.in);
        System.out.print("수입을 입력 하세요 : ");
        int income = sc.nextInt();
    }
}
