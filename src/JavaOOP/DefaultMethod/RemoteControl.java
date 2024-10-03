package JavaOOP.DefaultMethod;

public interface RemoteControl {
    int MAX_VOLUME = 100;   // 인터페이스에 포함된 필드는 모두 상수로 만들어진다 (final static 이 추가된다)
    int MIN_VOLUME = 0; // 설계명세에서 볼륨의 설정 범위를 표시하기 위해서 사용 할 수 있음

    void turnON();  // 자동으로 public abstract 가 추가 된다
    void turnOFF();
    void setVolume(int volume);

    // 디폴트 메서드는 이후에 추가 (예외 조항)
    // 상속 받은 클래스에서오버라이딩 해도 되고, 하지 않아도 무관
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 모드 입니다.");
        }
        else {
            System.out.println("무음 모드를 해제 합니다.");
        }
    }

    static void changeBattery() {
        System.out.println("건전지를 교환 합니다.");
    }
}
