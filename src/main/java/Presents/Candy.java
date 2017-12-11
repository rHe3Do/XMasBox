package Presents;

public class Candy extends Present {

    private String pack;

    public Candy(String brand, double price, double weight, String pack) {
        super(brand, price, weight);
        this.pack = pack;
    }

    public String getpack() {
        return pack;
    }

    public void setpack(String pack) {
        this.pack = pack;
    }

    @Override
    public String toString() {
        return "Candy: [" + super.toString() + "; упаковка = " + pack + "]";
    }
}
