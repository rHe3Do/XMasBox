import Presents.*;

public class PresentBox {

    public static void main(String[] args){
        Candy mms = new Candy("M%M's",9.99 ,1.2 ,"пакетик");
        Chocolate mars = new Chocolate("Mars", 2.99, 0.65, "батончик");
        Present box[] = {mms, mars};
        double sumw = CalcWeight(box);
        double sump = CalcPrice(box);
        System.out.println("В рождественской коробке с подарками следующие сладости:");
        for (Present somePresent : box) {
            System.out.println(somePresent.toString());
        }
        System.out.println("Общая стоимость всех подарков = " + sump + "$");
        System.out.println("Общий вес всех подарков = " + sumw + "кг");
    }

    private static double CalcWeight(Present box[]){
        double sum = 0;
        for (Present somePresent : box) {
            sum += somePresent.getWeight();
        }
        return sum;
    }

    private static double CalcPrice(Present box[]){
        double sum = 0;
        for (Present somePresent : box) {
            sum += somePresent.getPrice();
        }
        return sum;
    }
}
