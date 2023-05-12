package factory.factory.factory;

import factory.factory.model.Iphone;
import factory.factory.model.Iphone13Pro;

public class IPhone13ProFactory extends IPhoneFactory{

    @Override
    public Iphone createIPhone() {
        return new Iphone13Pro();
    }
}
