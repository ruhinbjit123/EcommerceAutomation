package com.bjit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "username")
	@CacheLookup
	WebElement username;

	@FindBy(id = "pass")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "//*[@id=\"send2\"]/span/span")
	@CacheLookup
	WebElement singnInBtn;
	
	@FindBy(xpath = "//*[@id=\"toogle_menu_6_7320\"]/ul/li[1]/a[2]/span")
	@CacheLookup
	WebElement phoneTab;
	
	@FindBy(xpath = "//*[@id=\"fme_layered_cat\"]/div[2]/div[6]/a/img")
	@CacheLookup
	WebElement vivoLink;
	
	@FindBy(xpath = "//*[@id=\"em-grid-mode\"]/ul/li[1]/div/div[2]/div/h2/a")
	@CacheLookup
	WebElement vivoS1Pro;
	
	@FindBy(xpath = "//*[@id=\"swatch10274\"]/span[1]/img")
	@CacheLookup
	WebElement choiceColor;
	
	
	@FindBy(xpath = "//*[@id=\"em-buy-now\"]/span/h4")
	@CacheLookup
	WebElement buyNowBtn;
	
	@FindBy(xpath = "//*[@id=\"top\"]/body/div[1]/div[1]/div[5]/div/div/div[2]/div/div/div/div[1]/button/span/span")
	@CacheLookup
	WebElement ProToChkBtn;
	
	@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button")
	@CacheLookup
	WebElement addressContinue;
	
	@FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button/span")
	@CacheLookup
	WebElement shipContinue;
	
	@FindBy(xpath = "//*[@id=\"checkout-payment-method-load\"]/dt[4]/label")
	@CacheLookup
	WebElement chkPayment;
	
	@FindBy(xpath = "//*[@id=\"cd_dl_ip\"]")
	@CacheLookup
	WebElement paymentMethod;
	
	@FindBy(xpath = "//*[@id=\"emi_banks_interest\"]/div[2]/ul/li[15]/a")
	@CacheLookup
	WebElement selectBank;
	
	@FindBy(xpath = "//*[@id=\"NRBBank\"]/div[4]/input")
	@CacheLookup
	WebElement selectEMIMonth;
	
	@FindBy(xpath = "//*[@id=\"payment-buttons-container\"]/button/span/span")
	@CacheLookup
	WebElement paymentContinue;
	
	@FindBy(xpath = "//*[@id=\"payment-buttons-container\"]/p[2]/a")
	@CacheLookup
	WebElement paymentBackBtn;
	
	public void setUserName(String uName) {
		username.sendKeys(uName);
	}

	public void setLPassword(String lPass) {
		password.sendKeys(lPass);
	}

	public void clickPhoneTab() {
		phoneTab.click();
	}

	public void clickVivoLink() {
		vivoLink.click();
	}
	
	public void clickVivoS1Pro() {
		vivoS1Pro.click();
	}
	
	public void clickChoiceColor() {
		choiceColor.click();
	}
	
	public void clickBuyNowBtn() {
		buyNowBtn.click();
	}
	
	public void clickProToChkBtn() {
		ProToChkBtn.click();
	}
	
	public void clickAddressContinue() {
		addressContinue.click();
	}
	
	public void clickShipContinue() {
		shipContinue.click();
	}
	
	public void clickChkPayment() {
		shipContinue.click();
	}
	
	public void clickPaymentMethod() {
		paymentMethod.click();
	}
	
	public void clickSelectBank() {
		selectBank.click();
	}
	
	public void clickSelectEMIMonth() {
		selectEMIMonth.click();
	}
	
	public void clickPaymentBackBtn() {
		paymentBackBtn.click();
	}

	public void clickSignInBtn() {
		// TODO Auto-generated method stub
		singnInBtn.click();
	}
}
