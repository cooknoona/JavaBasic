package CollectionFrameWork.ListPractice;

import java.math.BigDecimal;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 객체 생성
        Order order = new Order();  // Order 객체 생성
        // while 문 프로그램이 종료되지 않는 한 무한 반복한다
        while (true) {
            System.out.println("\n==== 주문 관리 시스템 ====");
            System.out.println("1. 제품 추가");
            System.out.println("2. 제품 제거");
            System.out.println("3. 제품 목록 보기");
            System.out.println("4. 제품 검색");
            System.out.println("5. 최종 가격 계산 (세금 포함)");
            System.out.println("6. 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {  // 조건문 시작
                case 1:
                    System.out.print("추가하실 제품의 이름을 입력 하세요 : ");
                    String name = sc.nextLine();    // Scanner 를 통해 문자열로 제품 이름을 입력
                    System.out.print("추가하실 제품의 가격을 입력 하세요 : ");
                    BigDecimal price = sc.nextBigDecimal(); // Scanner 를 통해 문자열로 가격 값을 입력
                    order.addItem(new Product(name, price));    // 제품 이름과 가격을 products[] 안에 입력
                    System.out.println("제품이 추가 되었습니다.");
                    break;
                case 2:
                    System.out.print("제거하실 제품의 이름을 입력 하세요 : ");
                    String removeName = sc.nextLine();  // 삭제 할 이름을 입력 받는다
                    if (order.removeItem(removeName)) { // 입력 받은 값과 기존에 있는 값이 동일하면 삭제
                        System.out.println(removeName + " 제품이 제거 되었습니다.");
                    } else {    // 입력 값이 동일 하지 않을 경우
                        System.out.println("해당 제품을 찾을 수 없습니다.");
                    }
                    break;
                case 3:
                    System.out.println("=======제품목록=======");
                    for (Product product : order.getProducts()) {   // 반복문을 통해 product 내의 값을 출력
                        System.out.println(product.getName() + " - " + product.getPrice());
                    }
                    break;
                case 4:
                    System.out.print("검색할 제품의 이름을 입력 해 주세요 : ");
                    String findItemByName = sc.nextLine();  // 찾을 제품의 이름 값을 입력 받는다
                    Product product = order.getItem(findItemByName);
                    if (product != null) {  // product 안에 값이 있다면 출력
                        System.out.println(product.getName() + " - " + product.getPrice());
                    } else {
                        System.out.println("해당하는 이름의 제품을 찾을 수 없습니다.");
                    }
                    break;
                case 5:
                    System.out.print("적용하실 세율을 입력 하세요 : ");
                    BigDecimal taxRate = new BigDecimal(sc.nextLine()); // 세율 객체 생성과 동시에 Scanner 로 입력 값에 넣는다
                    BigDecimal finalPrice = order.calculateFinalPrice(taxRate); // 최종가격
                    System.out.println("세금이 포함된 가격은 : " + finalPrice);
                    break;
                case 6:
                    System.out.println("프로그램을 종료 합니다.");
                    return;
                default:
                    System.out.println("다시 선택해 주세요.");
            }
        }
    }
}
