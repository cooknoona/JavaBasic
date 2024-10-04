package JavaOOP.ObjectManagement;

import java.util.Scanner;

public class ObjectArrayManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 인원 : ");   // 배열은 크기를 지정해야 한다
        int cnt = sc.nextInt();
        NameCard[] nameCards = new NameCard[cnt]; // NameCard 클래스(참조타입) 타입의 배열 생성

        System.out.println("정보 입력 : ");
        System.out.println("-".repeat(16));
        for (int i = 0; i < nameCards.length; i++) {
            nameCards[i] = new NameCard();  // 해당하는 배열의 인덱스에 생성된 객체의 주소를 대입
            System.out.print("이름 : ");
            nameCards[i].setName(sc.next());    // 매개변수의 값을 스캐너를 통해 입력 받는다
            System.out.print("나이 : ");
            nameCards[i].setAge(sc.nextInt());  // 나이 값을 입력 받는다
            System.out.print("이메일 : ");
            nameCards[i].setEmail(sc.next());   // 이메일 값을 입력 받는다
            System.out.print("전화번호 : ");
            nameCards[i].setPhone(sc.next());   // 전화번호 값을 입력 받는다
        }
        for (NameCard e : nameCards) e.printInfo();
    }
}
