package org.dd;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ques1 {
	WebElement driver=null;
	public Ques1() {
		
		PageFactory.initElements(driver, this);
	}	
		@FindBy(id="email")
		private WebElement user;
		
		@FindBy(id="pass")
		private WebElement password;
		
		@FindBy(name="login")
		private WebElement button;
		public WebElement getDriver() {
			return driver;
		}

		public WebElement getUser() {
			return user;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getButton() {
			return button;
		}

		

		
		

		
	}


