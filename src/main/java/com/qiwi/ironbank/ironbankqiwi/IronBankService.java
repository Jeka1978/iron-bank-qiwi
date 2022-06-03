package com.qiwi.ironbank.ironbankqiwi;

import com.qiwi.ironbank.ironbankqiwi.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class IronBankService {
    @Autowired
    private PersonDao personDao;
}
