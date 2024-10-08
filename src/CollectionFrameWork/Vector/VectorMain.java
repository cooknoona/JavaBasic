package CollectionFrameWork.Vector;

import java.util.List;
import java.util.Vector;

/* Vector 는 ArrayList 와 동일한 내부구조를 가지고 있음
*  차이점은 동기화(Synchronise)된 메서드로 구성되어 있어 멀티스레드 환경에서 안전
*   */
public class VectorMain {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("홍길동", "abcd1234@naver.com", "010-1234-5678", "무사"));
        list.add(new NameCard("이순신", "abcd2345@naver.com", "010-2345-6789", "장군"));
        list.add(new NameCard("세종대왕", "abc3456@naver.com", "010-3456-7890", "왕"));
        list.add(new NameCard("이성계", "abcd4567@naver.com", "010-4567-8901", "왕"));
        list.add(new NameCard("정약용", "abcd5678@naver.com", "010-5678-9012", "학자"));

        for (NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("메일 : " + e.email);
            System.out.println("번호 : " + e.phone);
            System.out.println("직업 : " + e.job);
        }
    }
}

class NameCard {
    String name;
    String email;
    String phone;
    String job;

    public NameCard(String name, String email, String phone, String job) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.job = job;
    }
}
