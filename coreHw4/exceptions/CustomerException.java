package coreHw4.exceptions;

public class CustomerException extends Exception {
    public CustomerException() {
        super("Покупатель не найден");
    }
}
