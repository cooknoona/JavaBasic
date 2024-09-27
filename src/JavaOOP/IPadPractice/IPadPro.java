package JavaOOP.IPadPractice;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static JavaOOP.IPadPractice.Common.*;
import static java.lang.Thread.sleep;

public class IPadPro {
    private Scanner sc;    // 입력을 받기 위한 스캐너
    private int screen;  // 11인치, 13인치
    private int colour; // 스페이스 그레이, 실버
    private int memory; // 256GB, 512GB, 1TB, 2TB
    private int network;    // Wi-Fi, Wi-Fi+Cellular
    private String name; // 각인 서비스 이름 저장
    private String productDate; // 제품 생산 일자
    String serialNum;   // 제품에 대한 일련번호
    private int price;  // 제품 구매 가격
    private static int cnt = 0; // 제품 생산 대수, 클래스 변수

    public IPadPro(String name) {   // 생성자는 클래스가 객체로 만들어 질 때 호출
        this.sc = new Scanner(System.in);
        this.name = name;
        Date now = new Date();  // 현재 시간을 운영 체제로부터 받아 온다
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now);
        cnt++;
        productDate += cnt; // 산술 연산이 아니고 문자열을 연결 함
    }

    public boolean continueOrder() {    // 주문을 할 지 안할지 선택하는 인터페이스
        System.out.println("====== iPad Pro 구입하기 ======");
        System.out.println("주문을 진행 하시겠습니까? yes, no");
        String isContinue = sc.next();
        if (isContinue.equalsIgnoreCase("yes"))
            return true;
        else return false;
    }

    public void setScreen() {
        System.out.print("디스플레이 선택 [1]11인치 / [2]13인치 : ");
        screen = sc.nextInt();
        if (screen == 1 || screen == 2)
            return;
        System.out.println("디스플레이 선택에 실패 하였습니다.");
    }

    public void setColour() {
        System.out.print("색상선택 [1]스페이스 그레이 / [2]실버 : ");
        colour = sc.nextInt();
        if (colour == 1 || colour == 2)
            return;
        System.out.println("색상 선택에 실패 하였습니다.");
    }

    public void setMemory() {
        System.out.print("용량 선택 [1]256GB / [2]512GB / [3]1TB / [4]2TB : ");
        memory = sc.nextInt();
        if (memory > 0 && memory < 5)
            return;
        System.out.println("용량 선택에 실패 하였습니다.");
    }

    public void setNetwork() {
        System.out.println("네트워크 종류 선택 [1]Wi-Fi Only / [2]셀룰러데이터 + Wi-Fi : ");
        network = sc.nextInt();
        if (network == 1 || network == 2)
            return;
        System.out.println("네트워크 종류 선택에 실패 하였습니다.");
    }

    public void setName() {
        System.out.println("각인 서비스를 신청 하시겠습니까? yes / no");
        String service = sc.next();
        if (service.equalsIgnoreCase("yes")) {
            System.out.print("이름을 입력 해 주세요 : ");
            name = sc.next();
        }
    }

    // 일련번호 제작
    public void setSerialNum() {
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memoryStr = {"", "256", "512", "1024", "2048"};
        String networkStr = (network == 1) ? "W" : "C";
        serialNum = "iPadPro" + screenStr + memoryStr[memory] + networkStr + productDate;
    }

    // 제품 옵션이 선택 완료시 출고까지 30초 동안 제품 생산 진행 상황을 보여주고 출고한다 (Sleep(30))
    public void progressIPadPro() throws InterruptedException {
        int cnt = 0;
        while (true) {
            sleep(10); // 1초를 의미한다
            cnt++;
            System.out.printf("<< iPadPro 제작 중 : [%d%%] >>\r", cnt);
            if (cnt >= 100)
                break;
        }
    }

    // 아이패드 프로 제품정보
    public void getInfo() {
        System.out.println("======아이패드 정보======");
        System.out.println("당신의 아이패드의 화면크기는 : " + screenType[screen]);
        System.out.println("당신의 아이패드의 색상은 : " + colourType[colour]);
        System.out.println("당신의 아이패드의 용량은 : " + memoryType[memory]);
        System.out.println("당신의 아이패드의 데이터 종류는 : " + networkType[network]);
        System.out.println("각인된 이름은 : " + name);
        System.out.println("일련번호는 : " + serialNum);
        System.out.println("총 가격은 : " + iPadProCalcPrice() + " 원 입니다");

    }

    // 선택한 옵션을 포함한 제품 가격 구하기
    public String iPadProCalcPrice() {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();

        int[] screenPrice = {0, 1499000, 1999000};
        int[] memoryPrice = {0, 0, 300000, 600000, 600000};
        int[] networkPrice = {0, 0, 300000};

        price += screenPrice[screen];
        price += memoryPrice[memory];
        price += networkPrice[network];
        return numberFormat.format(price);
    }
}

