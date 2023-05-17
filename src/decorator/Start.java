package decorator;

import decorator.decorators.DoubleDrink;
import decorator.decorators.Milk;

public class Start {
    public static void main(String[] args) {
        order("Expresso", new Expresso());
        order("Tea", new Tea());
        order("Lungo", new DoubleDrink(new Expresso()));
        order("Cafe Au Lait", new Milk(new Expresso()));
        order("Disorder", new DoubleDrink(new Milk( new Tea())));
    }

    public static void order(String name, Drink drink){
        System.out.println("Ordering a "+ name);
        drink.serve();
        System.out.println("R$"+ drink.getPrice());
        System.out.println("------------------");
    }
}
