package JavaSamplePractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Array List 를 이용한 자리수 공백 구하기
public class HomeAddArrayList {
    public static void main(String[] args) {
        int[] number = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        int sum = 0;
        List<Integer> rst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String num = sc.nextLine();
            if (num.equals("0"))
                break;
            for (int i = 0; i < num.length(); i++) {
                sum += number[num.charAt(i) - '0'] + 1;
            }
            rst.add(sum + 1);
            sum = 0;
        }
        for (int e : rst)
            System.out.println(e);
    }
}
