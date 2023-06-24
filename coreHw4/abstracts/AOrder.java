package coreHw4.abstracts;

public class AOrder {

    // int id   - нужен, по хорошему
    private ABuyer buyer;
    private AProduct product;

    private int amount;

    private final int totalPrice;

    public AOrder(ABuyer buyer, AProduct product, int amount) {
        this.buyer = buyer;
        this.product = product;
        this.amount = amount;
        this.totalPrice = product.getPrice() * amount;
    }

    public ABuyer getBuyer() {
        return buyer;
    }

    public void setBuyer(ABuyer buyer) {
        this.buyer = buyer;
    }

    public AProduct getProduct() {
        return product;
    }

    public void setProduct(AProduct product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                buyer +
                ", product=" + product +
                ", amount=" + amount +
                ", totalPrice=" + totalPrice +
                "}\n";
    }

}
