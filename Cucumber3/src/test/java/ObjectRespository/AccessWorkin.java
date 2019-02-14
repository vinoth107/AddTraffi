package ObjectRespository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefination.hook;

public class AccessWorkin {
	
	public AccessWorkin() {
		PageFactory.initElements(hook.driver, this);
	}
	@FindBy(xpath="//section[@id='main']//div//h2")
	private WebElement Conf_Message;

	public WebElement getConf_Message() {
		return Conf_Message;
	}

	
	}


