package com.bjit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
		WebDriver ldriver;
	
		public SignUpPage(WebDriver rdriver) {
			this.ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
		@FindBy(name = "firstname")
		@CacheLookup
		WebElement textFName;
	
		@FindBy(name = "lastname")
		@CacheLookup
		WebElement textLName;
	
		@FindBy(name = "email")
		@CacheLookup
		WebElement email;
	
		@FindBy(name = "mobilenum")
		@CacheLookup
		WebElement mobile;
	
		@FindBy(name = "password")
		@CacheLookup
		WebElement password;
	
		@FindBy(name = "confirmation")
		@CacheLookup
		WebElement cPassword;
	
		@FindBy(xpath = "//*[@id=\"form-validate\"]/div/ul/li[4]/label")
		@CacheLookup
		WebElement news_letter;
	
		@FindBy(xpath = "//*[@id=\"wantpartner\"]")
		@CacheLookup
		WebElement want_partner;
	
		@FindBy(xpath = "//*[@id=\"form-validate\"]/div/ul/div/button")
		@CacheLookup
		WebElement regBtn;
	
		@FindBy(xpath = "//*[@id=\"link-login\"]")
		@CacheLookup
		WebElement loginBtn;
	
		@FindBy(id = "signup")
		@CacheLookup
		WebElement signupLink;
	
		@FindBy(xpath = "//*[@id=\"top\"]/body/div[2]/div[1]/div[6]/div/div/div[1]/a")
		@CacheLookup
		WebElement closePopup;
		
		@FindBy(name="profileurl")
		@CacheLookup
		WebElement shopUrl;
		
		@FindBy(xpath = "//*[@id=\"pick_Registerpage\"]/div[2]/ul/li/ul/li")
		@CacheLookup
		WebElement warning_message;
	
		public void setTextFName(String fName) {
			textFName.sendKeys(fName);
		}
		
		public String getFNameText() {
			return textFName.getText();
		}
	
		public void setTextLName(String lName) {
			textLName.sendKeys(lName);
		}
	
		public void setEmail(String emailAdd) {
			email.sendKeys(emailAdd);
		}
	
		public void setMobile(String mobileNum) {
			mobile.sendKeys(mobileNum);
		}
	
		public void setPassword(String pass) {
			password.sendKeys(pass);
		}
	
		public void setcPassword(String cPass) {
			cPassword.sendKeys(cPass);
		}
		
		public String getWarning_Mesage() {
			return warning_message.getText();
		}
	
		public void clickNewsLetter() {
			news_letter.click();
		}
	
		public void chkWantPartner() {
			want_partner.click();
		}
	
		public void clickRegBtn() {
			regBtn.click();
		}
	
		public void clickLoginLink() {
			loginBtn.click();
		}
	
		public void clickSignupLink() {
			signupLink.click();
		}
	
		public void clickOnPopup() {
			closePopup.click();
		}
		
		public void setShopUrl(String shopPUrl) {
			shopUrl.sendKeys(shopPUrl);
		}
}
