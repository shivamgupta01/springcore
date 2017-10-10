package com.shivam.spring.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "setconfig.xml");
        CarDealer cardealer = (CarDealer) ctx.getBean("cardealer");

        System.out.println(cardealer.getName());
        System.out.println(cardealer.getModels());

    }

}
