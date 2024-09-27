package JavaOOP;
/* Final Keyword : 클래스, 필드, 메서드 선언 시 사용 할 수 있음
*  메서드 사용하는 경우 상속하면 오버라이딩을 금지 할 수 있음 */
public class OverrideWithInheritance {
    public static void main(String[] args) {
    }
}

class Vehicle {
    int speed;
    String colour;
    String name;
    final void accelerator() {  // final 키워드
        System.out.println("차의 속도가 증가 합니다");
    }
    final void breakPanel() {
        System.out.println("차의 속도가 감소합니다");
    }
}
class SportsCar extends Vehicle {
    boolean isTurbo;
    SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        colour = "Red";
    }
//    @Override         // final 키워드로 인해 오버라이딩 불가
//    void accelerator() {
//        System.out.println("차가 하늘을 날아요");
//    }
//    @Override
//    void breakPanel() {
//        System.out.println("차가 멈춰요");
//    }
    
    int getSpeed() {
        if (isTurbo)
            return speed *= 1.2;
        return speed;
    }
    void setTurbo(boolean isTurbo) {
        this.isTurbo = isTurbo;
    }
    void infoVehicle() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + colour);
        System.out.println("터보모드 : " + isTurbo);
    }
}
