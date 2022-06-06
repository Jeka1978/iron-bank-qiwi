package com.qiwi.ironbank.ironbankqiwi.services;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MoneyServiceImpl implements MoneyService {

    private double balance = 100;

    @Override
    public double getMoney(double amount) {
        if (amount > balance) {
            throw new NotEnoughMoneyException("not enough money!!!");
        }
        balance -= amount;
        return amount;
    }
}
