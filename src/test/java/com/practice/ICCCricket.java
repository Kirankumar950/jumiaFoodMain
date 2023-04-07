package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCCricket {

	public static void main(String[] args) {

		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> teamname = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		List<WebElement> matches = driver.findElements(By.xpath("//tbody/tr/td[3]"));
		List<WebElement> points = driver.findElements(By.xpath("//tbody/tr/td[4]"));
		List<WebElement> rating = driver.findElements(By.xpath("//tbody/tr/td[5]"));
		int count=teamname.size();
		for(int i=0;i<count;i++) {
			System.out.println(teamname.get(i).getText()+"  "+matches.get(i).getText()+" "+points.get(i).getText()+"  "+rating.get(i).getText());;

	}
	}

}
