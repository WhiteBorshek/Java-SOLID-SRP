package SOLID;

import java.util.Scanner;

public class ConsoleOrderInput implements OrderInput {

    @Override
    public Order getInput() {
        String clientName = prompt("Имя клиента: ");
        String product = prompt("Продукт: ");
        int qnt = Integer.parseInt(prompt("Количество: "));
        int price = Integer.parseInt(prompt("Цена: "));

        return new Order(clientName, product, qnt, price);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

