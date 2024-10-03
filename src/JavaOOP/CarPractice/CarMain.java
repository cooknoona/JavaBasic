package JavaOOP.CarPractice;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car;

        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carType = sc.nextInt();

        switch (carType) {
            case 1:
                System.out.print("스포츠카 이름 입력 : ");
                car = new SportCar(sc.next());
                break;
            case 2:
                System.out.print("승용차 이름 입력 : ");
                car = new Sedan(sc.next());
                break;
            case 3:
                System.out.print("버스 이름 입력 : ");
                car = new Bus(sc.next());
                break;
            default:
                System.out.println("잘못된 차량 선택입니다.");
                return;
        }
        int distance = car.setRegion(sc);
        int passengers = car.setPassenger(sc);
        boolean featureOn = car.setOption(sc);
        double weatherOpt = car.setWeather(sc);
        car.optionOnOff(featureOn);
        car.getCarInfo(distance, weatherOpt);
    }
}
