package JavaOOP.CarPractice;

import java.util.Scanner;

abstract class Car {
    double speed;
    int efficiency;
    int tankSize;
    int seat;
    String carName;
    final int GAS_PRICE = 2000;
    int[] regions = {0, 400, 150, 200, 300};


    public abstract void optionOnOff(boolean optionOn);

    public int setRegion(Scanner sc) {
        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int opt = sc.nextInt();
        while (opt < 1 || opt > 4) {
            System.out.println("올바르지 않은 입력입니다.");
            opt = sc.nextInt();
        }
        return regions[opt];
    }

    public int setPassenger(Scanner sc) {
        System.out.print("탑승할 승객 수 입력 : ");
        int passengers = sc.nextInt();
        while (passengers < 1 || passengers > 100) {
            System.out.println("올바르지 않은 입력입니다.");
            passengers = sc.nextInt();
        }
        return passengers;
    }

    public boolean setOption(Scanner sc) {
        System.out.print("부가기능 [1]ON [2]OFF : ");
        int option = sc.nextInt();
        while (option != 1 && option != 2) {
            System.out.println("올바르지 않은 입력입니다.");
            option = sc.nextInt();
        }
        return option == 1;
    }

    public double setWeather(Scanner sc) {
        System.out.print("날씨 [1]맑음 [2]비 [3]눈 : ");
        int weather = sc.nextInt();
        while (weather < 1 || weather > 3) {
            System.out.println("올바르지 않은 입력입니다.");
            weather = sc.nextInt();
        }
        if (weather == 2)
            return 1.2;
        if (weather == 3)
            return 1.4;
        return 1.0;
    }

    public void getCarInfo(int distance, double weatherOpt) {

        int requiredFuel = distance / efficiency;
        int refuelTimes = (requiredFuel + tankSize - 1) / tankSize;
        int totalPrice = requiredFuel * GAS_PRICE;


        double time = (distance / speed) * weatherOpt;
        int hours = (int) time;
        int minutes = (int) ((time - hours) * 60);


        System.out.println("===== " + carName + " =====");
        System.out.println("총 비용: " + totalPrice + "원");
        System.out.println("총 주유 횟수: " + refuelTimes + "회");
        System.out.println("총 이동 시간: " + hours + "시간 " + minutes + "분");
    }
}


class SportCar extends Car {
    public SportCar(String name) {
        this.carName = name;
        this.efficiency = 8;
        this.speed = 250;
        this.tankSize = 30;
        this.seat = 2;
    }

    @Override
    public void optionOnOff(boolean optionOn) {
        if (optionOn) {
            this.speed *= 1.2;
        }
    }
}

class Sedan extends Car {
    public Sedan(String name) {
        this.carName = name;
        this.efficiency = 12;
        this.speed = 200;
        this.tankSize = 45;
        this.seat = 4;
    }

    @Override
    public void optionOnOff(boolean optionOn) {
        if (optionOn) {
            this.seat += 1;
        }
    }
}

class Bus extends Car {
    public Bus(String name) {
        this.carName = name;
        this.efficiency = 5;
        this.speed = 150;
        this.tankSize = 100;
        this.seat = 20;
    }

    @Override
    public void optionOnOff(boolean optionOn) {
        if (optionOn) {
            this.tankSize += 30;
        }
    }
}

