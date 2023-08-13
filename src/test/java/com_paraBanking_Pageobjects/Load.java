package com_paraBanking_Pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browser.BrowserConfiguration;

public class Load {
	
	public WebDriver driver;
	@BeforeTest
		public void loadBrowser() throws InterruptedException {
			driver=new BrowserConfiguration().ChromeBrowserSelection("Chrome", "https://parabank.parasoft.com/parabank/index.htm");
			Thread.sleep(2000);
		}
		
		@Test(invocationCount = 10, threadPoolSize = 5) // 10 users with 5 concurrent threads
	    public void performLoadTest() throws InterruptedException {
	        driver.get("https://parabank.parasoft.com/parabank/index.htm");
	        Thread.sleep(2000);
	    }
		@AfterTest
		public void tearDown() {
			//driver.close();
			driver.quit();
		}
		
		
		
	}


