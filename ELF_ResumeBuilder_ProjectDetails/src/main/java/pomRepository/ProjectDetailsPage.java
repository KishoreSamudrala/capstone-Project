package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectDetailsPage {
	public ProjectDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='ProjectDetails']")
	private WebElement projectDetails;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement projectName;

	@FindBy(id = "1")
	private WebElement forntendcheckbox;
	
	@FindBy(xpath = "//input[@placeholder='Frontend Technologies']")
	private WebElement forntendtextfield;
	
	@FindBy(xpath = "//li[.='HTML']")
	private WebElement htmltextfield;

	public WebElement getHtmltextfield() {
		return htmltextfield;
	}

	public WebElement getIncludeLogo() {
		return includeLogo;
	}

	public WebElement getIncludeProfilePic() {
		return includeProfilePic;
	}

	public WebElement getIncludeEducation() {
		return includeEducation;
	}

	public WebElement getNoProjectAvailable() {
		return noProjectAvailable;
	}

	public WebElement getDownlordAsPDF() {
		return downlordAsPDF;
	}

	public WebElement getDownlordAsWORD() {
		return downlordAsWORD;
	}

	public WebElement getImage() {
		return image;
	}

	@FindBy(xpath = "(//input[@class='checkBox'])[2]")
	private WebElement backendcheckbox;
	
	@FindBy(id = "search_input")
	private WebElement backendtextfield;

	@FindBy(xpath = "(//input[@class='checkBox'])[3]")
	private WebElement middleWarecheckbox;
	
	@FindBy(xpath = "//input[@placeholder='Middleware Technologies']")
	private WebElement middleWaretextfield;

	@FindBy(xpath = "(//input[@class='checkBox'])[4]")
	private WebElement designPatternscheckbox;
	
	@FindBy(xpath = "//input[@placeholder='Design Patterns']")
	private WebElement designPatterntextfield;

	@FindBy(xpath = "(//input[@class='checkBox'])[5]")
	private WebElement developmentToolscheckbox;
	
	@FindBy(xpath = "//input[@placeholder='Development Tools']")
	private WebElement developmentTooltextfield;

	@FindBy(id = "Duration")
	private WebElement selectioDurationDropDown;

	@FindBy(xpath = "//input[@type='number']")
	private WebElement teamSize;

	@FindBy(xpath = "//input[@maxlength='1000']")
	private WebElement projectDescription;

	@FindBy(xpath = "(//input[@maxlength='1000'])[2]")
	private WebElement rolesResponsibilities;

	@FindBy(xpath = "//button[.='+Project']")
	private WebElement addProject;
	
	@FindBy(xpath = "(//input[@class='checkBox'])[6]")
	private WebElement includeLogo;
	
	@FindBy(xpath = "(//input[@class='checkBox'])[7]")
	private WebElement includeProfilePic;
	
	@FindBy(xpath = "(//input[@class='checkBox'])[8]")
	private WebElement includeEducation;
	
	@FindBy(xpath = "//select[@id='University']")
	private WebElement noProjectAvailable;
	
	@FindBy(xpath = "//button[.='PDF']")
	private WebElement downlordAsPDF;
	
	@FindBy(xpath = "//button[.='WORD']")
	private WebElement downlordAsWORD;
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement image;

	public WebElement getProjectDetails() {
		return projectDetails;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getForntendcheckbox() {
		return forntendcheckbox;
	}

	public WebElement getForntendtextfield() {
		return forntendtextfield;
	}

	public WebElement htmltextfield() {
		return htmltextfield;
	}

	public WebElement getBackendcheckbox() {
		return backendcheckbox;
	}

	public WebElement getBackendtextfield() {
		return backendtextfield;
	}

	public WebElement getMiddleWarecheckbox() {
		return middleWarecheckbox;
	}

	public WebElement getMiddleWaretextfield() {
		return middleWaretextfield;
	}

	public WebElement getDesignPatternscheckbox() {
		return designPatternscheckbox;
	}

	public WebElement getDesignPatterntextfield() {
		return designPatterntextfield;
	}

	public WebElement getDevelopmentToolscheckbox() {
		return developmentToolscheckbox;
	}

	public WebElement getDevelopmentTooltextfield() {
		return developmentTooltextfield;
	}

	public WebElement getSelectioDurationDropDown() {
		return selectioDurationDropDown;
	}

	public WebElement getTeamSize() {
		return teamSize;
	}

	public WebElement getProjectDescription() {
		return projectDescription;
	}

	public WebElement getRolesResponsibilities() {
		return rolesResponsibilities;
	}

	public WebElement getAddProject() {
		return addProject;
	}

	public WebElement getSkillsModuleLink() {
		return projectDetails;
		
		
	}
}

