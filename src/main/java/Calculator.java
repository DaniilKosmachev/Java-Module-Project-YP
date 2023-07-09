import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    Formatter formatter = new Formatter();
    List<String> userProduct = new ArrayList<>();
    double sumOfPrice;
    int countFriends;

    public void calcCountOfFriends() {
        while (true) {
            if (scanner.hasNextInt()) {
                countFriends = scanner.nextInt();
                if (countFriends == 1) {
                    System.out.println("Нет смысла рассчитывать! Платишь сам!");
                    System.exit(0);

                } else if (countFriends <= 0 || countFriends > 1000000) {
                    System.out.println("Некорректные данные для расчетов или вас ооочень много! Попробуй ввести снова!");
                    scanner.nextLine();
                } else {
                    scanner.nextLine();
                    break;
                }
            } else {
                System.out.println("Некорректные данные для расчетов! Попробуй ввести снова!");
                scanner.nextLine();
            }
        }
    }

    public void insertPriceProduct() {
        while (true) {
            System.out.println("Введи стоимость товара в формате ХХ.ХХ");
            String insertPrice = scanner.nextLine();
            double normalPrice;
            if (insertPrice.isEmpty()) {
                System.out.println("Цена пуста!");
            } else {
                try {
                    normalPrice = Double.parseDouble(insertPrice.replace(',', '.'));
                    if (normalPrice <= 0) {
                        System.out.println("Цена не может быть меньше или равна нулю!");
                    } else {
                        sumOfPrice = sumOfPrice + normalPrice;
                        System.out.print("Товар и цена успешно добавлены!");
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Похоже вместо цены ты ввел буквы или символы, попробуй снова!");
                }
            }
        }
    }

    public void insertProduct() {
        while (true) {
            System.out.println("Введи наименование товара!");
            String insertProduct = scanner.nextLine();
            if (insertProduct.equalsIgnoreCase("завершить")) {
                break;
            } else if (insertProduct.isEmpty()) {
                System.out.println("Пустое наименование товара!");
            } else {
                userProduct.add(insertProduct);
                insertPriceProduct();
                System.out.println("\nХотите добавить еще? Чтобы завершить ввод - напиши 'завершить'!");
                insertProduct = scanner.nextLine();
                if (insertProduct.equalsIgnoreCase("завершить")) {
                    break;
                } else {
                    continue;
                }
            }
        }
        System.out.printf("Добавленные товары:\n" + String.join("\n", userProduct));
        System.out.printf("\nНа общую сумму: %.2f %s", sumOfPrice, formatter.formatRubles(sumOfPrice));
        System.out.printf("\nНа каждого из %d по - %.2f %s", countFriends, sumOfPrice / countFriends, formatter.formatRubles(sumOfPrice / countFriends));
    }//Обработка пустой строки с друзьями, Посмотреть по ТЗ

}