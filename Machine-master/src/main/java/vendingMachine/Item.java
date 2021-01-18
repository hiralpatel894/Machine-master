package vendingMachine;

//Item
public enum Item{ 
	SODA1("SODA1", 100), SODA2("SODA2", 65), SODA3("SODA3", 50); 
	private String name; 
	private int price; 
	private Item(String name, int price){ 
		this.name = name; this.price = price; 
	} 
	public String getName(){ 
		return name; 
	} 
	public int getPrice(){ 
		return price; 
	} 	
}