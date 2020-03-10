package com.bjit.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bjit.pageObjects.LoginPage;
import com.bjit.pageObjects.SignUpPage;

public class TC_Login_001 extends BaseClass{
	@Test
	public void loginTest() throws Exception {
		driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		driver.get(baseUrl);
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
		
		SignUpPage sp=new SignUpPage(driver);
		sp.clickOnPopup();
		Thread.sleep(1000);
		
		sp.clickLoginLink();
		Thread.sleep(2000);
	
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName("ruhinbjit@gmail.com");
		Thread.sleep(2000);
		
		lp.setLPassword("welcome!123");
		Thread.sleep(2000);
		
		lp.clickSignInBtn();
		Thread.sleep(2000);
		
		lp.clickPhoneTab();
		Thread.sleep(1000);
		
		lp.clickVivoLink();
		Thread.sleep(300);
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\\\"em-grid-mode\\\"]/ul/li[1]/div/div[2]/div/h2/a"));
//		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(200);
		
		lp.clickVivoS1Pro();
		Thread.sleep(300);
		
		lp.clickChoiceColor();
		Thread.sleep(500);
		
		lp.clickBuyNowBtn();
		Thread.sleep(500);
		
		lp.clickProToChkBtn();
		Thread.sleep(500);
		
		lp.clickAddressContinue();
		Thread.sleep(500);
		
		lp.clickAddressContinue();
		Thread.sleep(500);
		
		lp.clickShipContinue();
		Thread.sleep(500);
		
		lp.clickChkPayment();
		Thread.sleep(500);
		
		
		
	}
}
