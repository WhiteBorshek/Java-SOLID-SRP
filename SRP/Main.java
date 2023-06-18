package SPR;

public class Main {

    public static void main(String[] args) {
        OrderInputHandler inputHandler = new OrderInputHandler();
        Order order = inputHandler.handleInputFromConsole();

        OrderSaver orderSaver = new OrderSaver();
        orderSaver.saveToJson(order);
    }
}
