package nosql;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
@Index
public class UserDetails {
	
	private String name;
	@Id
	private String email;
	
	private String password;
	
	public void Setname(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setMail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		return email;
	}
	
	public void setPword(String pword)
	{
		this.password = pword;
	}
	public String getPword()
	{
		return password;
	}

}
