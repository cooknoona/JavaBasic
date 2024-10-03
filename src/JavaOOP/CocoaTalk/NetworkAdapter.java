package JavaOOP.CocoaTalk;

public interface NetworkAdapter {
    void connect(); // public abstract 가 추가된다
    void send(String message);
}

class WiFi implements JavaOOP.CocoaTalk.NetworkAdapter {
    @Override
    public void connect() {

    }

    @Override
    public void send(String message) {
        System.out.println("WiFi >> " + message);
    }
}
class FiveG implements JavaOOP.CocoaTalk.NetworkAdapter {
    @Override
    public void connect() {

    }

    @Override
    public void send(String message) {
        System.out.println("5G >> " + message);
    }
}
class LTE implements JavaOOP.CocoaTalk.NetworkAdapter {
    @Override
    public void connect() {

    }

    @Override
    public void send(String message) {
        System.out.println("LTE >> " + message);
    }
}