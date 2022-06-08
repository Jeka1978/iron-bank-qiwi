package com.qiwi.ironbank.ironbankqiwi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@Profile("WINTER_IS_HERE")
public class PredictionServiceSevere implements PredictionService {
    @Override
    public boolean willSurvive(String heroName) {
        return heroName.toLowerCase().contains("lanister");
    }
}
