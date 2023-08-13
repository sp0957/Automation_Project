package com_paraBanking_Pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	ExtentReports extent;//specify the location of the report 
	ExtentTest test;// what details should  be populated in the report 
	
	public void startreport() {
		extent=new ExtentReports();
		
	}
//	@Test(priority = 0)
//	public void login() throws InterruptedException, IOException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
////		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
//		
//		driver.findElement(By.name("username")).sendKeys("sahil12");
//		Thread.sleep(1000);
//		driver.findElement(By.name("password")).sendKeys("pass1");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		Thread.sleep(1000);
//		
//		TakesScreenshot file=((TakesScreenshot)driver);
//		File file2=file.getScreenshotAs(OutputType.FILE);
//		File trg=new File("D:\\ParaBank\\Screenshort\\login(valid).png");
//		FileUtils.copyFile(file2, trg);
//		
//		if (driver.getTitle().equals("ParaBank | Accounts Overview")) {
//			System.out.println("Test is Pass (valid information)");
//		} else {
//			System.out.println("Test is Failed");
//		}
//		Thread.sleep(3000);
//		driver.close();
//	}
//	
//	@Test(priority = 1)
//	public void login_invalid() throws InterruptedException, IOException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
//		
//		driver.findElement(By.name("username")).sendKeys("sahil1");
//		Thread.sleep(1000);
//		driver.findElement(By.name("password")).sendKeys("pass1111");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		Thread.sleep(1000);
//		TakesScreenshot file=((TakesScreenshot)driver);
//		File file2=file.getScreenshotAs(OutputType.FILE);
//		File trg=new File("D:\\ParaBank\\Screenshort\\login(invalidss).png");
//		FileUtils.copyFile(file2, trg);
//		if (driver.getTitle().equals("ParaBank | Error")) {
//			System.out.println("Test is Pass (invalid information)");
//		} else {
//			System.out.println("Test is Failed");
//		}
//		Thread.sleep(3000);
//		driver.close();
//	}
//	
//	@Test(priority = 2)
//	public void login_blank() throws InterruptedException, IOException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
//		
//		driver.findElement(By.name("username")).sendKeys(" ");
//		Thread.sleep(1000);
//		driver.findElement(By.name("password")).sendKeys(" ");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		Thread.sleep(1000);
//		TakesScreenshot file=((TakesScreenshot)driver);
//		File file2=file.getScreenshotAs(OutputType.FILE);
//		File trg=new File("D:\\ParaBank\\Screenshort\\login(blankss).png");
//		FileUtils.copyFile(file2, trg);
//		if (driver.getTitle().equals("ParaBank | Error")) {
//			System.out.println("Test is Pass (Blank information)");
//		} else {
//			System.out.println("Test is Failed");
//		}
//		Thread.sleep(3000);
//		driver.close();
//	}
//	
//	@Test(priority = 3)
//	public void login_passonly() throws InterruptedException, IOException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
//		
//		driver.findElement(By.name("username")).sendKeys(" ");
//		Thread.sleep(1000);
//		driver.findElement(By.name("password")).sendKeys("pass1");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		Thread.sleep(1000);
//		
//		TakesScreenshot file=((TakesScreenshot)driver);
//		File file2=file.getScreenshotAs(OutputType.FILE);
//		File trg=new File("D:\\ParaBank\\Screenshort\\login.png");
//		FileUtils.copyFile(file2, trg);
//		
//		if (driver.getTitle().equals("ParaBank | Error")) {
//			System.out.println("Test is Pass (only password)");
//		} else {
//			System.out.println("Test is Failed");
//		}
//		Thread.sleep(3000);
//		driver.close();
//	}
	
	
	public void  enterUsername(WebDriver driver, String username) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);
	}
	
	public void enterPassword(WebDriver driver,String password) throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
	}
	
	public void clickLogin(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(1000);
	}
	
}
