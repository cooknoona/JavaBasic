package JavaBasic;
/* Knuth-Morris_Pratt => KMP
*  Korea-Seoul => KS
*  Mirko-Slavko => MS */

import java.util.Scanner;

public class KmpRx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String name = sc.nextLine();

        char[] chName = name.toCharArray();
        for (char e : chName) {
            if (e >= 'A' && e <= 'Z')
                System.out.print(e);
        }


            }
        }
