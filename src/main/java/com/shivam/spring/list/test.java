package com.shivam.spring.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("listconfig.xml");
        Hospital hospital = (Hospital) ctx.getBean("hospital");
        System.out.println(hospital.getName());
        System.out.println(hospital.getDepartments());
        System.out.println(hospital.getDepartments().getClass());
    }
}
