package JavaOOP;
/* this : 자기 자신의 객체를 참조하는 변수
*  this()메서드 : 다른 생성자 호출 할 때 사용 */
public class ThisMethod {
    public static void main(String[] args) {
        Car2 car = new Car2();

    }
}
class Car2 {
    private String name;
    private  String year;
    private String colour;
    private int speed;

    public Car2(String name, String year, String colour) {
        this.name = name;
        this.year = year;
        this.colour = colour;
    }

    public Car2(String name, String year, String colour, int speed) {
        this.name = name;
        this.year = year;
        this.colour = colour;
        this.speed = speed;
    }
    public Car2() {
        this("싼타페", "2024", "검정색");
    }
}
