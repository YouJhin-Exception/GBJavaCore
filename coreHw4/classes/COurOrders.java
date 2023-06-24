package coreHw4.classes;

import coreHw4.abstracts.ABuyer;
import coreHw4.abstracts.AOrder;
import coreHw4.abstracts.AProduct;

public class COurOrders extends AOrder {
    public COurOrders(ABuyer buyer, AProduct product, int amount) {
        super(buyer, product, amount);
    }

}
