package com.qiwi.ironbank.demo.registry_pattern;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ValidatorManager {

    @Autowired
    private List<Validator> validators;

    public void addValidator(Validator validator) {
        validators.add(validator);
    }

    public void validateWithAll() {
        validators.forEach(Validator::validate);
    }
}



