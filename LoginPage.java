package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email") private WebElement txtUserName;
	@FindBy(id="pass") private WebElement txtPassWord;
	@FindBy(name="login") private WebElement btnClkLgn;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassWord() {
		return txtPassWord;
	}
	public WebElement getBtnClkLgn() {
		return btnClkLgn;
	}

	}
	
	
