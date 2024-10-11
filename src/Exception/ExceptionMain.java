package Exception;

import java.io.IOException;

public class ExceptionMain {
    public static void main(String[] args) {
        IOSample ioSample = new IOSample();
        try {
            ioSample.input();
        } catch (IOException e) {
            System.out.println("호출된 메서드에서 예외 처리를 하지 않았기 때문에 호출된 예외처리");
        }
        ioSample.output();
    }
}
// 예외처리 미루기
class IOSample {
    private int num;

    public void input() throws IOException {
//        try {
            num = System.in.read(); // ASCII 코드 값 반환
//        } catch (IOException e) {
//            System.out.println(e + " 예외 발생!");
//        }
    }

    public void output() {
        System.out.println(num);
    }
}