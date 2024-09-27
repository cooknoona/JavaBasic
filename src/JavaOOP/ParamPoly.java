package JavaOOP;
/* 상속 관게를 이용해 매개변수에 자식 타입의 객체를 대입한다 */
public class ParamPoly {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new PlayStation());
        buyer.buy(new TV());
        buyer.buy(new Computer());
        buyer.buy(new Product());
        buyer.viewInfo();
    }
}

class Product {
    int price;
    int bonusPoint;
}
class TV extends Product {
    public TV() {
        this.price = 100;
        this.bonusPoint = 10;
    }
}
class Computer extends Product {
    public Computer() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}
class PlayStation extends Product {
    public PlayStation() {
        this.price = 120;
        this.bonusPoint = 10;
    }
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy (Product p) {
        money -= p.price;
        bonusPoint += p.bonusPoint;
    }
    void viewInfo() {
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);
    }
}
