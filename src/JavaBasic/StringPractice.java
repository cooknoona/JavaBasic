package JavaBasic;
/* 문자열이란? 문자가 연속적으로 존재하는 데이터 형
*  자바에서는 문자와 문자열을 구분함 Ex : "문자열", '문자'
*  자바는 문자열을 참조 타입으로 인지한다
*  문자열을 표현하기 위해서는 객체를 만들ㅇ ㅓ사용하거나 리터럴 표기 방식으로 사용한다
*  리터럴 표기 방식이 가독성이나 성능에서 유리 함 */

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        String name = new String("홍길동");
        String name2 = "홍길동";   // 리터럴 표기 방법
        // 문자열 내장 메서드
        // equals() : 두개의 문자열 내용이 동일 비교하여 결과를 반환
        String a = "hello";
        String b = "Hello";
        System.out.println(a.equals(b));    // False
        System.out.println(a.equalsIgnoreCase(b));  // True
        System.out.println(a == b); // 주소가 같은지를 물어보는 경우가 된다

        // indexOf() : 문자열에서 특정 문자가 시작되는 인덱스 반환
        String c = "Hello Java";
        System.out.println(c.indexOf("Java"));

        // contains() : 문자열에서 특정 문자열이 포함되어 있는지 여부를 반환
        System.out.println(c.contains("Hello"));    // True

        // charAt() : 문자열에서 특정 위치의 문자를 반환
        System.out.println(c.charAt(6));    // "J" 를 반환
        upperLowCh();
        reverseString();

        // replace() : 특정 문자열을 다른 문자열로 대체 할 때
        String d = "제 이름은 JAMES 입니다. ";
        System.out.println(d.replace("JAMES", "ANDREW"));
        // replaceAll() : 정규식 적용 가능, 주로 비밀번호나 전화번호 규칙을 적용시킴
        System.out.println(d.replaceAll("JAMES", "ANDREW"));

        // substring() : 문자열에서 특정 문자열을 선별할때 사용
        String e = "Hello Java";
        System.out.println(e.substring(5)); // (X , Y)로 시작 지점과 끝 지점 설정이 가능하지만, 한개만 적으면 끝 지점을 인식
        System.out.println(e.substring(6, 8));  // 6에서 8미만
        // toUpperCase / toLowerCase
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());
        // trim() : 문자열의 앞/뒤 공백 제거
        String f = "       안녕하세요.      반갑습니다.";
        System.out.println(f.trim());
        // split() : 문자열을 특정 문자열 기준으로 분리하는 메서드
        String g = "23:45:56";
        String[] timeStr = g.split(":");
//        for (String el : timeStr) {
//            System.out.print(el + " ");
//        }
        System.out.println(timeStr[0] + "시" + timeStr[1] + "분" + timeStr[2] + "초");

        // 문자열 포매팅 : 서식을 지정해서 문자열 만드는 것
        // System.out.printf(), String.format()
        System.out.printf("오늘의 온도는 %d 입니다. \n", 35);
        String weatherStr = String.format("오늘의 온도는 %d 입니다. \n", 35);
    }
    // 실습 문제1 : 대문자, 소문자로 이루어진 문자열을 입력 받아, 대문자는 소문자로, 소문자는 대문자로 출력
    static void upperLowCh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력 하세요 : ");
        String name = sc.nextLine();
        char [] charArray = name.toCharArray();

        for (int i = 0; i < name.length(); i++) {
            if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }else if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        String conversion = new String(charArray);
        System.out.println("대소문자 변환 : " + conversion);
    }
    static void reverseString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 하세요 : ");
        String inStr = sc.next();
        for(int i = inStr.length() - 1; i >= 0; i--){   // 반복문을 역순 순회 = index 값에서 -1, Index 의 0번째에서 -1을 해준다
            System.out.print(inStr.charAt(i));
            System.out.println();
        }
    }
}


