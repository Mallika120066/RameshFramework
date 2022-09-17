package practice;

import org.testng.annotations.Test;

public class Demo {
	@Test (priority=1)
	public void login()
	{
		System.out.println("login done!!!");
		System.out.println("asdfdsfds");
	}
	@Test (priority=2)
	public void createUser()
	{
		System.out.println("User created");
		System.out.println("code change by test lead");
		System.out.println("change by tester");
		
	}

}
