package factory.factory.model;

public class Iphone11 extends Iphone{

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("A13 Chipset");
        System.out.println("4Gb RAM");
    }
}
