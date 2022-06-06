package com.qiwi.ironbank.ironbankqiwi;

import com.qiwi.ironbank.ironbankqiwi.dao.PersonDao;
import com.qiwi.qiwistarter.ConditionalOnProduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@ConditionalOnProduction
public class IronBankService {
    @Autowired
    private PersonDao personDao;
}
