package factory.factory.factory;

import factory.factory.model.Iphone;
import factory.factory.model.Iphone13;

public class IPhone13Factory extends IPhoneFactory{

    @Override
    public Iphone createIPhone() {
        return new Iphone13();
    }
}
