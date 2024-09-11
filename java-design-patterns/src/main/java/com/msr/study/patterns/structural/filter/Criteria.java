package com.msr.study.patterns.structural.filter;

import com.msr.study.patterns.structural.filter.pojo.Person;

import java.util.List;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/6/1 12:40
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
