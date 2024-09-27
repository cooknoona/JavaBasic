package JavaOOP;
/* 자식 클래스가 부모 클래스의 기능을 물려 받는 것
*  상속 받은 자식 클래스는 부모 클래스와 같거나 크다
*  부모 클래스 먼저 생성되고 자식 클래스 생성, 소멸시에는 자식 클래스는 사라지고
*  부모 클래스가 소멸
*  사용하는 이유? 재사용성, 확장성, 다형성(오버라이딩: 상속받은 기능을 재정의)
*  자바는 다중 상속을 지원하지 않음(다중과 유사한 기능을 제공하기 위해서 인터페이스가 있음)
*  키워드 extends
*  상속을 받지 않는 모든 클래스는 기본적으로 Object 클래스로 부터 상속을 받음
*  오버라이딩은 부모가 물려준 기능 재정의 하는 것 (재정의 하지 않으면 부모의 메서드 호출 된다) */
public class Inheritance {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("댕댕이");
        houseDog.sleep(4);

    }
}

class Animal {  // 부모 클래스
    protected String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Dog extends Animal {  // 자식 클래스
    void sleep() {
        System.out.println(name + " Zzz");
    }
}

class HouseDog extends Dog {    // 손자 클래스
    @Override
        // 오버라이딩 Annotation: 문법적 오버라이딩 관계 성립 여부 체크,
    // 오버라이딩 관계가 성립하려면 메서드 ㅇ;ㄹ,ㅁ거ㅣ 반환 타입도 같아야 한다
    void sleep() {
        System.out.println(name + " Zzz in the house"); // 재정의
    }
    // 오버라이딩 이후 오버로딩
    void sleep(int hour) {
        System.out.println(name + " Zzz in house for " + hour + "hour(s)");
    }
}
