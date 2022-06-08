package com.qiwi.ironbank.demo.registry_pattern;

/**
 * @author Evgeny Borisov
 */
public class ValidatorImpl implements Validator {
    @Override
    public void validate() {
        System.out.println("validating...");
    }
}
