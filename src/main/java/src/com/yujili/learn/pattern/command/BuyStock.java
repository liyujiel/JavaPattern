package src.com.yujili.learn.pattern.command;

public class BuyStock implements Order {

    private Stock amazonStock;

    public BuyStock(Stock amazonStock) {
        this.amazonStock = amazonStock;
    }

    @Override
    public int execute() {
        return amazonStock.buy();
    }
}
