package coreHw4.database;

import coreHw4.classes.COurProduct;
import coreHw4.enums.CategoryOfProduct;

public class DBProducts {
    public static COurProduct[] ourProductsBase = {new COurProduct("Gum", 50, CategoryOfProduct.STANDARD),
                                                    new COurProduct("Candy", 150,CategoryOfProduct.STANDARD),
                                                    new COurProduct("Juice", 100,CategoryOfProduct.PREMIUM),
                                                    new COurProduct("Meat", 550,CategoryOfProduct.STANDARD),
                                                    new COurProduct("Rice", 350,CategoryOfProduct.STANDARD)};
}
