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
	}
	
	@Test(groups= {"Smoke"})
	public void TC2() {
		System.out.println("bye");
	}
	
}
