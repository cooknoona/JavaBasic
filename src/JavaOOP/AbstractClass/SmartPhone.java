package JavaOOP.AbstractClass;

public class SmartPhone extends Phone {
    public SmartPhone(String name) {    // super 을 이용해서 객체필요
        super(name);
    }

    @Override
    void call() {
        System.out.println("부모의 요청으로 통화 가능을 구현 합니다.");
    }
    public void internet() {
        System.out.println("인터넷 검색 합니다.");
    }
}
