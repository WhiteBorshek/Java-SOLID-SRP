package SPR;

import java.util.Scanner;

public class OrderInputHandler {

    public Order handleInputFromConsole() {
        String clientName = prompt("Имя клиента: ");
        String product = prompt("Продукт: ");
        int quantity = Integer.parseInt(prompt("Количество: "));
        int price = Integer.parseInt(prompt("Цена: "));

        return new Order(clientName, product, quantity, price);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

