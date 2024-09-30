package JavaOOP.SingleTon;

public class Student {
    SingleTon singleTon = SingleTon.getSingleton();     // 이미 만들어진 싱글톤 객체의 주소를 대입

    void setInfo(String name, int id) {
        singleTon.name = name;  // 싱글톤 객체의 인스턴스 필드 접근
        singleTon.id = id;
    }
    void viewInfo() {
        System.out.println("이름 : " + singleTon.name);
        System.out.println("아이디 : " + singleTon.id);
    }
}
