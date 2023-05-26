package testNGTryout;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void finish() {
		System.out.println("end");
	}
	
	@Test
	public void TC1() {
		System.out.println("hello");
		System.out.println("jira");
		System.out.println("jira2");
	}
	
	@Test(groups= {"Smoke"})
	public void TC2() {
		System.out.println("bye");
	}
	
}
