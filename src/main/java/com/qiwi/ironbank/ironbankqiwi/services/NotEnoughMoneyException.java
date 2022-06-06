package com.qiwi.ironbank.ironbankqiwi.services;

/**
 * @author Evgeny Borisov
 */
public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
