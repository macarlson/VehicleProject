import java.util.UUID;


public class Person {
	
	private String FirstName;
	private String LastName;
	private UUID PersonID;
	
	public String getFirstName(){
		
		return this.FirstName;
	}
	
	public void setFirstName(String FirstName){
		
		this.FirstName = FirstName;
	}
	
	public String getLastName(){
		
		return this.LastName;
	}
	
	public void setLastName(String LastName){
		
		this.LastName = LastName;
	}
	
	public UUID getPersonID(){
		
		return this.PersonID;
	}
	
	public void setPersonID(){
		
	}

}
