package ObjectRespository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefination.hook;

public class Homepage{
	
	public Homepage(){
		PageFactory.initElements(hook.driver,this);
	}
	
	@FindBy(xpath= "//*[@id=\"one\"]/div/div[3]/div[1]/h3/a")
		private WebElement homepage;

	public WebElement getHomepage() {
		return homepage;
	}

}


