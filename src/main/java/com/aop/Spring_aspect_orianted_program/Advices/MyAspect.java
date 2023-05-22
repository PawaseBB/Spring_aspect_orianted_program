package com.aop.Spring_aspect_orianted_program.Advices;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* com.aop.Spring_aspect_orianted_program.Service.PaymentServiceImpl.makePayment())")
	public void authoriseUser() {
		System.out.println("Authorisation Implimented...");
	}
	
	@After("execution(* com.aop.Spring_aspect_orianted_program.Service.PaymentServiceImpl.makePayment())")
	public void taskComplete() {
		System.out.println("Transaction Completed...");
	}
	

}
