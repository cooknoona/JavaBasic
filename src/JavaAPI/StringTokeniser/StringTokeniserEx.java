package JavaAPI.StringTokeniser;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 문자열을 특정 구분자 기준으로 쪼개서 부분 문자열로 만드는 것
*  String.split() 을 사용하는 방법이 더 좋음
*  countTokens() : 꺼내지 않고 남은 토큰의 수
*  hasMoreTokens() : 남아있는 토큰이 있는지 여부 확인
*  nextToken() : 토큰을 하나씩 빼옴 */
public class StringTokeniserEx {
    public static void main(String[] args) {
//        tokenFunc();    // StringTokeniser 을 이용한 방식
        splitFunc();    // split 을 이용한 방식
    }
    static void tokenFunc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력 하세요 : ");
        String name = sc.nextLine();
        StringTokenizer st = new StringTokenizer(name, "/");
        String[] nameSub = new String[st.countTokens()];    // 문자열 배열의 크기를 정함
        int idx = 0;
        while (st.hasMoreTokens()) {    // 조건문 반복 여부를 hasMoreTokens() 반환값으로 결정
            nameSub[idx++] = st.nextToken();
        }
        System.out.println(Arrays.toString(nameSub));
    }

    static void splitFunc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력 하세요 : ");
        String name = sc.nextLine();
        String[] nameSub = name.split("/"); // (/) 뿐만 아니라 ;, 같은 부호도 가능 예) "[/,;]"
        System.out.println(Arrays.toString(nameSub));
    }
}
