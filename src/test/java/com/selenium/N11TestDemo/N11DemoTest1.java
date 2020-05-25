package com.selenium.N11TestDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class N11DemoTest1 {

	public static WebDriver driver;
	
	@BeforeMethod
	public void BeforeMethod() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void N11Test1() {
	
		driver.get("https://www.n11.com/");
		//driver.navigate().to("https://www.n11.com/");
		
		//Assert.assertEquals("n11.com - Alışverişin Uğurlu Adresi", driver.getTitle());
		
/*		//login
		driver.findElement(By.cssSelector(".btnSignIn")).click();
		driver.findElement(By.id("email")).sendKeys("sezai.celik@hotmail.com");
		driver.findElement(By.id("password")).sendKeys("****");
		driver.findElement(By.id("loginButton")).click();

		//Search
		driver.findElement(By.id("searchData")).clear();
		driver.findElement(By.id("searchData")).sendKeys("Samsung Galaxy S8");
		driver.findElement(By.cssSelector(".iconSearch")).click();

		//Search product
		driver.findElement(By.xpath(".//*[@id='p-190720779']/div[1]/a/h3")).click();

        //Select color
        Select droplist = new Select(driver.findElement(By.id("458405953")));
        droplist.selectByVisibleText("MIDNIGHT BLACK");

        //Add to basket
        driver.findElement(By.cssSelector(".btn.btnGrey.btnAddBasket")).click();*/
               
	}

	@AfterMethod
	public void AfterMethod() {
	
	}
}
