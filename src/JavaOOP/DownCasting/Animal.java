package JavaOOP.DownCasting;

public class Animal {   // 상위 클래스
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {    // 서브 클래스
    @Override   // 오버라이딩 문법 확인을 위한 Annotation
    public void move() {    // 메서드 오버라이딩
        System.out.println("사람이 두 발로 걷습니다.");
    }
    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {    // 서브 클래스
    @Override
    public void move() {     // 메서드 오버라이딩
        System.out.println("호랑이가 네 발로 움직입니다.");
    }
    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {    // 서브 클래스
    @Override
    public void move() {    // 메서드 오버라이딩
        System.out.println("독수리가 하늘을 납니다.");
    }
    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 하늘을 나릅니다.");
    }
}