package SOLID;

public class Main {

    public static void main(String[] args) {
        OrderInput orderInput = new ConsoleOrderInput();
        OrderSaver orderSaver = new JsonOrderSaver("order.json");

        OrderProcessor orderProcessor = new OrderProcessor(orderInput, orderSaver);
        orderProcessor.processOrder();
    }
}

