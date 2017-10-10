package com.shivam.spring.map;

import com.shivam.spring.set.CarDealer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("mapconfig.xml");
        Customer customer = (Customer) ctx.getBean("customer");

        System.out.println(customer);


    }

}
