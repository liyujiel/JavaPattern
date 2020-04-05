package src.com.yujili.learn.pattern.command;

public class SaleStock implements Order {
    private Stock amazonStock;

    public SaleStock(Stock amazonStock) {
        this.amazonStock = amazonStock;
    }

    @Override
    public int execute() {
        return this.amazonStock.sell();
    }
}
