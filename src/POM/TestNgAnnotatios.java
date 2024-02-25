package POM;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotatios {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest Executed");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass Executed");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Executed");
	}
	    
	@Test (priority = 2 , timeOut = 2000)
	public void test1() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test1 Executed");
		}
	
	@Test (priority = 1, invocationCount =2)
	public void test2() {
		System.out.println("Test2 Executed");
	}
	
	@Test (priority = 3 , enabled = false)
	public void test() {
		System.out.println("Test Executed");
	}
	
	@Test (dependsOnMethods = {"test1"})
	public void test4() {
		System.out.println("Test4 Executed");
	}
	
	@AfterMethod
	public void afterMethod() {
	System.out.println("AfterMethod Executed");	
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass Executed");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest Executed");
	}
	
	}
	


