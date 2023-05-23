package testNGTryout;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void sausage() {
		
		System.out.println("sausage");
		
	}
	
	@Test(groups= {"Smoke"})
	public void broccoli() {
		
		System.out.println("broccoli");
		
	}
	
	@Test
	public void bean() {
		
		System.out.println("bean");
		
	}
	
	@BeforeMethod
	public void beforemeth(){
		
	System.out.println("before");	
	
	}
	
	@AfterMethod
	public void aftermeth() {
		System.out.println("after");
	}
	
	@BeforeClass
	public void bfclass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void afclass() {
		System.out.println("after class");
	}

}
