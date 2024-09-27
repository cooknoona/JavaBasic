package JavaOOP;

import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args) {
        Driver driver = new Driver("홍길동");
        Scanner sc = new Scanner(System.in);
        System.out.print("운전하고 싶은 차를 선택 [1]SUV [2]버스 [3]택시 : ");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                driver.drive(new Suv());
                break;
            case 2:
                driver.drive(new Bus());
                break;
            case 3:
                driver.drive(new Taxi());
                break;
            default:
                System.out.println("선택한 차량이 준비되어 있지 않습니다.");
        }

    }
}

class Driver {
    String name;
    Driver(String name) {
        this.name = name;
    }
    void drive(Vehicles v) {
        System.out.print(name + "의 ");
        v.move();
    }
}

class Vehicles {
    void move() {
        System.out.println("탈것이 움직입니다");
    }
}
class Suv extends Vehicles {
    @Override
    void move() {
        System.out.println("스포츠카가 달립니다.");
    }
}
class Bus extends Vehicles {
    @Override
    void move() {
        System.out.println("버스가 달립니다");
    }
}
class Taxi extends Vehicles {
    @Override
    void move() {
        System.out.println("택시가 달립니다");
    }
}