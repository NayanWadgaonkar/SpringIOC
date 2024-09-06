package com.seleniumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {
        // Create application context from beans.xml configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config loaded");
        
      /*  Airtel  air = (Airtel)context.getBean("airtel");
        air.calling();
        air.data();*/
        
       /*Vodaphone voda = context.getBean("vodaphone", Vodaphone.class);
       voda.calling();
       voda.data();*/
        
        Sim sim = context.getBean("sim", Sim.class);
        sim.calling();
        sim.data();
        
    }
}
