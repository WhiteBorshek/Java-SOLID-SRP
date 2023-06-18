package SOLID;

public class OrderProcessor {

    private OrderInput orderInput;
    private OrderSaver orderSaver;

    public OrderProcessor(OrderInput orderInput, OrderSaver orderSaver) {
        this.orderInput = orderInput;
        this.orderSaver = orderSaver;
    }

    public void processOrder() {
        Order order = orderInput.getInput();
        orderSaver.save(order);
    }
}
