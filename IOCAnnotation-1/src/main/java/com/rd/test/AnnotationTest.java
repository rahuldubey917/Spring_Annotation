package com.rd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rd.beans.Flipkart;

public class AnnotationTest {

	public static void main(String[] args) {
               System.out.println("hello");
		ApplicationContext ctx=null;
        Flipkart fpkt=null; 
		
		ctx=new ClassPathXmlApplicationContext("com/rd/cfgs/applicationContext.xml");

        fpkt=ctx.getBean("fpkt",Flipkart.class);

        fpkt.shopping(new String[]{"chawal","roti","sabzi"});
        
       
        System.out.println("hello");
       ((AbstractApplicationContext) ctx).close(); 
	}

}
