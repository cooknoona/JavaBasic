package JavaAPI.MathClass;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* 클래스 메서드 : 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스
*  모든 메서드는 클래스 메서드이므로 객체 생성 없이 바로 사용가능
*  java.lang 에 포함되어 있어 별도의 import 가 필요 없다 (예: Scanner 는 객체 생성과 import 가 필요하다) */
public class MathEx {
    public static void main(String[] args) {
        randomFunc();
        MathMethodFunc();
    }
    // random() 메서드는 0.0 이상에서 1.0 미만의 범위에서 임의의 double 형 값 한개를 반환한다.
    static void randomFunc() {
        for (int i = 0; i < 50; i++) {  // 0부터 시작해 50번 반복
            System.out.println((int)(Math.random() * 100) + 1 + " ");   // 1 ~ 100 사이의 임의의 수를 출력
        }
    }
    // abs() 메서드 : 절대값 구하는 메서드
    // floor() : 주어진 숫자를 내림한 결과를 반환
    // ceil() : 주어진 숫자를 올림한 결과를 반환
    // round() : 소수점 첫째 자리에서 반올림한 결과를 반환
    // min() 과 max()
    // BigDecimal() : 메서드를 import 해서 사용하는 방법이 권장되는 방식
    static void MathMethodFunc() {
        System.out.println(Math.abs(-10));  // -10의 절대값인 10으로 반환
        System.out.println(Math.abs(10));   // 10의 절대값은 10이므로 그대로 반환
        System.out.println(Math.floor(10.9999999999));  // 내림한 결과는 10
        System.out.println(Math.ceil(10.000000001));    // 올림한 결과는 11
        System.out.println(Math.round(10.4999999)); // 반올림 한 결과 10
        System.out.println(Math.round(10.5999999)); // 반올림 한 결과 11
        System.out.println(Math.min(20, 30));   // 두가지 값중 작은 값을 반환
        System.out.println(Math.max(20, 30));   // 두가지 값중 큰 값을 반환
        BigDecimal number = new BigDecimal("10.345");
        System.out.println(number.setScale(2, RoundingMode.HALF_UP));
    }
}
