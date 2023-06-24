package coreHw4.abstracts;

import coreHw4.enums.CategoryOfProduct;

public abstract class AProduct {

    private String title;
    private int price;
    private CategoryOfProduct category;

    public AProduct(String title, int price, CategoryOfProduct category) {
        this.title = title;
        this.price = price;
        this.category = category;
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

    public CategoryOfProduct getCategory() {
        return category;
    }

    public void setCategory(CategoryOfProduct category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "{" + "title='" + title + '\'' + ", price=" + price + ", category=" + category + '}';
    }

}
