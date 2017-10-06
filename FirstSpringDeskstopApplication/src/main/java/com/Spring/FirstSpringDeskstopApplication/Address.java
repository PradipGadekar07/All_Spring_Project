/**
project for spring dependency injection
 * 
 */
package com.Spring.FirstSpringDeskstopApplication;

/**
 * @author Pradip Gadekar
 *
 */
public class Address {

	private String city;
	private String state;
	private String country;
	private int pin;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", pin=" + pin + "]";
	}
	
		
}
