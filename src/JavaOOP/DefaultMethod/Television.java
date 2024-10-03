package JavaOOP.DefaultMethod;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnON() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOFF() {
        System.out.println("TV를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else {
            this.volume = volume;
        }
    }
    void getInfo() {
        System.out.println("TV 입니다.");
        System.out.println("현재 음량은 : " + volume + " 입니다.");
    }
}
