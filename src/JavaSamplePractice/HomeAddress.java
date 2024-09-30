package JavaSamplePractice;
import java.util.Scanner;

public class HomeAddress {
    public static void main(String[] args) {
        int[] number = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};  // 각 자리에 대한 번호 크기
        int sum = 0;    // 총 자리수를 누적하기 위한 변수
        int[] rst = new int[100];   // 결과를 한번에 출력해야 하기 때문에 최대 100개의 결과 저장 배열 생성
        int index = 0;  // 인덱스 변수 생성

        Scanner sc = new Scanner(System.in);    // 스캐너 객체

        while (true) {  // 무한 반복문 생성
            String num = sc.nextLine();
            if (num.equals("0"))
                break;
            for (int i = 0; i < num.length(); i++) {
                sum += number[num.charAt(i) - '0'] + 1; // 120
            }
            rst[index++] = sum + 1; // 1은 숫자 마지막의 공백 한칸
            sum = 0;    // 총 자리수 누적을 위한 변수 초기화
        }
        for (int i = 0; i < index; i++) {
            System.out.println(rst[i]);
        }
    }
}