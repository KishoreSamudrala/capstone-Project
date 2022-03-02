package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {
	public SummaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[.='Summary']")
	private WebElement summaryModule;
	
	@FindBy(xpath = "//div[@class='input-data']")
	private WebElement summaryTextfield;

	public WebElement getSummaryModule() {
		return summaryModule;
	}

	public WebElement getSummaryTextfield() {
		return summaryTextfield;
	}
	
	
}
