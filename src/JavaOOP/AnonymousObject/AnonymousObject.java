package JavaOOP.AnonymousObject;

public class AnonymousObject {
    public static void main(String[] args) {
//        Child child = new Child();
//        child.methodParent();
        ChildTwo childTwo = new ChildTwo();
        childTwo.parent.methodParent();
    }
}

class Parent {
    String name = "Parent class";
    void methodParent() {
        System.out.println("Parent method " + this.name);
    }
}
class ChildTwo {
    Parent parent = new Parent() {
        int childField;
        void methodChild() {
            System.out.println("자식이 별도로 만든 메서드");
        }
        @Override
        void methodParent() {
            System.out.println("부모의 메서드를 오버라이딩");
        }
    };
}

class Child extends Parent {
    String name = "Child class";
    @Override
    void methodParent() {
        System.out.println("Class name : " + this.name);
        System.out.println("Class name : " + super.name);
    }
}
