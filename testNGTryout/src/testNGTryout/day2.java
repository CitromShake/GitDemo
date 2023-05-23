package testNGTryout;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void TC3() {
		System.out.println("Webapp");
	}
	
	@Test
	public void TC4() {
		System.out.println("Mobileapp");
	}
	
	@Test(groups= {"Smoke"})
	public void TC5() {
		System.out.println("API");
	}
	@BeforeTest
	public void before() {
		System.out.println("start");
	}
	
	
	@BeforeSuite
	public void bfSuite() {
		System.out.println("1st");
	}
	
	@AfterSuite
	public void afSuite() {
		System.out.println("last");
	}
}
