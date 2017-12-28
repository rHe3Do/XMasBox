package Presents;

public class Candy extends Present {

    private String pack;

    public Candy(String brand, double price, double weight, String pack) {
        super(brand, price, weight);
        this.pack = pack;
    }

    public Candy(){}

    public static void pushCandyToBox(){

    }
    public String getpack() {
        return pack;
    }

    public void setPack(String pack) {

        this.pack = pack;
    }

    @Override
    public String toString() {
        return "Конфета: [" + super.toString() + "; упаковка = " + pack + "]";
    }
}
