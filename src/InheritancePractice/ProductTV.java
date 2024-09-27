package InheritancePractice;

import static InheritancePractice.CommonSetting.*;

public class ProductTV extends ProtoTypeTV {
    String name;
    boolean isInternetOn; // 인터넷 기능을 ON/OFF

    public ProductTV(String name) {
        super(false, 10, 10);    // super() 부모의 생성자를 호출
        this.name = name;
    }
    void setPower(boolean isPower) {
        this.isPower = isPower;
    }
    void setVolume(int vol) {
        if (vol >= MIN_VOLUME && vol <= MAX_VOLUME) {
            this.volume = vol;
        } else {
            System.out.println("올바른 볼륨 설정 범위가 아닙니다.");
        }
    }
    @Override
    public void setChannel(int cnl) {
        if (cnl >= PROTOTYPE_MIN_CHANNEL && cnl <= PROTOTYPE_MAX_CHANNEL) {
            channel = cnl;
            System.out.println("채널을" + channel + "으로 변경 하였습니다.");
        }   else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    // 오버로딩
    public void setChannel(int cnl, boolean isInternetOn) {
        if (isInternetOn) {
            System.out.println("인터넷 모드 입니다.");
            this.isInternetOn = true;
        } else {
            this.isInternetOn = false;
            if (cnl >= PROTOTYPE_MIN_CHANNEL && cnl <= PROTOTYPE_MAX_CHANNEL) {
                channel = cnl;
                System.out.println("채널을" + channel + "으로 변경 하였습니다.");
            }   else {
                System.out.println("채널 설정 범위가 아닙니다.");
            }
        }
    }
    void tvInfo () {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷 모드 : " + isInternetOn);
    }
}
