package com.practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tv");
		driver.findElement(By.id("nav-search-submit-button")).click();
		int y = driver.findElement(By.xpath("//span[contains(text(),'Redmi 108 cm (43 inches) Android 11 Series Full HD Smart LED TV L43M6-RA/L43M7-RA (Black)')]")).getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		driver.findElement(By.xpath("//span[contains(text(),'Redmi 108 cm (43 inches) Android 11 Series Full HD Smart LED TV L43M6-RA/L43M7-RA (Black)')]")).click();
		String expected = "Redmi-inches-Smart-L43M6-RA-Android";
		Set<String> win = driver.getWindowHandles();
		for(String w:win) {
			String title = driver.switchTo().window(w).getTitle();
		if(title.contains(expected)) {
			break;
		}
	}
	String text = driver.findElement(By.id("productTitle")).getText();
	String text2 = driver.findElement(By.xpath("//span[.='21,999']")).getText();
	System.out.println("  tv name    "+text+"price    "+text2);
		

	}}
