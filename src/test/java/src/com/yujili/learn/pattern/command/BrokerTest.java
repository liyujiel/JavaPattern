package src.com.yujili.learn.pattern.command;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class BrokerTest {

    private Broker broker;
    private Stock stock;
    private SaleStock saleStock;
    private BuyStock buyStock;
    private int initStock = 10;

    @Before
    public void beforeFunction() {
        broker = new Broker(initStock);
        stock = new Stock();
        saleStock = new SaleStock(stock);
        buyStock = new BuyStock(stock);
    }

    @Test
    public void takeOrder() {
        // When
        List<Order> orders = broker.takeOrder(saleStock);

        // Then
        Assert.assertEquals(orders, Collections.singletonList(saleStock));
    }

    @Test
    public void placeOrders() {
        // Given
        broker.takeOrder(saleStock);
        broker.takeOrder(buyStock);

        // When
        int currentStock = broker.placeOrders();

        // Then
        Assert.assertEquals(currentStock, initStock);
    }
}
