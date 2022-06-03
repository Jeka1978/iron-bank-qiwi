package com.qiwi.ironbank.ironbankqiwi.dao;

import com.qiwi.ironbank.ironbankqiwi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * @author Evgeny Borisov
 */

public interface PersonDao extends JpaRepository<Person,Integer> {
    List<Person> findByAgeGreaterThan(@Param("age") int age);
}
