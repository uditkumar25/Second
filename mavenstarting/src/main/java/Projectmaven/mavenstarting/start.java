package Projectmaven.mavenstarting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class start {
	
	@BeforeSuite
	public void setup() {
		System.out.println("@BeforeSuite ----Setup system property for chrome");	
	}	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest ----launchBrowser");	
	}
	@BeforeClass
	public void login() {
		System.out.println("@BeforeClass ----login to app");	
	}
	@BeforeMethod
	public void enterurl() {
		System.out.println("@BeforeMethod ----enter url");	
	}
	@Test
	public void firstTest() {
		System.out.println("First---test");	
	}
	@Test
	public void secondTest() {
		System.out.println("Second--test");	
	}
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod---logout from app");	
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass---closeBrowser");	
	}
	@AfterTest
	public void deleteallcookies() {
		System.out.println("@AfterTest --deleteallcookies");	
	}
			}
