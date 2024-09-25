package JavaBasic;
/* 참조타입이란? 할당된 변수에 실제 값이 저장되는 것이 아니라 주소가 저장 된다
*  참조하는 대상이 없는 경우 : NullPointerException */
public class ReferenceType {
    public static void main(String[] args) {
        String name = "";   // name 변수 안에 내용이 없음
        String name2 = null;    // name2 변수 안에 참조하는 대상이 없음
        int age = 0;    // 참조타입이 아니기 때문에 null 값 사용 X
        Integer age2 = null;    // Auto unboxing 기능에 의해 참조타입으로 취급
        Integer age3 = 0;

        int[] arr = null;   // 참조 타입은 초기값을 null 지정

        Integer boxVal = null;
        int intVal = boxVal;
        System.out.println(intVal);
    }
}
