package InheritancePractice;

import static InheritancePractice.CommonSetting.*; // 마지막에 * 이 오면 클래스 내에 지정해놓은 final 키워드 사용 가능

public class ProtoTypeTV {
    boolean isPower;    // 전원에 대한 설정값
    int channel;
    int volume;
    public ProtoTypeTV() {}
    public ProtoTypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    void setChannel(int cnl) {
        if (cnl >= PROTOTYPE_MIN_CHANNEL && cnl <= PROTOTYPE_MAX_CHANNEL) {
            channel = cnl;
        } else {
            System.out.println("올바른 채널 설정 범위가 아닙니다.");
        }
    }
}
