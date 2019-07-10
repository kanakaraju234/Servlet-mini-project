package nosql;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import nosql.Store;



@Controller
public class NosqlController {
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public String info(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("email") String mail,
			@RequestParam("name") String name,
			@RequestParam("pword") String pword )
	{
		request.setAttribute("fname", name);
		request.setAttribute("email", mail);
		request.setAttribute("password", pword);
		
		UserDetails user = new UserDetails();
		
		user.Setname(name);
		user.setMail(mail);
		user.setPword(pword);
		
		try 
		{
			Store.save(user);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
		return "info";
	}
	
	@RequestMapping(value="/id")
	public String EnterId()
	{
		
		return "enterId";
	}
	
	
	@RequestMapping(value="/di")
	public String UserInfo(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("email") String mail) 
	{
		UserDetails u = Store.get(UserDetails.class, mail);
		
		System.out.println(u.getName() +" "+ u.getEmail());
		request.setAttribute("email", u.getEmail());
		request.setAttribute("name", u.getName());
		
		
		return "getid";
	}

}
