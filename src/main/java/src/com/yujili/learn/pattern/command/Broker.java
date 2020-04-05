package src.com.yujili.learn.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private int totalStock;
    private List<Order> orderList = new ArrayList<>();

    public Broker(int totalStock) {
        this.totalStock = totalStock;
    }

    public List<Order> takeOrder(Order order) {
        orderList.add(order);

        return orderList;
    }

    public int placeOrders() {
        for (Order order: orderList) {
            if (order.getClass() == SaleStock.class){
                totalStock -= order.execute();
            }

            if (order.getClass() == BuyStock.class) {
                totalStock += order.execute();
            }
        }

        return totalStock;
    }
}
