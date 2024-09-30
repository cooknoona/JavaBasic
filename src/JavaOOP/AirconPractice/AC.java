package JavaOOP.AirconPractice;

import java.util.Calendar;
import java.util.Scanner;

public class AC {
    private boolean isPower;    // 전원 ON/OFF
    private int setTemp;        // 설정 온도
    private int currTemp;       // 현재 온도
    private boolean isCooler;   // 에어컨 동작 여부
    private boolean isHeater;   // 히터 동작 여부
    private int windLevel;      // 바람 세기 : 1단, 2단, 3단

    // 생성자에서 인스턴스의 초기값을 부여
    // 현재 온도를 가져오기 위해서 Calender 클래스를 이용해 현재가 몇월인지 운영체제로 가져와서
    // 미리 정해둔 온도 배열에서 온도 값 가져 옴
    public AC() {
        final int[] monthTemp = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 4};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH);    // 월 정보를 배열의 인덱스와 동일함
        currTemp = monthTemp[month];    // 해당 월에 대한 온도를 가져온다
        isPower = false;    // 공장 초기화 값
        setTemp = 18;   // 공장 초기화 온도 값
        isCooler = false;
        isHeater = false;
        windLevel = 1;
    }
    // 콘솔 화면에 현재 에어컨 정보 출력 하기
    // 온도가 바뀔 때 화면에 출력 되도록 구현
    void ACInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("========== 에어컨 정보 ==========");
        System.out.println("전원     : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 여부 : " + heaterStr);
        System.out.println("냉동 여부 : " + coolerStr);
        System.out.println("바람세기  : " + windStr[windLevel]);
    }

    public void setACStatus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도는 : " + currTemp + " 도(섭씨) 입니다.");
        System.out.print("희망 온도를 설정 하세요 : ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + " 도(섭씨) 입니다.");
        System.out.print("바람 세기를 설정 하세요 : ");
        windLevel = sc.nextInt();

        if (currTemp > setTemp) {   // 현재 온도가 더운 상태, 온도를 내리라는 의미
            System.out.println("냉방 모드를 실행합니다.");
            isCooler = true;
            isHeater = false;
        } else if (currTemp < setTemp) {    // 현재 온도가 추운 상태, 온도를 올리라는 의미
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }
    public boolean isPower() {
        return isPower;
    }

    public int getSetTemp() {
        return setTemp;
    }

    public int getCurrTemp() {
        return currTemp;
    }

    public boolean isCooler() {
        return isCooler;
    }

    public boolean isHeater() {
        return isHeater;
    }

    public int getWindLevel() {
        return windLevel;
    }

    public void setPower(boolean power) {
        isPower = power;
    }

    public void setSetTemp(int setTemp) {
        this.setTemp = setTemp;
    }

    public void setCurrTemp(int n) {    // 현재온도는 현재 온도에서 입력된 값이 추가된다
        this.currTemp += n;
    }

    public void setCooler(boolean cooler) {
        isCooler = cooler;
    }

    public void setHeater(boolean heater) {
        isHeater = heater;
    }

    public void setWindLevel(int windLevel) {
        this.windLevel = windLevel;
    }

}
