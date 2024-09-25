package JavaBasic;

import java.util.Arrays;

/* 정렬 알고리즘 구현해보기
*  정렬의 종류는 버블정렬 O(n^2), 삽입정렬  O(n^2), 병합정렬 O(nlogn), O(nlogn) */
public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 10, 5, 8, 7, 6};
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for (int e : arr)
            System.out.print(e + " ");
    }
}
