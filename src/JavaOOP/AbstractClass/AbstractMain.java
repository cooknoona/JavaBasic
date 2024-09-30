package JavaOOP.AbstractClass;
/* 추상클래스 : 인스턴스화가 안되는 클래스
*  부모가 만든 추상 메서드는 자식이 반드시 구현해야 한다
*  단일 상속만 지원
*  명시적으로 Abstract 키워드를 사용해야 한다
*  일반 메서드도 포함 할 수 있음 */
public class AbstractMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone Pro 16");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();
    }
}
