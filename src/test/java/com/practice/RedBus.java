package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.GenericUtilities.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("bangalore");
		driver.findElement(By.xpath("//li[@class=\"selected\"]")).click();
		driver.findElement(By.id("dest")).sendKeys("nellore");
		driver.findElement(By.xpath("//li[@class=\"selected\"]")).click();
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//td[@class='next']")).click();
		driver.findElement(By.xpath("(//tbody/tr/td[5])[1]")).click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(5000);
	driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
	driver.switchTo().defaultContent();
	WebDriverUtility ww=new WebDriverUtility();
	//WebElement web = driver.findElement(By.xpath("(//div[@class=\"travels lh-24 f-bold d-color\"])[10]"));
	for(; ;)
	{
		try {
			driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[96]"));
			break;
		}
		catch(Exception e) {
			ww.scrollBarAction(driver);
		}
	}
	List<WebElement> transports = driver.findElements(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[96]"));
	List<WebElement> price = driver.findElements(By.xpath("//div[text()='INR ']"));
	int count=transports.size();
     for(int i=0;i<count;i++)
     {
   System.out.println(transports.get(i).getText()+"       "+price.get(i).getText());
     }
			}
}

