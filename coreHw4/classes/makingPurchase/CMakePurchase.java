package coreHw4.classes.makingPurchase;

import coreHw4.classes.COurBuyer;
import coreHw4.classes.COurOrders;
import coreHw4.classes.COurProduct;
import coreHw4.database.DBBuyers;
import coreHw4.database.DBProducts;
import coreHw4.exceptions.AmountException;
import coreHw4.exceptions.CustomerException;
import coreHw4.exceptions.ProductException;

public class CMakePurchase { //implements IMakePurchase {

    private static int countPurchase = 0;

    public static int getCountPurchase() {
        return countPurchase;
    }

    public static COurOrders makePurchase(int id, String title, int amount) throws CustomerException, ProductException, AmountException {


        COurBuyer buyer = null;
        COurProduct product = null;

        if (amount > 100 || amount < 1) {
            amount = 1;
            throw new AmountException();

        }


        for (COurBuyer b : DBBuyers.ourBuyerBase) {
            if (b.getId() == id) {
                buyer = b;
            }
        }
        if (buyer == null) {
            throw new CustomerException();
        }


        for (COurProduct p : DBProducts.ourProductsBase) {
            if (p.getTitle().equals(title)) {
                product = p;
            }
        }

        if (product == null) {
            throw new ProductException();
        }

        countPurchase++;
        return new COurOrders(buyer, product, amount);

    }

}



