package factory.factory.model;

public class Iphone13 extends Iphone{

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("A15 Chipset");
        System.out.println("5Gb RAM");
    }
}
