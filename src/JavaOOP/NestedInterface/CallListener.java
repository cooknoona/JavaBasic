package JavaOOP.NestedInterface;

// 구현 클래스
public class CallListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
