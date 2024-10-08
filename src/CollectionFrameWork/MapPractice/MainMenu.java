package CollectionFrameWork.MapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMenu {
    static Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) {
        makeMenu();
        selectMenu();
    }
    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2000, "Coffee", "Basic Coffee"));
        map.put("Latte", new MenuInfo("Latte", 3500, "Coffee", "Milk Coffee"));
        map.put("Espresso", new MenuInfo("Espresso", 1500, "Coffee", "Basic Coffee"));
    }
    static void selectMenu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("메뉴를 선택 하세요 : ");
            System.out.print("[1]메뉴보기 [2]메뉴조회 [3]메뉴추가 [4]메뉴삭제 [5]메뉴수정 [6]프로그램 종료 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("=========== 메뉴 보기 ===========");
                    // key set 반복순회
                    for (String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("종류 : " + map.get(e).getCategory());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("설명 : " + map.get(e).getDescription());
                    }
                    break;
                case 2:
                    System.out.print("조회 할 메뉴를 입력 하세요 : ");
                    String findMenu = sc.next();
                    if (map.containsKey(findMenu)) {
                        System.out.println("메뉴 : " + map.get(findMenu).getName());
                        System.out.println("종류 : " + map.get(findMenu).getCategory());
                        System.out.println("가격 : " + map.get(findMenu).getPrice());
                        System.out.println("설명 : " + map.get(findMenu).getDescription());
                    } else {
                        System.out.println("입력하신 제품을 찾을 수 없습니다.");
                    }
                    break;
                case 3:
                    System.out.print("추가 할 메뉴를 입력 하세요 : ");
                    // containsKey(키) 확인 후 해당 메뉴가 없으면, put()
                    String addMenu = sc.next();
                    if (map.containsKey(addMenu)) {
                        System.out.println("다시 시도해 주세요.");
                    } else {
                        System.out.print("추가 할 제품의 가격을 입력 하세요 : ");
                        int addPrice = sc.nextInt();
                        System.out.print("추가 할 제품의 종류를 입력 하세요 : ");
                        String addCategory = sc.next();
                        sc.nextLine();
                        System.out.print("추가 할 제품의 설명을 입력 하세요 : ");
                        String addDescription = sc.nextLine();
                        map.put(addMenu, new MenuInfo(addMenu, addPrice, addCategory, addDescription));
                    }
                    break;
                case 4:
                    System.out.print("삭제 할 메뉴를 입력 하세요 : ");
                    // containsKey(키) 해당 키 존재 여부 확인하고 있으면 , remove(key)
                    String deleteMenu = sc.next();
                    if (map.containsKey(deleteMenu)) {
                        map.remove(deleteMenu);
                        System.out.println("성공적으로 삭제 하였습니다.");
                    } else {
                        System.out.println("다시 시도해 주세요");
                    }
                    break;
                case 5:
                    System.out.print("수정 할 메뉴를 입력 하세요 : ");
                    String editMenu = sc.next();
                    if (map.containsKey(editMenu)) {
                        System.out.print("수정 할 제품의 이름을 입력 하세요 : ");
                        String editName = sc.next();
                        System.out.print("수정 할 제품의 가격을 입력 하세요 : ");
                        int editPrice = sc.nextInt();
                        System.out.print("수정 할 제품의 종류을 입력 하세요 : ");
                        String editCategory = sc.next();
                        sc.nextLine();
                        System.out.print("수정 할 제품의 설명을 입력 하세요 : ");
                        String editDescription = sc.next();
                        sc.nextLine();
                        // 기존 메뉴(키) 삭제 후, 수정된 이름(키)로 새로 추가
                        MenuInfo updatedMenu = new MenuInfo(editName, editPrice, editCategory, editDescription);
                        map.remove(editMenu);  // 기존 이름으로 된 키 삭제
                        map.put(editName, updatedMenu);  // 새로운 이름으로 항목 추가
                        System.out.println("메뉴가 성공적으로 수정되었습니다.");
                    } else {
                        System.out.println("다시 시도해 주세요.");
                    }
                    break;
                case 6:
                    System.out.println("프로그램을 종료 합니다.");
                    return;
                default:
                    System.out.println("다시 시도해 주세요.");
            }
        }
    }
}
