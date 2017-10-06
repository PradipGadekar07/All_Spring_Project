/**
 * http://javawebtutor.com/articles/spring/constructor-injection-type-ambiguities-in-spring.php
 * 
 *  http://javawebtutor.com/articles/spring/spring-constructor-injection-with-dependent-object.php
 */
package com.Spring.DependencyInjectionbyConstructor;

/**
 * @author Pradip Gadekar
 *
 */
public class Athlete {
	private String name;
	private String country;
	private float age;
	private String game_name;
	private int world_rank;
	/**
	 * @param name
	 * @param country
	 * @param age
	 * @param game_name
	 * @param world_rank
	 */
	public Athlete(String name, String country, float age, String game_name, int world_rank) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
		this.game_name = game_name;
		this.world_rank = world_rank;
	}
	/**
	 * @param name
	 * @param country
	 * @param age
	 */
	public Athlete(String name, String country, float age) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
	}
	/**
	 * @param name
	 * @param game_name
	 * @param world_rank
	 */
	public Athlete(String name, String game_name, int world_rank) {
		super();
		this.name = name;
		this.game_name = game_name;
		this.world_rank = world_rank;
	}
	/**
	 * @param name
	 * @param world_rank
	 */
	public Athlete(String name, int world_rank) {
		super();
		this.name = name;
		this.world_rank = world_rank;
	}
	/**
	 * @param name
	 * @param game_name
	 */
	public Athlete(String name, String game_name) {
		super();
		this.name = name;
		this.game_name = game_name;
	}
	/**
	 * @param age
	 * @param game_name
	 */
	public Athlete(float age, String game_name) {
		super();
		this.age = age;
		this.game_name = game_name;
	}
	
	
	
	public void display2() {
	System.out.println(">>>>>>>>>>>>>>>>>>>3rd Constructor with name,gamename,world_rank called>>>>>>>>>>>>");	
	System.out.println("Athlete Name: " + name);
	System.out.println("Athlete game_name: " +game_name);
	System.out.println("Athlete world_rank: " +world_rank);
	}
	
	public void display1() {
		System.out.println(">>>>>>>>5th Constructor with name,game_name called>>>>>>>>>>>>>");
		System.out.println("Athlete Name: " + name);
		System.out.println("Athlete game_name: " +game_name);
		}
	public void display() {
		System.out.println(">>>>>>>>>>>>>>>>>>>1st Constructor with all parameter called>>>>>>>>>>>>");	
		System.out.println("Athlete Name: " + name);
		System.out.println("Athlete country: " +country );
		System.out.println("Athlete age: " +age);
		System.out.println("Athlete game_name: " +game_name);
		System.out.println("Athlete world_rank: " +world_rank);
		}
	/**
	 * 
	 */
	public void display3() {
		System.out.println(">>>>>>>>>>>>>>>>>>>6th Constructor with age & game_name called>>>>>>>>>>>>");	
		
		System.out.println("Athlete age: " +age);
		System.out.println("Athlete game_name: " +game_name);
	}
	/**
	 * 
	 */
	public void display4() {
		System.out.println(">>>>>>>>>>>>>>>>>>>4th Constructor with name,world_rank called>>>>>>>>>>>>");	
		System.out.println("Athlete Name: " + name);
		System.out.println("Athlete world_rank: " +world_rank);
		
	}
}
