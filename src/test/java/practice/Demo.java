package practice;

import org.testng.annotations.Test;

public class Demo {
	@Test (priority=1)
	public void login()
	{
		System.out.println("login done!!!");
	}
	@Test (priority=2)
	public void createUser()
	{
		System.out.println("User created");
		
	}

}
