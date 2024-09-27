package JavaOOP.SuperMethod;
/* super() : 일반적으로 부모의 생성자 호출방법
*  super : 부모의 객체를 참조하는 변수
*  this : 자기 자신의 객체를 참조하는 변수 */
public class SuperMain {
    public static void main(String[] args) {
        Child child = new Child(30);
        child.childMethod();

    }
}

class Parent {
    int x = 10;
    Parent(int x) {
        this.x = x;
    }
}
class Child extends Parent {
    int x = 20;

    Child(int x) {
        super(x);
    }

    // 자식 클래스가 생성자를 만들지 않아도 되는 이유
    // 부모의 클래스 생성 시 생성자를 만들지 않으면 기본생성자 생성됨
    // 기본 생성자는 별도로 호출하지 않아도 자동으로 호출된다

    void childMethod() {
        System.out.println(x);  // 20 => 20
        System.out.println(this.x);  // 20 => 20
        System.out.println(super.x);   // 10 => 30
    }
}
