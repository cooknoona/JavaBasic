package JavaSamplePractice;
/* 이름은 String
 *  나이는 int, 0 ~ 199 까지만 정상으로 간주, 이외의 값이 입력되면 재 입력 요구
 *  만약, 숫자가 아닌 다른 값이 오는 경우에 대한 처리는 일단 무시
 *  성별은 문자 타입으로 입력, 남성은 'M' 또는 'm', 여성은 'F' 또는 'f'
 *  성별에 대한 출력은 "남성", "여성" 으로 출력
 *  직업은 정수로 입력 (1 ~ 4)입력하고, 출력은 1은 "학생", 2는 "회사원", 3은 "주부" 4는 "무직"
 *  1 ~ 4 이외의 값은 재 입력 요구
 *  모든 입력이 완료 되면 결과는 한번에 출력 */

import java.util.Scanner;

public class Member {
    // 속성 (필드) : 필드는 클래스 내에 존재하는 변수를 지칭한다, 인스턴스 필드, 정적 필드, 지역 변수
    // private : 접근 제한자
    private String name;
    private int age;
    private char gender;
    private int job;
    Scanner sc = new Scanner(System.in);

    // 자바에서 생성자를 만들지 않으면 기본 생성자가 자동으로 만들어진다
    public void setName() { // setter 입력값을 받는다
        System.out.print("이름을 입력 해 주세요 : ");
        name = sc.nextLine();
    }

    public void setAge() {
        while (true) {
            System.out.print("나이를 입력 해 주세요 : ");
            age = sc.nextInt();
            if (age >= 0 && age < 200)
                return; // break; void 는 반환 할 필요가 없기 때문에 return 값을 지정하지 않음
            System.out.println("나이 입력 범위를 벗어났습니다.");
        }
    }
    public void setGender() {
        while (true) {
            System.out.println("[남성 - M 또는 m] [여성 - F 또는 f]");
            System.out.print("성별을 입력 해 주세요 : ");
            gender = sc.next().charAt(0);   // 문자에 대한 입력은 문자열에 해당 인덱스의 문자를 추출
            switch (gender) {
                case 'M':
                case 'm':
                case 'F':
                case 'f':
                    return; // 위에 age 와 마찬가지로 크게 2가지 옵션 만 존재하기에 case 조건 충족시 return 을 해주면 코드가 간결해진다 (break 필요없음)
                default:
                    System.out.println("성별을 잘 못 입력 했습니다.");
            }
        }
    }
    public void setJob() {
        while (true) {
            System.out.println("[1.학생][2.회사원][3.주부][4.무직]");
            System.out.print("직업을 입력 해 주세요 : ");
            job = sc.nextInt();
            if (job > 0 && job < 5)
                return; // 위에 보기와 마찬가지로 2가지 옵션 존재 return 을 사용 함으로써 불 필요한 코딩과 움직임을 최소화
            System.out.println("직업을 잘 못 입력 했습니다.");
        }
    }
    public void getInfo() {
        String [] genderStr = {"", "남성", "여성"}; // 입력된 값과 배열의 인덱스를 일치하기 위해서 첫번째를 비워 둔다
        String [] jobStr = {"", "학생", "회사원", "회사원", "주부", "무직"};    // 직업에 대한 값을 인덱스에 넣어 일치하는지 확인
        System.out.println("======= 회원 정보 =======");    // 실제 화면에 보이는 출력
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);   // 인덱스 안의 0, 1, 2 에서 getGenderType 메서드 내에 리턴값을 돌려 받는다
        System.out.println("직업 : " + jobStr[job]);  // 마찬가지로 jobStr 안에 담겨진 값을 반환
    }
    public int getGenderType() {
        if (gender == 'M' || gender == 'm')
            return 1;
        else return 2;
    }

}
