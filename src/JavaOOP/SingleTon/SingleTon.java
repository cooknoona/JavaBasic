package JavaOOP.SingleTon;

public class SingleTon {
    String name;
    int id;
    // 정적 변수로 Singleton 클래스에 대한 참조 변수 =>
    private static SingleTon singleton = new SingleTon();
    private SingleTon() {
        name = "홍길동";
        id = 100;
    }
    static SingleTon getSingleton() {
        return singleton;
    }
}
