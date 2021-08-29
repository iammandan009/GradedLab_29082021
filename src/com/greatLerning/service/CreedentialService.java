package com.greatLerning.service;
import com.greatLearning.model.Employee;
import java.util.Random;

public class CreedentialService 

{
	
	public String generateEmailAddress(Employee emp)
	
	{
		
		return emp.getFirstName() + emp.getLastName() + "@" +emp.getDepartment() + ".abc.com";
		
		
		
	}
	
	public String generatePassword()
	
	{
		
		String allPossibleChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>)";
		Random random= new Random();
		String password= "";
		
		for(int i=1; i<=8;i++)
		   
		     {
		      int idx= random.nextInt(allPossibleChars.length());
		      password= password + allPossibleChars.charAt(idx);
		      
		     }
		return password;
	}
	
	
	public void showCredentials(Employee emp,String email, String password)
	
	
	{
		System.out.println("Dear " + emp.getFirstName()+ ", Here are your Credentials");
		System.out.println("Email is "+ email);
		System.out.println("Password is " +password);
		
	}
			
	
	      
}
