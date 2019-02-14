package StepDefination;

import ObjectRespository.Accessdetails;
import cucumber.api.java.en.When;

public class AccessDetailsTraffi {
	
	@When("User type the form details{string},{string},{string},{string},{string},{string},{string}")
	public void user_type_the_form_details(String MonthlyRental, String FreeLocalMinutes, String FreeInternationalMinutes, String FreeSMSPack, String LocalPerMinutesCharges, String InternationalPerMinutesCharges, String SMSPerCharges) {
	   Accessdetails details = new Accessdetails();
	   details.getRent().sendKeys(MonthlyRental);
	   details.getLoc_min().sendKeys(FreeLocalMinutes);
	   details.getInter_min().sendKeys(FreeInternationalMinutes);
	   details.getSms().sendKeys(FreeSMSPack);
	   details.getMin_char().sendKeys(LocalPerMinutesCharges);
	   details.getInt_char().sendKeys(InternationalPerMinutesCharges);
	   details.getSms_char().sendKeys(SMSPerCharges);
	
	}
	
	@When("Click the sumit button")
	public void click_the_sumit_button() {
		Accessdetails details1 = new Accessdetails();
		details1.getSub().click();
}
}