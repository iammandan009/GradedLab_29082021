package com.greatLearning.main;
import  java.util.Scanner;
import  com.greatLearning.model.Employee;
import com.greatLerning.service.CreedentialService;



public class Driver 

{

	public static void main(String[] args) 
	
	{
		String dept;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please Enter your First Name");
		String inputFirstName= userInput.next();
		System.out.println("Please Enter your Last Name");
		String inputLastName= userInput.next();
        System.out.println("Please Enter your department(1-4) from below list.\n" + "1. Technical(tech)\n"
				
						   + "2. Admin(adm)\n" + "3. Human Resources(hr)\n"
				
						   + "4. Legal(lg)\n");
        
        int inputdepartment = userInput.nextInt();
		
		switch(inputdepartment)
		{
		
		case 1:
			dept = "tech";
			break;
		case 2:
			dept = "adm";
			break;
		case 3:
			dept = "hr";
			break;
		case 4:
			dept = "lg";
			break;
		default:
			System.out.println( "Incorrect choice" );
			return;
	   }
	
	Employee emp = new Employee(inputFirstName,inputLastName, dept );
    CreedentialService cs= new CreedentialService();
     String email = cs.generateEmailAddress(emp);
     String password = cs.generatePassword();
     cs.showCredentials(emp, email, password);
     
    
     
		
	}

}


