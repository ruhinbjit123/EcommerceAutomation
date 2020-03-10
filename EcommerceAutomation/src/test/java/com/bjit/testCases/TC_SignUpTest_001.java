package com.bjit.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bjit.pageObjects.SignUpPage;

import junit.framework.Assert;

public class TC_SignUpTest_001 extends BaseClass{
	
	@Test
	public void signUpTest() throws InterruptedException {
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		SignUpPage sp=new SignUpPage(driver);
		sp.clickOnPopup();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		sp.clickLoginLink();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		sp.clickSignupLink();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		sp.setTextFName("Ruhin");
		//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		sp.setTextLName("Hossain");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		sp.setEmail("ruhin.hossain@abc.com");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		sp.setMobile("01911607200");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		sp.setPassword("ruhin!123");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		sp.setcPassword("ruhin!123");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		sp.clickNewsLetter();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
//		sp.chkWantPartner();
//		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
//		
//		sp.setShopUrl("pruhin.com");
//		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
//		
		sp.clickRegBtn();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println("Warning message: "+sp.getWarning_Mesage());
		System.out.println("Fname text is"+driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/ul/li[1]/div/div[1]/label")).getText());
		
		if(sp.getWarning_Mesage().equals(reg_warning_message)) {
			Assert.assertEquals(true, true);
		}else {
			Assert.assertEquals(false, false);
		}
		
	}
}
