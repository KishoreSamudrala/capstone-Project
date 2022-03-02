package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationModule {
	public EducationModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Education']")
	private WebElement educationModule;
	
	//@FindBy(xpath = "//button[text()='Education']")
	//private WebElement educationTabButton;
	
	public WebElement getEducationModule() {
		return educationModule;
	}

	@FindBy(id = "University")
	private WebElement universityDropDown;
	
	@FindBy(id = "Highest Education")
	private WebElement highestEducationDropDown;
	
	@FindBy(id = "Specialization")
	private WebElement specilizationDropdown;

	//public WebElement getEducationTabButton() {
	//	return educationTabButton;
	//}

	public WebElement getUniversityDropDown() {
		return universityDropDown;
	}

	public WebElement getHighestEducationDropDown() {
		return highestEducationDropDown;
	}

	public WebElement getSpecilizationDropdown() {
		return specilizationDropdown;
	}
	
	
}