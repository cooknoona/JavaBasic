package JavaAPI.WrapperClass;
/* Wrapper 클래스란? 기본 타입의 데이터를 객체 타입으로 취급하도록 변환 해주는 클래스
*  각각 다른 기본타입을 객체로 변환시켜 사용한다  */
public class WrapperEx {
    public static void main(String[] args) {
//        IntegerEx integerEx = new IntegerEx();
//        integerEx.x = 100;
//        System.out.println(integerEx.x);
        Integer x = 100;    // Auto Boxing 위에 객체를 생성해 값을 넣는 번거러움을 없애고 최소화
        int xx = x; // Auto Unboxing
    }
}

//class IntegerEx {
//    int x;
//
//    IntegerEx(int x) {
//        this.x = x;
//    }
//}
