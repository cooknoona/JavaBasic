package JavaOOP.MultipleInterface;

public interface AirCon {
    int MAX_TEMP = 30;  // final static 이 자동으로 추가, 상수로 처리, 설계 명세서 역할
    int MIN_TEMP = 0;   // 위와 같음
    void airConON();    // public abstract 가 자동으로 추가, 서브 클래스에서 반드시 오버라이딩 필요함 (메서드 구현)
    void airConOFF();   // 위와 같음
    void setAirConTemp(int tmp);
}
