package coreHw4.exceptions;

public class ProductException extends Exception {
    public ProductException() {
        super("Товар не найден");
    }
}
