package com.rahul.SpringAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
      Triangle obj= context.getBean("triangle",com.rahul.SpringAop.Triangle.class);
      System.out.println(obj.getName());
   // obj.draw();
    }
}
