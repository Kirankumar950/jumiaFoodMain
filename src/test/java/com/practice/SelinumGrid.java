package com.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SelinumGrid {
		@Test
		public void gridTest() throws MalformedURLException {		
			URL url=new URL("http://192.168.179.1:4444/wd/hub");
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			WebDriver driver=new RemoteWebDriver(url, cap);
			driver.manage().window().maximize();
			driver.get("https://google.com");
	}

}
