package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileModule {
	public ProfileModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='FirstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@value='LastName']")
	private WebElement lastName;
	
	@FindBy(xpath = "//select[@name='dropdown']")
	private WebElement selectTechnologies;
	
	@FindBy(xpath = "//option[.='Java Full Satck']")
	private WebElement javaFullStack;
	
	@FindBy(xpath = "//option[.='React JS']")
	private WebElement reactJS;
	
	@FindBy(xpath = "//option[.='Node JS']")
	private WebElement nodeJS;
	
	@FindBy(xpath = "//select[@id='Total Experience']")
	private WebElement totalExp;
	
	@FindBy(xpath = "//option[.='0']")
	private WebElement zeroExp;
	
	@FindBy(xpath = "//option[.='1']")
	private WebElement oneExp;
	
	@FindBy(xpath = "//option[.='35']")
	private WebElement thirthyfiveExp;
	
	@FindBy(xpath = "//select[@id=\"Total Experience\"]/../../..//option[text()='Select Month']")
	private WebElement monthExp;
	
	@FindBy(xpath = "(//option[.='0'])[2]")
	private WebElement zeromonthExp;
	
	@FindBy(xpath = "(//option[.='10'])[2]")
	private WebElement tenmonthExp;
	
	@FindBy(xpath = "//select[@id='Relevant Experience']")
	private WebElement revelantExp;
	
	@FindBy(xpath = "(//option[.='6'])[3]")
	private WebElement revelantExpsix;
	
	@FindBy(xpath = "(//option[.='5'])[3]")
	private WebElement revelantExpfive;
	//label[.='Relevant Exp(month)']
	@FindBy(xpath = "//select[@id='Relevant Experience']/../../..//option[text()='Select Month']")
	private WebElement revelantExpMonth;
	
	@FindBy(xpath = "(//option[.='6'])[4]")
	private WebElement revelantExpMonthsix;
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getSelectTechnologies() {
		return selectTechnologies;
	}
	public WebElement getJavaFullStack() {
		return javaFullStack;
	}
	public WebElement getReactJS() {
		return reactJS;
	}
	public WebElement getNodeJS() {
		return nodeJS;
	}
	public WebElement getTotalExp() {
		return totalExp;
	}
	public WebElement getZeroExp() {
		return zeroExp;
	}
	public WebElement getOneExp() {
		return oneExp;
	}
	public WebElement getThirthyfiveExp() {
		return thirthyfiveExp;
	}
	public WebElement getMonthExp() {
		return monthExp;
	}
	public WebElement getZeromonthExp() {
		return zeromonthExp;
	}
	public WebElement getTenmonthExp() {
		return tenmonthExp;
	}
	public WebElement getRevelantExp() {
		return revelantExp;
	}
	public WebElement getRevelantExpsix() {
		return revelantExpsix;
	}
	public WebElement getRevelantExpfive() {
		return revelantExpfive;
	}
	public WebElement getRevelantExpMonth() {
		return revelantExpMonth;
	}
	public WebElement getRevelantExpMonthsix() {
		return revelantExpMonthsix;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
