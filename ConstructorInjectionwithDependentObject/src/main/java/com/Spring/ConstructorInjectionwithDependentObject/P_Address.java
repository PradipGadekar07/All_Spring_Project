/**
 * 
 */
package com.Spring.ConstructorInjectionwithDependentObject;

/**
 * @author Pradip Gadekar
 *
 */
public class P_Address {
	private String city;
	private String State;
	private String country;
	private int pincode;
	/**
	 * @param city
	 * @param state
	 * @param country
	 * @param pincode
	 */
	public P_Address(String city, String state, String country, int pincode) {
		super();
		this.city = city;
		State = state;
		this.country = country;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "P_Address [city=" + city + ", State=" + State + ", country=" + country + ", pincode=" + pincode + "]";
	}
}
