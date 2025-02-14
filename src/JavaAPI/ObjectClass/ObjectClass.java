package JavaAPI.ObjectClass;
/* Object 클래스 : 모든 자바 클래스의 조상 클래스
*  Object 클래스는 필드 없이 9개의 메서드로 구성 */
public class ObjectClass {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        System.out.println(student.getClass()); // 해당 객체의 클래스 타입을 반환
        // String 인 경우에는 문자열의 내용을 비교하는 동작
        // equal() 메서드는 해당 인스턴스를 매개변수로 전달 받는 참조 변수와 비교하여 결과를 반환
        // 해시코드를 비교 함
        System.out.println(student.equals(student2));
        student = student2;
        System.out.println(student.equals(student2));
        // 메모리에 로딩된 객체의 주소를 해쉬함수에 키값으로 전달하고 해쉬함수로 생성된 해쉬코드를 비교
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
        // toString() 대부분의 경우는 오버라이딩 해서 객체 내부의 정보를 표시한다
        // 오버라이딩을 하지 않는 경우는 해당 객체의 정보를 문자열로 출력
        // 패키지이름.클래스이름@해쉬코드에 대한 16진수표
        System.out.println(student.toString());
        System.out.println(student2.toString());
    }
}

class Student {
    int id;
    String name;
}
