package JavaOOP.DownCasting;

import java.util.ArrayList;
import java.util.List;

/* 다운캐스팅(DownCasting) : 상위 클래스형으로 변환 되었던 하위 클래스를 다시 원래 자료형으로 변환 하는 것
*  instance of: 인스턴스와 클래스의 관계 여부 */
public class DownCastingEx {
    // Animal 타입의 요소로 이루어진 ArrayList 선언
    List<Animal> animals = new ArrayList<>();
    public static void main(String[] args) {
        DownCastingEx downCast = new DownCastingEx();
        downCast.addAnimal();
        downCast.downCasting();
    }
    public void addAnimal() {
        animals.add(new Animal());  // Animal 클래스로 객체 생성 (주로 DB 에서 정보를 불러올때 객체를 생성해서 값을 담는다)
        animals.add(new Tiger());
        animals.add(new Human());
        animals.add(new Eagle());
//        for (Animal e : animals)e.move();
    }
    public void downCasting() {
        for (int i = 0; i < animals.size(); i++) {  // ArrayList 해당 인덱스 값을 가져 옴
            Animal ani = animals.get(i);
            if (ani instanceof Human) {
                Human h = (Human) ani;  // 다운 캐스팅은 명시적 형변환 필요
                h.readBooks();
            } else if (ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if (ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else {
                System.out.println("지원되지 않는 형 입니다.");
            }
        }
    }
}
