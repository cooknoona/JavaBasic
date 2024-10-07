package Generic;

public class GenericPrinterMain {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();  // Powder 타입의 객체 생성
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
//        System.out.println(powder.toString());
//        powder.doPrinting();
        powderPrinter.printing();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
//        System.out.println(plastic.toString());
//        plastic.doPrinting();
        plasticPrinter.printing();

        GenericPrinter<Nylon> nylonPrinter = new GenericPrinter<>();  // Powder 타입의 객체 생성
        nylonPrinter.setMaterial(new Nylon());
        Nylon nylon = nylonPrinter.getMaterial();
        nylonPrinter.printing();

    }
}

