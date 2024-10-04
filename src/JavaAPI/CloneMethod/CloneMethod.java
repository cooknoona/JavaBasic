package JavaAPI.CloneMethod;
/* clone() : 해당 인스턴스를 복제하여, 새로운 인스턴스를 생성해 반환 (얕은 복사가 발생하는 경우)
*  얕은 복사 : 필드의 값만 복사하는 방법, 기본 타입의 경우 값이 복사되고,
*  참조 타입의 경우는 참조하는 곳의 주소가 복사 */
public class CloneMethod {
    public static void main(String[] args) {
        Member member = new Member("cook", "cook1234", 20, "cook9", true);
//        Member member2 = member;    // 얕은 복사가 일어난다
        Member member2 = member.getMember();    // 깊은 복사

        member2.id = "test1234";
        member2.name = "홍길동";

        System.out.println("이름 : " + member.name);
        System.out.println("이름 : " + member2.name);

        System.out.println("아이디 : " + member.id);
        System.out.println("아이디 : " + member2.id);
    }
}
