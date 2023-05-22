package com.aop.Spring_aspect_orianted_program;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.Spring_aspect_orianted_program.Service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
    	PaymentService paymentService=(PaymentService) applicationContext.getBean("payment");
    	
    	paymentService.makePayment();
    }
}
