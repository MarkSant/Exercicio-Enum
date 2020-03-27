
import java.util.*;

public class Client
{
	
	private String name;
	private String email;
	private Date birthDate;
	
	
	public Client (){		
	}
	
	public Client (String name, String email,Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String nName){
		name = nName;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String sEmail){
		email = sEmail;
	}
	
	public Date getBirthDate(){
		return birthDate;
	}
	
	public void setBirthDate(Date sBirth) {
		birthDate = sBirth;
	}
	
}
