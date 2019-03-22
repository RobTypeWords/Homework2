package HOMEWORK2;

public class LapTop {
	
	public String name;
	public String OperatingSystem;
	int price;
	int GigaBits;
	
	

	LapTop(){
		
		System.out.println("Robert's LapTop: ");
		
	}
	LapTop(String Name, String Os, int cost, int gigs){
		
		this.name = Name;
		this.OperatingSystem = Os;
		this.price = cost;
		this.GigaBits = gigs;
	}
	
	public String getName(String Name) {
		System.out.println("The model is: " + Name);
		return Name;
		
	}
	
	public String getOS(String Os) {
		
		System.out.println("The OS is: " + Os);
		return Os;
		
	
	}
	
	public int getPrice (int  cost) {
		System.out.println("The cost was: $" + cost);
		return cost;
		
	}
	
	public int getGigs(int gigs) {
		System.out.println("There sre about " + gigs + " Gigs");
		return gigs;
		
	}
	
	
}
		
	
