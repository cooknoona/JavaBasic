package JavaBasic;
/* 자바의 배열은 동일한 데이터 요소가 연속적으로 저장되는 자료 구조
*  int[] arr = new int[4];
*  자바의 배열은 힙영역에 메모리가 할당되며, 크기를 지정해야 한다
*  배열의 개선된 형태는 List(Array List, Vector, Linked List)가 있다
*  배열이나 리스트의 형태는 시퀀스형 자료구조이므로 인덱스로 값을 접근 */
public class Array {
    public static void main(String[] args) {
        int[] grade = new int[3]; // 길이가 3인 integer 배열의 선언 및 생성

        grade[0] = 85;
        grade[1] = 65;
        grade[2] = 90;

        for (int i = 0; i < grade.length; i++) {
            grade[i] = grade[i] + 10; // 인덱스를 이용한 배열로의 접근
            System.out.println(grade[i] + " ");
        }
        System.out.println();


        for (int e : grade) {
            e = e + 10;
            System.out.println(e + " ");
        }
        System.out.println();

        for (int e : grade) {
            System.out.println(e + " ");
        }
    }
    static void arrayDefine() {
        int[] score = new int[4];   // Heap 영역에 메모리 공간을 확보
        int[] score2 = {88, 99, 43};   // 컴파일러 크기를 알 수 있으므로 크기 지정 필요 없음
        int[] score3;
        score3 = new int[3];
        int[] score4;
        score4 = new int[]{34, 55, 66};
    }
}
