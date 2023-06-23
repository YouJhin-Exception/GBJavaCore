package coreHw4.abstracts;

public abstract class AProduct {

    private String title;
    private int price;

    public AProduct(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
