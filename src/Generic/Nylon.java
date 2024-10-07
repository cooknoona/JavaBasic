package Generic;

public class Nylon extends Material {
    @Override
    public void doPrinting() {
        System.out.println("Nylon 재료로 출력 합니다.");
    }
    @Override
    public String toString() {  // 재정의 없이 기존의 toString 을 쓰면 class 해쉬코드값이 나와서 편의상 오버라이딩한다
        return "재료는 Nylon 입니다.";
    }
}
