package JavaOOP.IPadPractice;

public class IPadProMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IPadPro iPadPro = new IPadPro("iPad Pro");
            if (!iPadPro.continueOrder())
                break;
            iPadPro.setScreen();
            iPadPro.setColour();
            iPadPro.setMemory();
            iPadPro.setNetwork();
            iPadPro.setName();
            iPadPro.setSerialNum();
            iPadPro.progressIPadPro();
            iPadPro.getInfo();
            iPadPro.iPadProCalcPrice();
        }
    }
}
