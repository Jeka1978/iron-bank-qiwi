package com.qiwi.ironbank.ironbankqiwi.services;

import com.qiwi.ironbank.ironbankqiwi.dao.PersonDao;
import com.qiwi.qiwistarter.ConditionalOnProduction;
import com.qiwi.qiwistarter.annotations.InjectRandomHero;
import com.qiwi.qiwistarter.model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
@ConditionalOnProduction
public class IronBankService {
    @Autowired
    private PersonDao personDao;

    @Autowired
    private PredictionService predictionService;

    @Autowired
    private MoneyService moneyService;

    @InjectRandomHero
    private Hero hero;

    @PostConstruct
    public void printMyHero(){
        System.out.print("HERO****:  ");
        System.out.println(hero);
    }

    public String loan(String heroName, double amount) {
        if (predictionService.willSurvive(heroName)) {

            moneyService.getMoney(amount);
            return "loan accepted";
        }else {
            return "loan rejected, you will not survice";
        }

    }





















}
