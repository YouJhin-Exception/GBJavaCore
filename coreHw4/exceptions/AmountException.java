package coreHw4.exceptions;

public class AmountException extends Exception {
    public AmountException() {
        super("Неверное количество товара");
    }
}
