package coreHw4;

import coreHw4.classes.makingPurchase.CMakeDiscount;
import coreHw4.classes.makingPurchase.CMakePurchase;
import coreHw4.database.DBOrders;
import coreHw4.database.DBProducts;
import coreHw4.exceptions.AmountException;
import coreHw4.exceptions.CustomerException;
import coreHw4.exceptions.ProductException;
import coreHw4.exceptions.TooMuchSaleException;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CustomerException, AmountException, ProductException {

        // testing variables

        int[] testIds = {1, 2, 4, 3, 1, 2, 56};
        String[] testsProducts = {"Meat", "Rice", "Gum", "Candy", "Egs", "Juice", "Candy"};
        int[] testAmount = {2, 15, 30, 47, 3, 105, 20};


        // рандомная скидка на товар
        System.out.println(Arrays.toString(DBProducts.ourProductsBase));
        try {
            CMakeDiscount.makeDiscount("Juice");
        } catch (TooMuchSaleException e) {
            e.printStackTrace(); //exception
            //System.out.println(e.getMessage()); //message
        }
        System.out.println("С учетом скидки");
        System.out.println(Arrays.toString(DBProducts.ourProductsBase));


        // testing bar
        for (int i = 0; i < 7; i++) {
            try {
                DBOrders.ourOrdersBase[i] = CMakePurchase.makePurchase(testIds[i], testsProducts[i], testAmount[i]);
            } catch (ProductException e) {
                System.out.println(e.getMessage()); // сообщение
            } catch (AmountException e) {
                DBOrders.ourOrdersBase[i] = CMakePurchase.makePurchase(testIds[i], testsProducts[i], 1);
                System.out.println("Количество товара " + testsProducts[i] + " заменено с " + testAmount[i] + " на 1");
            } catch (CustomerException e) {
                e.printStackTrace(); // вылет с исключением
            }

        }


//        for (int i = 0; i < 3; i++) {
//            try{
//                DBOrders.ourOrdersBase[i] = CMakePurchase.makePurchase(DBBuyers.ourBuyerBase[i].getId(), DBProducts.ourProductsBase[i].getTitle(),i+2);
//            }catch (ProductException e) {
//                System.out.println(e.getMessage());
//            } catch (AmountException e) {
//                DBOrders.ourOrdersBase[i] = CMakePurchase.makePurchase(DBBuyers.ourBuyerBase[i].getId(), DBProducts.ourProductsBase[i].getTitle(),1);
//            } catch (CustomerException e) {
//                e.printStackTrace();
//            }
//
//        }


        System.out.println(Arrays.toString(DBOrders.ourOrdersBase));
        System.out.println("Количество покупок - " + CMakePurchase.getCountPurchase());

    }
}
