package com.Spring.FirstSpringDeskstopApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pradip Gadekar
 *
 */
public class MainClassofSpring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

     ApplicationContext context =new ClassPathXmlApplicationContext("spring-configuration.xml"); 
     Student st=(Student) context.getBean("studentbean");
     Address ad=(Address) context.getBean("addressbean");
     System.out.println("name="+st.getName()+"\nAddress=["+ad.getCity()+"\t"+ad.getState()+" "+ad.getCountry()+"\t"+ad.getPin()+"]"+"\n rollno="+st.getRollno()+"\n percentage="+st.getPer());
	}
}
