package InheritancePractice;
/* Inheritance, Overloading, Overriding 동작을 이용해 TV 만들기 */
public class InheritanceTVMain {
    public static void main(String[] args) {
        ProductTV lgTV = new ProductTV("우리집 티비");
        lgTV.setPower(true);
        lgTV.setVolume(30);
        lgTV.setChannel(30, true);
        lgTV.tvInfo();
        ProtoTypeTV samTV = new ProductTV("남의집 TV");
        samTV.setChannel(1900);
    }
}
