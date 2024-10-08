package CollectionFrameWork.SetInterface;


import java.util.HashSet;

public class SetMain {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        hashSet.add(new Member(1001, "홍길동"));
        hashSet.add(new Member(1002, "세종대왕"));
        hashSet.add(new Member(1003, "이순신"));
        hashSet.add(new Member(1003, "광개토대왕"));

        for (Member e : hashSet)
            e.showMember();
    }
}

class Member {
    int id;
    String name;

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.id == member.id)
                return true;
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}
