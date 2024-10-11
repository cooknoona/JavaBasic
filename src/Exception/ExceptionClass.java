package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 프로그램에서 오류가 발생하는 경우는 크게 두 가지
*  1. 컴파일 오류 (잘못된 문법에서 나오는 오류)
*  2. 런타임 오류 (실행중에 오류가 발생)
*  런타임 오류 보다 컴파일 오류 발생이 추후 오류 발견과 수정이 용이하다 */
public class ExceptionClass {
    public static void main(String[] args) {
//        arrayExceptionFunc();
//        fileNotFoundExceptionFunc();
//        nullPointExceptionFunc();
        arithmeticExceptionFunc();
    }

    static void arrayExceptionFunc() {
        try {
            int[] arr = new int[5];
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 배열의 범위를 벗어났습니다.");
        }
        System.out.println("프로그램 정상 종료");
    }

    static void fileNotFoundExceptionFunc() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("해당 파일이 없습니다. 계속 진행 하시겠습니까?");
        }
    }

    // NullPointerException
    static void nullPointExceptionFunc() {
        Test test = null;   // 참조하는 객체가 없음을 의미
        if (test != null) { // 예외처리가 가능 하지만 그렇게 하기 보다는 if 문으로 처리하는게 유리함
            System.out.println(test.name);
        } else {
            System.out.println("참조 객체가 생성되지 않았습니다.");
        }
    }
    static void arithmeticExceptionFunc() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("첫번째 정수 : ");
            int fNum = sc.nextInt();
            System.out.print("두번째 정수 : ");
            int sNum = sc.nextInt();
            int rst = fNum / sNum;
            System.out.println(rst);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println(e + "오류 발생");
        } finally {
            System.out.println("무조건 수행되는 구문");
        }
    }
}

class Test {
    String name = "민지";
}