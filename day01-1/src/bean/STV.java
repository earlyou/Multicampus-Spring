package bean;

import frame.TV;

public class STV implements TV {

	// Constructor
	public STV() {
		System.out.println("Create LG TV Bean ...");
	}
	
	@Override
	public void on() {
		System.out.println("Samsung TV on ...");
	}

	@Override
	public void off() {
		System.out.println("Samsung TV OFF ...");
	}

}
