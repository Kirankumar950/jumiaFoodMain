package com.practice;
import java.awt.Window;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumGrid1 {
			@Test
		public void test2() throws Throwable {
			String executemode = "remote";
			WebDriver driver=null;
			if(executemode.equals("remote"))
				
			{
				URL url = new URL("http://192.168.43.79:4444/wd/hub");
				DesiredCapabilities cap=new DesiredCapabilities();
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.WINDOWS);
				 driver=new RemoteWebDriver(url,cap);
			}
				 else if(executemode.equals("local"))
				 {
					 WebDriverManager.chromedriver().setup();
					 driver=new ChromeDriver();
				 }
			driver.manage().window().maximize();
			driver.get("https://google.com");
			Thread.sleep(3000);
			driver.close();
		}

	}

