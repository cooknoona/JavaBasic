package JavaOOP;
/* 생성자 오버로딩 : 생성자는 클래스가 객체로 만들어 질 때 호출
*  생성자의 주요 사용 용도 : 인스턴스 필드를 초기화하기 위한 용도
*  생성자를 만들지 않으면 기본 생성자가 자동으로 생성된다(매개 변수가 없는 기본 생성된다)
*  생성자는 용도에 맞게끔 다양한 생성자를 만들 수 있다
*  생성자 오버로딩
*  생성자는 용도에 맞게끔 다양한 생성자를 만들 수 있다 */
public class ConstructorOverloading {
    public static void main(String[] args) {
        Television localTV = new Television();
        localTV.setChannel(5);
        localTV.setVolume(4);
        localTV.setVolume(40000);   // 값이 Television 클래스에 Volume 메서드에서의 범위를 벗어나서 출력이 되지 않음
        localTV.getTV();
        Television naTV = new Television(false, 22, 22);
        naTV.getTV();
    }

}
