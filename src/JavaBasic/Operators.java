package JavaBasic;

import java.util.Scanner;

/* 산술 연산자 : +, -, *, /, % (//, ** 없음)
*  대입연산자 : =, +=, -=, *=, /=, %=
*  증감연산자 : ++, -- (현재 값에서 1을 증가 시키거나 감소 시키는 연산자)
*  비교연산자 : >, <, >=, <=, !=, ==
*  논리연산자 : &&(and), ||(or), !(not)
*  삼항연산자 : 조건식 ? 참인 경우 수행 구문 : 거짓인 경우 수행 구문
*  비트연산자 : 비트 단위의 저수준 조작을 하기 위한 연산자 */
public class Operators {
    public static void main(String[] args) {
        int num1 = 10, num2 = 0;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        try {
            System.out.println(num1 / num2);
            System.out.println((double) (num1 / num2));
            System.out.println(num1 % num2);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누기를 할 수 없습니다!");
        }
        // 증감 연산자 : 해당 변수값을 1 증가 또는 감소 시키는 연산자
        System.out.println(num1++); // 후위 증감연산자
        System.out.println(num1);
        System.out.println(++num1); // 전위 증감연산자

        System.out.println(num1 += 2);  // num1 = num 1 + 2
        System.out.println(num1 -= 2);  // num1 = num 1 - 2
        System.out.println(num1 *= 2);  // num1 = num 1 * 2
        System.out.println(num1 /= 2);  // num1 = num 1 / 2

        // 비교 연산자 : 두개의 피 연산자를 비교하여, 큰 수, 작은 수, 같은 수를 판단 하는 것
        // 결과 값은 boolean 값으로 반환(True / False)

        int x = 10, y = 20;
        System.out.println(x > y);  // False
        System.out.println(x < y);  // True
        System.out.println(x == y); // False
        System.out.println(x != y); // True
        System.out.println(x >= y); // False
        System.out.println(x <= y); // True

        // 논리 연산자 :
        // &&(AND) A와 B의 조건이 성립해야 참
        // ||(OR) A와 B 둘중 하나의 조건만 성립해도 참
        // !(NOT) 현재 조건에 대한 부정이므로, 반대가 된다

        int m = 10, n = 20;
        boolean rst1, rst2, rst3;
        rst1 = (m > 0) && (m > n);  // False
        rst2 = (m > 0) || (m > n);  // True
        rst3 = !((m > 0) || (m > n));   // False
        System.out.println(rst1 + "" + rst2 + "" + rst3);

        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력 하세요 : ");
        int age = sc.nextInt();
        String isAdult = (age > 19) ? "성인" : "미성년자";    // 삼항연산자
        System.out.println("당신은 " + isAdult + "입니다.");

        // 연산자 우선 순위 확인
        int val1 = 5, val2 = 5, val3 = 5;
        System.out.println(val1 + val2 * val3); // 30
        System.out.println((val1 + val2) * val3);   // 50
        System.out.println((val1 + (++val2)) * val3);
    }
}
