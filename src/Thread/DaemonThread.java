package Thread;
/* DaemonThread : 다른 스레드의 작업을 돕는 보조적인 역활을 수행하는 스레드
*  데몬스레드 이외의 스레드가 모두 종료되면 데몬스레드도 강제 종료 된다 */
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); // Daemon 스레드로 만듬
        autoSaveThread.start();
        Thread.sleep(30000);
    }
}

class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장");
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            save();
        }
    }
}
