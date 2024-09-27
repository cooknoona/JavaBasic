package JavaOOP;
/* Method Overloading : 같은 이름의 메서드를 중복하여 정의 하는 것 (정적 바인딩)
*  매개변수의 타입이나 개수로 구분한다
*  다형성을 구현하는 중요 요소
*  반환값이 접근 제한자는 해당 사항 없음 */
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));               // 정수 반환
        System.out.println(sum(10, 20, 30));        // 정수 반환
        System.out.println(sum(10, 3.33, 4.55));    // 실수 반환
        System.out.println(sum("SUM : ", 20, 20));  // 문자열 반환

    }

    static int sum(int x, int y) {
        return x + y;
    }
    static int sum(int x, int y, int z) {
        return x + y + z;
    }
    static double sum(int x, double y, double z) {
        return x + y + z;
    }
    static String sum(String x, int y, int z) {
        return x + (y + z);
    }
}
