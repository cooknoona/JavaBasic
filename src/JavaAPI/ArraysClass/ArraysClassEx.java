package JavaAPI.ArraysClass;

import java.util.*;

/* 배열과 관련된 다양한 메서드를 제공하는 클래스 */
public class ArraysClassEx {
    public static void main(String[] args) {
//        sortAndSearchFunc();
        sortComparator();
        Integer[] array = {5, 4, 2, 7, 9, 3, 15, 25, 9};
        List<Integer> list = Arrays.asList(array);  // 배열을 리스트로 변환하는 메서드
    }
    // 정렬과 검색
    static void sortAndSearchFunc() {
        Integer[] array = {5, 4, 2, 7, 9, 3, 15, 25, 9}; // 제네릭 변화를 위해 int -> Integer 로 객체화 (16Line 참조)
        Arrays.sort(array); // 오름차순으로 해당 리스트 안의 값을 정렬
//        Arrays.sort(array, Collections.reverseOrder());   // 내림차순으로 해당 리스트안의 값을 정렬
        for (int e : array) {
            System.out.print(e + " ");
        }
        // 중복값이 있을땐 BinarySearch 는 순차적으로 값을 반환하기 보다는 무작위로 반환한다
        System.out.println("결과에 대한 인덱스 : " + Arrays.binarySearch(array, 9));
    }
    // 정렬 오버라이딩 : 상속 받은 메서드를 재정의
    // 과일이름을 정렬할때 길이가 짧은 순으로 정렬하고 길이가 같은 경우 사전 정렬 하는 경우
    // Comparator 클래스의 Compare 메서드를 오버라이딩 해서 정렬 조건을 만든다
    static void sortComparator() {
        Integer[] array = {5, 4, 2, 7, 9, 3, 15, 25, 9};
        Arrays.sort(array, new Comparator<Integer>() {  // 일회용성의 익명의 객체를 생성
            @Override
            public int compare(Integer o1, Integer o2) {    // 오버라이딩 메서드 생성
                if (o1 > o2)
                    return 1;
                return -1;
            }
        });
        for (int e : array) {
            System.out.print(e + " ");
        }
    }
}
