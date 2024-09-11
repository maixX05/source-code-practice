package com.msr.study.patterns.structural.filter.impl;

import com.msr.study.patterns.structural.filter.Criteria;
import com.msr.study.patterns.structural.filter.pojo.Person;

import java.util.List;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/6/1 12:40
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }


}
