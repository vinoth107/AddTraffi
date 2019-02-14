package StepDefination;

import ObjectRespository.Homepage;
import cucumber.api.java.en.Given;

public class Homepagetraffi {
	
	@Given("User enter into the home page")
	public void user_enter_into_the_home_page() {
	hook.driver.get("http://demo.guru99.com/telecom");
	}
	
		@Given("User enter into the traffi page")
		public void user_enter_into_the_traffri_page() {
			Homepage home =new Homepage();
			home.getHomepage().click();
		}
		
			
		
		
		
	
}
