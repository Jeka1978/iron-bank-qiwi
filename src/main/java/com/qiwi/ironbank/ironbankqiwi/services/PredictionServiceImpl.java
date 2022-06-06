package com.qiwi.ironbank.ironbankqiwi.services;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class PredictionServiceImpl implements PredictionService {
    @Override
    public boolean willSurvive(String heroName) {
        return !heroName.toLowerCase().contains("stark");
    }
}
