package JavaBasic;

import static java.lang.System.exit;

public class CommandInput {
    public static void main(String[] args) {    // 터미널에서 입력값을 받을 수 있음
        if(args.length != 2) {
            System.out.println("인자값이 2개 필요합니다.");
            exit(0);
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("결과 : " + (num1 + num2));
    }
}
