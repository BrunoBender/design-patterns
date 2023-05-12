package factory.factory.factory;

import factory.factory.model.Iphone;

public abstract class IPhoneFactory {

    public Iphone orderIPhone() {
        Iphone device = null;

        System.out.println("----------");
        device = createIPhone();
        device.getHardware();
        device.getCertificados();
        System.out.println("----------");

        return device;
    }

    public abstract Iphone createIPhone();

}
