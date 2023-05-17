package decorator.decorators;

import decorator.Drink;

public class DoubleDrink extends DrinkDecorator {


    public DoubleDrink(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        drink.serve();
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() * 2d;
    }
}
