package com.shivam.spring.property;

import com.shivam.spring.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("propertyconfig.xml");
        CountriesLanguages countriesLanguages = (CountriesLanguages) ctx.getBean("countriesandlangs");
        System.out.println(countriesLanguages);


    }

}
