package JavaBasic;

import java.util.Scanner;

/* 1 ~ 1000 사이의 7의 배수를 구하고, 한줄에 10개 항목씩 출력하기
*  for (초기값; 최종값; 증감값;) { } */
public class LoopEx {
    public static void main(String[] args) {
            int i;
        int count = 0;

        for (i = 1; i <= 1000; i++) {
            if (i % 7 == 0) {
                System.out.printf("%5d", i);
                count++;

                if (count == 10) {
                    System.out.println();
                    count = 0;
                }
            }

        }
    }
}
