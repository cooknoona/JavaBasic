package JavaAPI.StringBufferAndBuilder;
/* 기본적으로 문자열처리는 String 클래스를 사용하는 것이 일반적
*  String 클래스로 문자열을 처리하는 경우 매번 새로운 문자열이 만들어진다
*  StringBuffer, StringBuilder 는 객체를 생성해 할당된 메모리에 계속 추가해 나가는 방식
*  StringBuffer, StringBuilder 두가지는 사용 방법이 완전 동일
*  StringBuffer 는 멀티 쓰레드 환경을 지원하고, StringBuilder 는 지원하지 않음 */
public class StringBufferEx {
    public static void main(String[] args) {
//        String rst = "";    // 빈 문자열과 null 은 다름 null 은 객체가 없고 빈 문자열은 값이 없음
//        rst += "안녕하세요";
//        rst += " ";
//        rst += "자바";
//        rst += " 공부합시다";
//        System.out.println(rst);
        StringBuilder sb = new StringBuilder();
        sb.append("안녕하세요");
        sb.append(" ");
        sb.append("파이썬");
        sb.append(" 공부합시다");
        sb.insert(0, "Hi ~ ");  // 해당하는 인덱스 자리에 추가 된다.
        sb.delete(0, 5);    // 시작지점 부터 5까지 삭제
        System.out.println(sb);
        System.out.println(sb.substring(0, 5)); // 문자열에서 해당하는 범위의 문자열 잘라낸다
    }
}
