package coreHw4.classes.makingPurchase;

import coreHw4.classes.COurProduct;
import coreHw4.database.DBProducts;
import coreHw4.enums.CategoryOfProduct;
import coreHw4.enums.Discount;
import coreHw4.exceptions.TooMuchSaleException;

public class CMakeDiscount {
    public static void makeDiscount(String name) throws TooMuchSaleException {


        for (COurProduct p : DBProducts.ourProductsBase) {
            if (p.getTitle().equals(name)) {
                switch (Discount.randomDiscount()) {
                    case NONE -> p.setPrice(p.getPrice());
                    case LOW -> p.setPrice(p.getPrice() - (5 * p.getPrice()) / 100);
                    case MEDIUM -> p.setPrice(p.getPrice() - (10 * p.getPrice()) / 100);
                    case HEIGHT -> p.setPrice(p.getPrice() - (15 * p.getPrice()) / 100);
                    case HUGE -> {
                        if (p.getCategory().equals(CategoryOfProduct.PREMIUM)) {
                            throw new TooMuchSaleException();
                        } else p.setPrice(p.getPrice() - (20 * p.getPrice()) / 100);

                    }
                }
            }
        }

    }
}
