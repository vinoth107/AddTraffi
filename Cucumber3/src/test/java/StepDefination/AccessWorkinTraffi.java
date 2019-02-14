package StepDefination;

import ObjectRespository.AccessWorkin;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class AccessWorkinTraffi {
	
	@SuppressWarnings("deprecation")
	@Then("User get the Congratulation message")
	public void user_get_the_Congratulation_message() throws InterruptedException {
		Thread.sleep(4000);
		AccessWorkin access = new AccessWorkin();
		Assert.assertTrue("Congratulation you add Tariff Plan", access.getConf_Message().isDisplayed());
	   
}}
