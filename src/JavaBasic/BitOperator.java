package JavaBasic;

public class BitOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 & num2);    // = 8
        System.out.println(num1 | num2);    // = 14
        System.out.println(num1 ^ num2);    // = 6, xor
        System.out.println(~num1);    // = -11
        System.out.println(num1 << 1);  // = 20, 쉬피트 연산자
        System.out.println(num1 >> 1);  // = 5
    }
}
