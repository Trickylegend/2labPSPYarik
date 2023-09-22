package by;

public class IceCream {

    private String name;
    private boolean chocolate;

    private float fatPercentage;


    public static int amountOfChocolate;

    public static int amountOfItems;

    public static float sumOfFat;

    public String getName() {
        return name;
    }

    public boolean isChocolate() {
        return chocolate;
    }

    public float getFatPercentage() {
        return fatPercentage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChocolate(boolean chocolate) {
        this.chocolate = chocolate;
    }

    public void setFatPercentage(float fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public IceCream(){
        amountOfItems++;
    }

    public IceCream( String name, boolean chocolate, float fatPercentage) {
        amountOfItems++;
        this.name = name;
        this.chocolate = chocolate;
        this.fatPercentage = fatPercentage;
        sumOfFat += fatPercentage;
        if(chocolate){
            amountOfChocolate++;
        }
    }
    public IceCream ( String name, float fatPercentage) {
        amountOfItems++;
        this.name = name;
        this.chocolate = false;
        this.fatPercentage = fatPercentage;
        sumOfFat += fatPercentage;
    }

    public void printName() {
        System.out.println(name);
    }

    public void printChocolate() {
        System.out.println(chocolate);
    }

    public void printFatPercentage() {
        System.out.println(fatPercentage);
    }


    public static int getAmountOfChocolate() {
        return amountOfChocolate;
    }

    public static float getAverageFat(){
        return sumOfFat/amountOfItems;
    }


}
