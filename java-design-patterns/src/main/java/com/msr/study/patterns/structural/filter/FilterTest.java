package com.msr.study.patterns.structural.filter;

import com.msr.study.patterns.structural.filter.impl.*;
import com.msr.study.patterns.structural.filter.pojo.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 我们将创建一个 Person 对象、Criteria 接口和实现了该接口的实体类，来过滤 Person 对象的列表。
 * FilterTest 类使用 Criteria 对象，基于各种标准和它们的结合来过滤 Person 对象的列表。
 *
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/1 12:40
 */
public class FilterTest {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        // 单身男性
        Criteria singleMale = new AndCriteria(single, male);
        // 单身女性
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }
}
