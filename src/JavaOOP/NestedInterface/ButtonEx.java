package JavaOOP.NestedInterface;

public class ButtonEx {
    public static void main(String[]args) {
        // 버튼 이벤트 처리
        Button btn = new Button(); // 하나의 버튼 객체를 생성하고 리스너 등록에 따라서 다른 이벤트 처리
        btn.setOnClickListener(new CallListener());
        btn.touch();

        Button btn2 = new Button();
        btn.setOnClickListener(new MessageListener());
        btn2.touch();

    }
}
