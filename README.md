Шестое домашнее задание по теме ООП Java.

Переработать приложение с учетом принципа SPR


    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        order.saveToJson();
    }
