/**
 * Injecting a prototype bean into a singleton bean/Spring lookup-method Example/method based bean injection.
 * ref=    1>https://prasanthnath.wordpress.com/2013/03/21/injecting-a-prototype-bean-into-a-singleton-bean/
 *        2>http://www.javarticles.com/2015/05/spring-lookup-method-example.html
 */
package com.Spring.LookupMethodInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Pradip Gadekar
 */
public class App 
{
    public static void main( String[] args )
    {
   		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
   		CricketTeam ct=(CricketTeam) context.getBean("CricketTeam");
   		
        MSDhoni T20=ct.BeingCaptain();
        System.out.println("T20 captainship="+T20);
        
        MSDhoni ODI=ct.BeingCaptain();
        System.out.println("ODI captainship="+ODI);
        
        MSDhoni Test=ct.BeingCaptain();
        System.out.println("Test captainship="+Test);
        
        MSDhoni overall=ct.AsCaptain();
        System.out.println( "overall captainship="+overall);
    	}
}

