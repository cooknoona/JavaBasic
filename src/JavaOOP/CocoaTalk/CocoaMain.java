package JavaOOP.CocoaTalk;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("길동");
        cocoaTalk.writeMessage("오늘 날씨가 갑자기 쌀쌀해 졌어요. 건강하게 활동 잘 하세요!");
        NetworkAdapter adapter = null;  // null 을 변수값으로 넣는 이유는 더미 값이 들어갈 수 있기 때문에
        Scanner sc = new Scanner(System.in);
        System.out.println("메세지를 전달 할 네트워크 선택 [1]WiFi [2]5G [3]LTE : ");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                adapter = new WiFi();
                break;
            case 2:
                adapter = new FiveG();
                break;
            case 3:
                adapter = new LTE();
                break;
            default:
                System.out.println("올바르지 않은 네트워크 입력 입니다.");
        }
        if (adapter != null) {
            cocoaTalk.send(adapter);
        }
    }
}
