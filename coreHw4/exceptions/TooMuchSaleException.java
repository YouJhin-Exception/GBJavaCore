package coreHw4.exceptions;

public class TooMuchSaleException extends Exception {
    public TooMuchSaleException() {
        super("Слишком большая скидка на ПРЕМИУМ товар");
    }
}
