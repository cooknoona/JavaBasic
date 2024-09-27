package JavaOOP;
/* 객체 타입 확인 : instance of
*  반환값(True/False) = 좌항(객체) instanceof 우항(클래스)
*  객체가 특정 클래스의 인스턴스 인지를 확인 하기 위해 사용 */
public class ObjectTypeCheck {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");
        
        // 객체가 클래스에 해당이 되는지 체크
        System.out.println(parent instanceof Parent);   // True
        System.out.println(child instanceof Parent);    // True
        System.out.println(parent instanceof Child);    // False
        System.out.println(child instanceof Child);     // True
    }
}
class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    String name;
    public Child(String name) {
        super(name);
        this.name = name;
    }
}
