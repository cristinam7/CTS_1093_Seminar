package ro.ase.csie.g1093.testpractice.state2;

public class TestState2 {
	
	public static void main(String[] args) {
		
		//INFO
		//The state pattern is a behavioral design pattern. According to GoF definition, 
		//a state allows an object to alter its behavior when its internal state changes.
		//The object will appear to change its class.
		
		//PROBLEM 
		//In this example, we are simulating courier delivery system where packages can be in different states during transitions.
		
		DeliveryContext ctx = new DeliveryContext("1");
		
		ctx.update();
		ctx.update();
		ctx.update();
		ctx.update();
		
		DeliveryContext ctx2 = new DeliveryContext("2"); 
		ctx.initiateOrder();
		
	}
}
