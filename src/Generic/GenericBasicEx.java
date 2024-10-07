package Generic;

import java.util.ArrayList;
import java.util.List;
/* Generic 이란? 데이터 타입을 일반화 한다는 의미
*  데이터 타입 또는 자료구조에 상관없이 동일한 프로그래밍 가능
*  클래스나 메서드에서 사용 할 내부 데이터 타입을 컴파일 시 미리 지정하는 방식 사용 */
public class GenericBasicEx {
    public static void main(String[] args) {
        genericTypeVariableFunc();
    }
    // 제네릭 타입 제한 : 컴파일 시 타입 체크 가능, 출력문에 타입 변환 필요 없음
    static void genericFunc() {
        List<String> list = new ArrayList<>();  // 객체 생성시 <> 내에 타입을 정해 둠으로써 아래에 String 값을 받을 수 있다
        list.add("100");
        System.out.println(list.get(0));
    }
    static void genericTypeVariableFunc() {
        Person<String> p1 = new Person<>("홍길동");
        Person<Integer> p2 = new Person<>(1004);
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
    }
}

class Person<T> {   // <T> : 타입 변수를 의미하며, 관례상 매개변수가 1개인 경우 대문자 T로 표기
    private T info;
    Person(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }
}