package ro.ase.csie.cts.g1093.dp.chain;

public abstract class GenericMessageHandler {

	GenericMessageHandler next = null; 
	
	
	//someone sends a message
	public abstract void processMessage(Message message);
	
	public void setNext(GenericMessageHandler next) { 
		this.next = next;
	}
	
	
}
