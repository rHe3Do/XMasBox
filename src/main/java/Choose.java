import Presents.Candy;
import Presents.Chocolate;
import Presents.PresentBox;

import java.util.Scanner;

public class Choose {

    private static Scanner getInput = new Scanner(System.in);

    public static void inputOper() {
        PresentBox box = new PresentBox();

        int oper;
        do {
            System.out.println("Выберите операцию, которую хотите совершить:" +
                    " \n 1 - Добавить сладость в коробку" +
                    " \n 2 - Удалить сладость из коробки" +
                    " \n 3 - Рассчитать общий вес коробки" +
                    " \n 4 - Рассчитать общую стоимость коробки" +
                    " \n 5 - Показать содержимое коробки" +
                    " \n 9 - Очистить коробку" +
                    " \n 0 - Завершить работу");

            while (!getInput.hasNext("[1234590]")) {
                System.out.println("Вы ввели не поддерживаемое значение, повторите ввод");
                getInput.next();
            }
            oper = getInput.nextInt();
            chooseOper(oper, box);
        } while (!(oper == 0));
    }

    public static void chooseOper(int oper, PresentBox box) {

        switch (oper) {
            case 1:
                System.out.println("Выберите тип добавляемого подарка:" +
                        "\n 1 - Конфета или" +
                        "\n 2 - Шоколад");

                while (!getInput.hasNext("[12]")) {
                    System.out.println("Повторите ввод");
                    getInput.next();
                }
                switch (getInput.nextInt()) {
                    case 1:
                        Candy candy = new Candy();
                        System.out.println("Введите производителя конфеты");
                        candy.setBrand(getInput.next());
                        System.out.println("Введите стоимость конфеты");
                        candy.setPrice(getInput.nextDouble());
                        System.out.println("Введите вес конфеты");
                        candy.setWeight(getInput.nextDouble());
                        System.out.println("Введите упаковку конфеты");
                        candy.setPack(getInput.next());
                        box.AddSweets(candy);
                        break;

                    case 2:
                        Chocolate choc = new Chocolate();
                        System.out.println("Введите производителя шоколадки");
                        choc.setBrand(getInput.next());
                        System.out.println("Введите стоимость шоколадки");
                        choc.setPrice(getInput.nextDouble());
                        System.out.println("Введите вес шоколадки");
                        choc.setWeight(getInput.nextDouble());
                        System.out.println("Введите упаковку шоколадки");
                        choc.setType(getInput.next());
                        box.AddSweets(choc);
                        break;
                }
                break;
            case 2:
                //box.RemoveSweet(getInput.);
                break;
            case 3:
                box.CountWeight();
                break;
            case 4:
                box.CountPrice();
                break;
            case 5:
                box.ShowItems();
                break;
            case 9:
                box.ClearBox();
                break;
        }
    }
}
