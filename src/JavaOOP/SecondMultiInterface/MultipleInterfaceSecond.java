package JavaOOP.SecondMultiInterface;

public class MultipleInterfaceSecond {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.sell();
        customer.buy();
        customer.order();
    }
}

interface Buy {
    void buy();
    default void order() {
        System.out.println("구매주문");
    }
}

interface Sell {
    void sell();
    default void order() {
        System.out.println("판매주문");
    }
}

class Customer implements Buy, Sell {

    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void order() {
        System.out.println("고객주문");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }
}

