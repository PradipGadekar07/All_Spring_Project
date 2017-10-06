/**
 * Constructor injection type ambiguities in Spring with solution using  index,type attribute in bean <constructor-arg> tags 
 */
package com.Spring.DependencyInjectionbyConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
     @SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
      Athlete at=(Athlete) context.getBean("AthleteBean");
      at.display();
      at.display1();
      at.display2();
      at.display3();
      at.display4();
      
    }
}