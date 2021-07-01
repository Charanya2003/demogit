package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void launBrow(String brow) {
		if(brow.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	}
	
	public static void launUrl(String url) {
		driver.get(url);
	}
	
	public static void fillText(WebElement e, String value) {
		e.sendKeys(value);
	}
	
	public static void btnClk(WebElement e) {
		e.click();
	}
	
	public static void tit() {
		String title=driver.getTitle();
		System.out.println(title);
	}

	public static void stUr() {
		String Ur1 = driver.getCurrentUrl();
		System.out.println(Ur1);
	}
}
