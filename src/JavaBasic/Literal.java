package JavaBasic;
/* 리터럴(Literal)이란? 프로그램에서 사용하는 모든 숫자, 문자, 논리값을 의미
*  그리고 코드 내에 직접 쓰려지는 고정 된 값
*  형변환(Type Casting)이란? 선언된 타입을 다른 타입으로 변환 하는 것
*  자동 형변환(Implicit Casting) : 자바에서 자동으로 수행하는 형변환, 주로 작은 데이터 -> 큰 데이터 타입 (데이터 손실 X)
*  수동 형변환(Explicit Casting) : 개발자가 명시적으로 형변화를 수행하는 경우 큰 데이터 -> 작은 데이터 타입 (데이터 손실
*  이 일어날 수 있으므로 괄호() 를 사용해 명시적으로 변환 해야함) */

public class Literal {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
        double rst = (double) num1 / num2;  // 자동 형변환과 수동 형변환이 동시에 일어난다
        System.out.println(rst);
        System.out.println(rst + 10 + "10");    // 결합순서에 따라서 결과 값이 바뀜
    }
}
