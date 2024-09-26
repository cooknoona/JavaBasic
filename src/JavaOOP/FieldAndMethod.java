package JavaOOP;
/* 필드 : 변수의 속성을 표현하는 필드
*  메서드 : 동작을 규정, 함수와 동일한 형태이고 클래스 내부에 존재
*  자바는 클래스 기반의 언어이므로 클래스 외부에 별도의 함수가 존재 할 수 없음 */
public class FieldAndMethod {
    public static void main(String[] args) {    // 메인 메서드
        FieldAndMethod test = new FieldAndMethod(); // 객체로 구성
        int sum = test.sum(100, 200);   // 참조변수
        System.out.println(sum);

        int sum2 = sum2(100, 200);
        System.out.println(sum2);
        System.out.println(sum2(100, 200));
        System.out.println(sum2("TEST", "CHECK"));
        System.out.println(sum2("TEST2", 1234));
        System.out.println(sum2(1, 2, 3, 4, 5, 6, 7, 8));
        String factory = "현대자동차 울산 공장";
        Car gv70 = new Car("GV70", 220, 280, "Black");  // 객체1
        Car ionic5N = new Car("아이오닉5N", 250, 600, "White"); // 객체2
        Car x6 = new Car("X6", 230, 350, "Grey");   // 객체3
        Car santafe = new Car();
        Car sorento = new Car("쏘렌토");
        santafe.getCarInfo();
        sorento.getCarInfo();
        gv70.getCarInfo();
        ionic5N.getCarInfo();
        x6.getCarInfo();
        System.out.println("차량 " + Car.productNumber + " 대 생성 되었습니다");
        System.out.println("제조사 : " + Car.company);
    }
    // 인스턴스 메서드
    int sum(int a, int b) {
        return a + b;
    }
    // 클래스 메서드, 매개변수의 입력이 존재, 반환 값도 존재 (Call Stack)
    static int sum2(int c, int d) {
        return c + d;
    }
    static String sum2(String c, String d) {    // 메서드 오버로딩
        return c + d;
    }
    static String sum2(String c, int d) {   // 메서드 오버로딩, 15번줄 코드에 d 값이 int 값 이므로 매개변수에 d를 int 로 바꾼다
        return c + d;
    }
    // 매개변수 개수를 알 수 없을 때 사용 하는 방법
    static int sum2(int ...val) {
        int sum2 = 0;
        for (int e : val) {
            sum2 += e;
        }
        return sum2;
    }
}

class Car {
    static int productNumber = 0;   // 클래스 필드, 프로그램 생성 시, 즉 클래스가 만들어질 메모리 생성
    static String company = "현대자동차";    // 클래스 필드
    String modelName;   // 인스턴스 필드
    int speed;  // 인스턴스 필드
    int horsePower; // 인스턴스 필드
    String colour;  // 인스턴스 필드
    Car() {
        modelName = "싼타페";
        speed = 200;
        horsePower = 200;
        colour = "Yellow";
        productNumber +=1;
    }
    Car(String name) {
        this.modelName = name;
        speed = 200;
        horsePower = 200;
        colour = "Red";
        productNumber +=1;
    };
    // 매개변수가 있는 생성자, 클래스를 객체로 만들 때 호출
    Car(String name, int speed, int power, String colour) {
        this.modelName = name;
        this.speed = speed; // this 는 자기 객체를 참조하는 변수
        this.horsePower = power;
        this.colour = colour;
        productNumber +=1; // 클래스 필드
    }
    void getCarInfo() {
        System.out.println("이름 : " + this.modelName);
        System.out.println("속도 : " + this.speed);
        System.out.println("마력 : " + this.horsePower);
        System.out.println("색상 : " + this.colour);
        System.out.println("----------------------------");
    }

}