package com.qiwi.ironbank.demo.registry_pattern;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public interface Validator {
    void validate();

    @Autowired
    default void registryMyself(ValidatorManager validatorManager) {
        validatorManager.addValidator(this);
    }
}
