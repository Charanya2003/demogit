package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecMenu extends BaseClass {
	public static void main(String[] args) throws Exception {
		
		launBrow("chrome");
		launUrl("https://en-gb.facebook.com/");
		
		tit();
		stUr();
		
		LoginPage l=new LoginPage();
		
		fillText(l.getTxtUserName(),"charu");
		
		driver.navigate().refresh();
		
		fillText(l.getTxtUserName(),"vijay");
		
		fillText(l.getTxtPassWord(),"12345");
		Thread.sleep(3000);
		btnClk(l.getBtnClkLgn());
	
		
	}
	


}
