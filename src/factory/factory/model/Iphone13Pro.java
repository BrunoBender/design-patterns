package factory.factory.model;

public class Iphone13Pro extends Iphone{

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("A20 Chipset");
        System.out.println("7Gb RAM");
    }
}
