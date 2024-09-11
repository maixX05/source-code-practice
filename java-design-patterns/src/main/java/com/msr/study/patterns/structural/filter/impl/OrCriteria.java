package com.msr.study.patterns.structural.filter.impl;

import com.msr.study.patterns.structural.filter.Criteria;
import com.msr.study.patterns.structural.filter.pojo.Person;

import java.util.List;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/6/1 12:40
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
