/**
 * 
 */
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
     System.out.println("name="+st.getName()+"\nAddress="+st.getAddress()+"\n rollno="+st.getRollno()+"\n percentage="+st.getPer());
	}
}
