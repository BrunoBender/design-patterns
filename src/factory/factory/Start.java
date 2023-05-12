package factory.factory;

import factory.factory.factory.IPhone11Factory;
import factory.factory.factory.IPhone13Factory;
import factory.factory.factory.IPhone13ProFactory;
import factory.factory.factory.IPhoneFactory;
import factory.factory.model.Iphone;

public class Start {
    public static void main(String[] args) {
        IPhoneFactory iPhone11Factory = new IPhone11Factory();
        IPhoneFactory iPhone13Factory = new IPhone13Factory();
        IPhoneFactory iPhone13ProFactory = new IPhone13ProFactory();

        Iphone iphone11 = iPhone11Factory.orderIPhone();
        Iphone iphone13 = iPhone13Factory.orderIPhone();
        Iphone iphone13Pro = iPhone13ProFactory.orderIPhone();
    }
}
