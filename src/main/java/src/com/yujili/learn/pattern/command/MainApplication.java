package src.com.yujili.learn.pattern.command;

public class MainApplication {
    public static void main(String[] args) {
        Stock amazonStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(amazonStock);
        SaleStock saleStock = new SaleStock(amazonStock);

        Broker broker = new Broker(10);

        broker.takeOrder(buyStockOrder);
        broker.takeOrder(saleStock);

        broker.placeOrders();
    }
}
