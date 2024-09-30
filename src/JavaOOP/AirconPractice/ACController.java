package JavaOOP.AirconPractice;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class ACController {
    public static void main(String[] args) throws InterruptedException {
        AC ac = new AC();
        Scanner sc = new Scanner(System.in);
        int elapsedTime = 0;    // 경과시간을 계산하기 위한 변수
        boolean isSetTemp = false;  // 온도가 변경 될 상황인지 확인하는 조건
        System.out.print("에어켠을 켜시겠습니까?(yes / no) : ");
        String isOn = sc.next();
        if (isOn.equalsIgnoreCase("yes")) {
            ac.setPower(true);  // 에어컨 켜기
            ac.setACStatus();   // 온도 설정과 바람세기 설정
            while (true) {  // 현재 온도와 설정 온도가 같을 때 까지 반복
                sleep(500);
                elapsedTime++;  // 1초마다 경과 시간 값이 1씩 증가
                switch (ac.getWindLevel()) {
                    case 1: if (elapsedTime >= 60)
                        isSetTemp = true;
                    break;
                    case 2: if (elapsedTime >= 30)
                        isSetTemp = true;
                    break;
                    case 3: if (elapsedTime >= 20)
                        isSetTemp = true;
                    break;
                }
                if (isSetTemp) {
                    if (ac.isHeater()) {
                        ac.setCurrTemp(1);
                    }
                    if (ac.isCooler()) {
                        ac.setCurrTemp(-1);
                    }
                    ac.ACInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }
                // 현재 온도와 설정 온도가 같으면
                if (ac.getCurrTemp() == ac.getSetTemp()) {
                    System.out.println("에어컨을 종료 합니다.");
                    break;
                }
            }
        }
    }
}
