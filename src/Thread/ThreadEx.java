package Thread;

public class ThreadEx {
    public static void main(String[] args) {
        Thread subThread1 = new Thread();
        subThread1.start();
        System.out.println("여기는 메인 쓰레드가 끝나는 지점입니다.");
    }
}


class CustomThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}

