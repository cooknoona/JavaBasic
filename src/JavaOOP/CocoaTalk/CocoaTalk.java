package JavaOOP.CocoaTalk;

public class CocoaTalk {
    private String to;  // 상대방 이름
    private String message; // 전달 할 메세지

    public CocoaTalk(String name) {
        to = name;
    }
    public void writeMessage(String message) {
        this.message = to + " : " + message;
    }
    public void send(NetworkAdapter adapter) {
        adapter.send(message);
    }
}
