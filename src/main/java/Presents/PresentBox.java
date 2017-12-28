package Presents;
import java.util.ArrayList;


public class PresentBox {

    private ArrayList<Present> box = new ArrayList<Present>();
    private double boxWeight = 0, boxPrice = 0;

    public void AddSweets(Present... sweet){
        System.out.println("В коробку были добавлены следующие сладости:");
        for (int i = 0; i < sweet.length; i++) {
            box.add(sweet[i]);
            System.out.println(sweet[i].toString());
        }
    }

    public void ShowItems(){
        System.out.println("В данный момент в коробке лежат:");
        for (int i = 0; i < box.size(); i++){
            System.out.println((i+1) + ". " + box.get(i).toString());
        }
    }

    public void RemoveSweet(int[] index){
        System.out.println("Из коробки были убраны:");
        for (int i = 0; i == index.length; i++) {
            System.out.println((index[i]) + ". " + box.get(index[i-1]).toString());
            box.remove(index[i-1] - 1);
        }
    }

    public void ClearBox(){
        box.clear();
        System.out.println("Коробка пуста");
    }

    public void CountWeight(){
        for (int i = 0; i < box.size() - 1; i++){
            boxWeight += box.get(i).getWeight();
        }
        System.out.println("Общий вес коробки с подарками: " + boxWeight);
    }

    public void CountPrice(){
        for (int i = 0; i < box.size(); i++){
            boxPrice += box.get(i).getPrice();
        }
        System.out.println("Общая цена коробки с подарками: " + boxPrice);
    }
}
