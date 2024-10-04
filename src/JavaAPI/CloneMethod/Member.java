package JavaAPI.CloneMethod;
/* Cloneable 인터페이스는 복제 허용에 대한 선언 */
public class Member implements Cloneable {
    String id;
    String name;
    String password;
    int age;
    boolean isAdult;

    public Member(String name, String password, int age, String id, boolean isAdult) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.id = id;
        this.isAdult = isAdult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();  // 클론 메서드는 Object 타입이므로 형 변환이 필요
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
