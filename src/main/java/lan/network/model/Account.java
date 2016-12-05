package lan.network.model;

public class Account {

	private final int number;
	private final String description;
	
	public Account(int number, String description){
		this.number = number;
		this.description = description;
	}

	public int getNumber() {
		return number;
	}


	public String getDescription() {
		return description;
	}


    }
