package JavaBasic;
/* 변수란 값을 저장 할 수 있는 메모리 공간에 이름을 봍여 놓은 것
*  변수의 타입은 기본형(Primitive) 와 참조(Reference)로 나누어진다
*  자바는 JVM 이 미리 운영체제로 부터 메모리를 확보받고 재할당 해주는 개념
*  자바는 데이터형이 존재하기 때문에 사용 목적에 맞는 데이터 타입을 선언 해야 함 // 파이썬은 변수를 따로 설정하지 않는데 그럼 어떻게 최종적으로 int인지 long인지 어디에서 결정?
*  특수문자 중 $ 사용 가능
*  키워드 X, 숫자가 앞에 오면 X, 공백 X
*  카멜(Camel) 표기법 사용, 파이썬 Snake 표기법
*  변수 이름은 사용 목적에 맞게 지어야 함 */
public class Variables {
    public static void main(String[] args) {
        // 변수 선언만 하는 경우
        int age;
        String name;
        char gender;
        double avg;
        avg = 200.99;
        // 변수 선언과 동시에 값을 할당 하는 경우
        int num = 28;
        String nickName = "홍길동";
        System.out.println(avg);    // 값을 입력하지 않으면 에러 생김

        // 변수의 사용 범위 : 자바는 Block Scope 언어다 {}
        int n = 20; // {} 변수 n은 {}안의 변수와 같이 사용이 가능하나 {} 안의 변수 입력값을 {} 밖에 출력을 시도 할 수 없다
        {
            int m = 30; // {} 바깥에 혹은 뒤에 다시 동일한 이름으로 변수를 설정하면 {} 안의 변수는 소멸된다
            System.out.println(n + m);
        }
        int m = 30;
        System.out.println(n + m); // Block Scope 언어의 특성상 {} 안의 변수는 후에 재사용 불가

        byte testNum = 127;
        testNum++;
        System.out.println(testNum);

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);
        char ch2 = 66;
        System.out.println(ch2);

        float pie = 3.145649f;  // 변수 float 은 뒤에 f를 써줘야함
        double pie2 = 3.123124124;  // 변수 double 은 필요 없음

        double num10 = 0.0;
        for(int i = 1; i < 1000; i++){
            num10 += 0.1;
        }
        System.out.println(num10);

    }
}
