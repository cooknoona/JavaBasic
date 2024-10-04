package JavaOOP.MultipleInterface;

public class SportCar extends Car implements AirCon, AutoDrive {
    private boolean isAirCon;   // AirCon ON/OFF
    private int setTemp;
    private boolean isAutoDr;
    private boolean isTurbo;

    public SportCar(boolean isAirCon, int setTemp, boolean isAutoDr, boolean isTurbo) {
        super(150, "White", "2000");
        this.isAirCon = isAirCon;
        this.setTemp = setTemp;
        this.isAutoDr = isAutoDr;
        this.isTurbo = isTurbo;
    }

    @Override
    public void airConON() {
        System.out.println("에어컨을 켭니다.");
    }

    @Override
    public void airConOFF() {
        System.out.println("에어컨을 끕니다.");
    }

    @Override
    public void setAirConTemp(int tmp) {
        System.out.println("에어컨의 온도를 " + tmp + "로 변경 합니다.");
    }

    @Override
    public void autoDrON() {
        System.out.println("자율주행 모드를 켭니다.");
    }

    @Override
    public void autoDrOFF() {
        System.out.println("자율주행 모드를 끕니다.");
    }

    public void viewInfo() {
        String airConStr = (isAirCon) ? "ON" : "OFF";
        String autoStr = (isAutoDr) ? "ON" : "OFF";
        String turboStr = (isTurbo) ? "ON" : "OFF";

        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + colour);
        System.out.println("제작연도 : " + year);
        System.out.println("에어컨 : " + airConStr);
        System.out.println("에어컨 온도 : " + setTemp);
        System.out.println("자율 주행 : " + autoStr);
        System.out.println("터보 모드 : " + turboStr);
    }
}
