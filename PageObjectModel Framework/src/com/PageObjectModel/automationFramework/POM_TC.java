package com.PageObjectModel.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PageObjectModel.pageobjects.Home_Page;

public class POM_TC {

	public static WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\automation in java\\library files\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://www.store.demoqa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Using Page Objects Library now
		Home_Page.myAccountclick(driver).click();
		Home_Page.usernamedtls(driver).sendKeys("adi007");
		Home_Page.passdtls(driver).sendKeys("ncZg1wdelzws5hVO");
		Home_Page.submitlogin(driver).click();
		System.out.println("logged in sucessfully");
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='account_logout']/a")));
		Home_Page.myaccountlogout(driver).click();
		System.out.println("logged out sucessfully");

	}

}
