package com.PageObjectModel.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page
{
		public static WebElement element ;
		
		public static WebElement myAccountclick(WebDriver driver)
		{
			 element = driver.findElement(By.xpath(".//*[@id='account']/a"));
			 return element;
		}
		
		public static WebElement myaccountlogout(WebDriver driver)
		{
			element=driver.findElement(By.xpath(".//*[@id='account_logout']/a"));
			return element;
		}
		
		public static WebElement usernamedtls(WebDriver driver)
		{
			element=driver.findElement(By.id("log"));
			return element;
		}
		
		public static WebElement passdtls(WebDriver driver)
		{
			element=driver.findElement(By.id("pwd"));
			return element;
		}
		
		public static WebElement submitlogin(WebDriver driver)
		{
			element=driver.findElement(By.id("login"));
			return element;
		}
		
}
