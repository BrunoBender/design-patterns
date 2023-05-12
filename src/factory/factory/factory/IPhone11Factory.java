package factory.factory.factory;

import factory.factory.model.Iphone;
import factory.factory.model.Iphone11;

public class IPhone11Factory extends IPhoneFactory{

    @Override
    public Iphone createIPhone() {
        return new Iphone11();
    }
}
