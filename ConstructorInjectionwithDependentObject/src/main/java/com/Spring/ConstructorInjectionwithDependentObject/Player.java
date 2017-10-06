/**
Constructor Injection with Dependent Object in spring
ref=   http://javawebtutor.com/articles/spring/spring-constructor-injection-with-dependent-object.php
 * 
 */
package com.Spring.ConstructorInjectionwithDependentObject;

/**
 * @author Pradip Gadekar
 *
 */
public class Player {
	private String p_name;
	private int p_jerseyno;
	private P_Address p_address;
	/**
	 * @param p_name
	 * @param p_jerseyno
	 * @param p_address
	 */
	public Player(String p_name, int p_jerseyno, P_Address p_address) {
		super();
		this.p_name = p_name;
		this.p_jerseyno = p_jerseyno;
		this.p_address = p_address;
	}
	
	public void display()
	{
		System.out.println("player name="+p_name+"\nplayer jerseyno="+p_jerseyno);
		System.out.println(p_address.toString());
	}
}
