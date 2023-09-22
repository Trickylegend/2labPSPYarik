package main;
import by.IceCream;

public class Main {

    public static void main(String[] args) {
        IceCream item1 = new IceCream("28kop", 2.3f);
        IceCream item2 = new IceCream("30kop", 2.9f);
        IceCream []arItems = new IceCream[5];
        arItems[0] = new IceCream("50kop", 5.0f);
        System.out.println(IceCream.amountOfItems);
        System.out.println(IceCream.getAverageFat());
    }
}