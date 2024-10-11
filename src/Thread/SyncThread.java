package Thread;

import static java.lang.Thread.sleep;

/*  Synchronisation : 한번에 한개의 스레드만 공유 자원에 접근 할 수 있도록,
*  락(lock) 을 걸어서 다른 스레드가 진행 중인 작업을 간섭하지 모하도록 하는 것 */
public class SyncThread {
    public static void main(String[] args) {
        shareThread shareThread = new shareThread();
        Thread thread1 = new Thread(() -> {
            shareThread.setValue(100);
        });
        Thread thread2 = new Thread(() -> {
            shareThread.setValue(10);
        });
        thread1.setName("쓰레드 1");
        thread2.setName("쓰레드 2");
        thread1.start();
        thread2.start();
    }
}

class shareThread {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {  // 두개의 값 출력을 하는 과정에서 값이 바뀔 수 있으므로 "synchronised" 필요
        this.value = value;
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "의 Value 값은 " + this.value + "입니다.");
    }
}