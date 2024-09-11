package com.msr.study.patterns.structural.filter.impl;

import com.msr.study.patterns.structural.filter.Criteria;
import com.msr.study.patterns.structural.filter.pojo.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/6/1 12:40
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream()
                .filter(item -> item.getMaritalStatus().equalsIgnoreCase("SINGLE"))
                .collect(Collectors.toList());
    }
}
