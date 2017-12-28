package Presents;

public class Chocolate extends Present {

    private String type;

    public Chocolate(String brand, double price, double weight, String type) {
        super(brand, price, weight);
        this.type = type;
    }

    public Chocolate(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Шоколад: [" + super.toString() + "; тип = " + type + "]";
    }
}
