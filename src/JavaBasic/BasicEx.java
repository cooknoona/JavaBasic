package JavaBasic;
/* 자바는 컴파일(Javac)에 의해 바이트코드로 변환되며, 바이트 코트는 .class 파일에 저장 후에 JVM 에 의해 컴파일이 된다
*  클래스 이름은 대문자로 시작하며 카멜케이스 (BasicExampleJava) 로 명명한다.
*  또한 클래스 이름은 역활이나 기능을 나타내야 한다 예: Car, EmployeeManager, StudentManager
*  특수 문자 사용 금지: 클래스 이름에는 공백이나 특수 문자를 사용 할 수 없음 예: My Class, My@Class
*  예약어로 클래스 이름 명명 금지 예: class, public, static */

public class BasicEx {
    // public 은 접근 제한자, static(정적 메서드), void 는 반환값이 없음을 의미함
    // main 은 프로그램의 시작 지점, 프로그램 실행 시 인자값을 받기 위한 부분
    public static void main(String[] args)  {
        System.out.println("안녕하세요, 자바를 시작 합니다.");   // 문자형식과 줄 바꿈 있음
        System.out.print(7);  // 정수값을 출력하고 줄 바꿈 없음
        System.out.println(700);    // 정수값을 출력하고 줄 바꿈 있음
        System.out.println("문자열을 이어서 " + "출력 하기");
        System.out.println("성적 : " + 98 + 100);   // 문자열을 먼저 써서 + 연산자를 사용시 뒤에 계산은 문자열로 인식
        System.out.println(100 + 200 + "점수");   // 정수타입 + 문자열 사용시 앞에 정수 계산 후 문자열 출력
        System.out.printf("%d점\n", 300);
        System.out.printf("%s\n", "경기도 수원시");

        char gender = 'M';
        System.out.printf("%c\n", gender);  // 문자('M')와 문자열("Men")은 다르다. 근데 %s을 써도 작동은 한다?!
        System.out.printf("%.2f\n", 3.14123456);    // 소수점 2자리 까지 출력 (.2)
    }
}

