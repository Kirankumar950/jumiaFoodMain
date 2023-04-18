package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disabled-notification");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		driver.findElement(By.xpath("//li[@data-cy=\"roundTrip\"]")).click();
		driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]")).sendKeys("Bengalore");
		driver.findElement(By.xpath("//input[@data-cy=\"toCity\"]")).sendKeys("mangalore");
		driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText']")).click();

	}

}
