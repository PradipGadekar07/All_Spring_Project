
package com.Spring.LookupMethodInjection;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Pradip Gadekar
 *
 */
public class MSDhoni {
	private static AtomicLong count = new AtomicLong(0); 
    private boolean isGoodCaptain;
	
	public MSDhoni() {
	count.incrementAndGet();	
	}

	@Override
	public String toString() {
		return "MSDhoni [isGoodCaptain=" + isGoodCaptain + "]";
	}
	public void setisGoodCaptain(Boolean GoodCaptain)
	{
		isGoodCaptain=GoodCaptain;
	}
}