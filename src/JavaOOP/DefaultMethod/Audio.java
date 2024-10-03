package JavaOOP.DefaultMethod;

public class Audio implements RemoteControl{
    private int volume; // 인스턴스 필드 (객체로 만들어진 변수)

    @Override
    public void turnON() {
        System.out.println("오디오 전원을 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("오디오 전원을 끕니다.");
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
        System.out.println("오디오 입니다.");
        System.out.println("현재 음량은 : " + volume + " 입니다.");
    }

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            System.out.println("오디오 무음 모드 입니다.");
        }
        else {
            System.out.println("오디오 무음 모드를 하제 합니다.");
        }
    }
}
