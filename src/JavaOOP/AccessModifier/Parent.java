package JavaOOP.AccessModifier;

public class Parent {
    protected String name;    // 접근 제한자가 없으면 default, 같은 패키지 내에서만 접근 가능
    String money;
    protected String addr;

    public Parent() {
        name = "이건희";
        money = "2000억";
        addr = "서울시 강남구 역삼동";
    }
}