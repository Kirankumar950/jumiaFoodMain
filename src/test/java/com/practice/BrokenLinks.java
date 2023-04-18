package com.practice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	@Test
	public void test() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://phptravels.com/");
		List<WebElement> listOfAllLinks = driver.findElements(By.xpath("//a"));
		List<String> listOfLink = new ArrayList<String>();
		List<String> brokenLinks = new ArrayList<String>();
		for(WebElement wb:listOfAllLinks)
		{
		String link = wb.getAttribute("href");
		if(link!=null)
		{
			if(link.contains("http"))
			{
				listOfLink.add(link);
			}
			else {
			brokenLinks.add(link+"==>not having http protocal");
			}
		}
		else {
			brokenLinks.add(link+"==>null");
		}
		
		}
		for(String link:listOfLink)
		{
			try {
			URL url=new URL(link);
			URLConnection urlCon = url.openConnection();
			HttpURLConnection httpurlcon=(HttpURLConnection)urlCon;
			int statuscode = httpurlcon.getResponseCode();
			String responseMsg = httpurlcon.getResponseMessage();
			if(statuscode>=400)
			{
				brokenLinks.add(link+"==>statuscode:"+statuscode+"==>responseMsg    "+responseMsg);
			}
		}
			catch(Exception e)
			{
				brokenLinks.add(link+"==>not connected to server");
			}
	}
		System.out.println(listOfLink);
		System.out.println(listOfLink.size());
		System.out.println(brokenLinks);
		System.out.println(brokenLinks.size());
}
}
