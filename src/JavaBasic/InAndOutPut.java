package JavaBasic;

import java.util.Scanner;

/* 자바 표준 입출력 클래스 :
*  System.in(표준 입력) : 프로그램 내에서 사용자의 입력을 받음 (콘솔 입력)
*  System.out(표준 출력) : 프로그램 내의 결과를 콘솔에 출력 (리다이렉션 가능)
*  print(메서드 오버로딩), println(메서드오버로딩), printf(서식지정자)
*  System.err(표준 오류) : 오류를 출력하기 위해 사용(리다이렉션 X -> 대체자가 있다(Sl4f)
*  서식지정자 : printf
*  -  */
public class InAndOutPut {
    public static void main(String[] args) {
        String name = "홍길동";
        String addr = "경기도 파주시 다율동";
        char gender = 'M';
        int age = 20;
        int kor = 89;
        int eng = 100;
        int mat = 79;
        // println(), print() : 메서드 오버로딩
        System.out.println("====== Java Style 출력 ======");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + mat));
        // 명시적 형변형과 묵지적 형변환이 일어남
        System.out.println("평균 : " + (double)(kor + eng + mat) / 3);
        System.out.println(String.format("평균 : %.2f", (double)(kor + eng + mat) / 3));

        // 서식지정자 스타일
        System.out.printf("======== C Style 출력 ========\n");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor + eng + mat);
        System.out.printf("평균 : %.2f\n", (double)(kor + eng + mat) / 3);
        System.out.println();

        // 서식 지정자
        // %d : 정수(decimal)
        // %o : 8진수(octal)
        // %x : 16진수(hexadecimal, 소문자)
        // %X : 16진수(hexadecimal, 대문자)
        // %f : 부동 소수점(float, double)
        // %e : 지수 표기법(exponential, 소문자)
        // %E : 지수 표기법(exponential, 대문자)
        // %g : 부동 소수점과 지수 표기법 중 간략한 형태로 선택
        // %a : 16진수 및 지수 표기법(소문자)
        // %A : 16진수 및 지수 표기법(대문자)
        // 문자와 문자열
        // %c : 문자(character)
        // %s : 문자열(string)
        // 불리언
        // %b : 불리언(boolean)
        // 특수 문자
        // %% : % 문자 자체를 출력

        int number = 42;
        double pi = 3.14159;
        String name2 = "Java";

        System.out.printf("정수: %d\n", number);          // 정수: 42
        System.out.printf("실수: %.2f\n", pi);           // 실수: 3.14 (소수점 2자리)
        System.out.printf("문자열: %s\n", name2);         // 문자열: Java
        System.out.printf("16진수: %x\n", number);       // 16진수: 2a
        System.out.printf("불리언: %b\n", true);         // 불리언: true
        System.out.printf("지수 표기법: %.3e\n", pi);    // 지수 표기법: 3.142e+00
    }
}
