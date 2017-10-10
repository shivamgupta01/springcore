package com.shivam.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = (Employee) ctx.getBean("emp");
        System.out.println(emp.getId());
        System.out.println(emp.getName());

    }

}
