package bean;

import frame.TV;

public class LTV implements TV {

	// Constructor
	public LTV() {
		System.out.println("Create LG TV Bean ...");
	}
	
	@Override
	public void on() {
		System.out.println("LG TV On ...");
	}

	@Override
	public void off() {
		System.out.println("LG TV OFF ...");
	}

}
