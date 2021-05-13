package ro.ase.csie.cts.g1093.dp.chain;

public class FilterModule extends GenericMessageHandler {

	//if we need extra data, you can define it 
	String language; 
	String[] dictionary = new String[] {"kill", "hate", "violent"}; 
	
	//bc we have an extra field defined in this class, we need a ctor
	public FilterModule(String language) {
		super();
		this.language = language;
	}



	@Override
	public void processMessage(Message message) {
		
		boolean isOk = true; 
		for(String word : dictionary) { 
			if(message.text.toLowerCase().contains(word)) { 
				isOk = false;
				break;
			}
		}
		
		
		//if the message is okay, pass it to be processed by the next in the chain
		if(isOk) { 
			if(this.next != null) { 
				this.next.processMessage(message);
			}
		}
		
	}

}
