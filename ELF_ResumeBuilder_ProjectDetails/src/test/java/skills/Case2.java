package skills;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.EducationModule;
import pomRepository.ProfileModule;
import pomRepository.ProjectDetailsPage;
import pomRepository.SkillsPage;
import pomRepository.SummaryPage;

public class Case2 extends Base_Class {
	@Test
	public void endToEndResume1() throws InterruptedException {
		ExcelUtil exceldata = new ExcelUtil();
		ProjectDetailsPage projectdetails = new ProjectDetailsPage(driver);
		ProfileModule profilemodule=new ProfileModule(driver);
		SummaryPage summarypage=new SummaryPage(driver);
		SkillsPage skillpage=new SkillsPage(driver);
		EducationModule educationmodule=new EducationModule(driver);
		
		String firstname = exceldata.readStringDataFromExcel("Sheet1",0,0);
		String lastname = exceldata.readStringDataFromExcel("Sheet1",0,1);
		
		profilemodule.getFirstName().clear();
		profilemodule.getFirstName().sendKeys(firstname);
		
		profilemodule.getLastName().clear();
		profilemodule.getLastName().sendKeys(lastname);
		
		profilemodule.getSelectTechnologies().click();
		profilemodule.getJavaFullStack().click();
		
		profilemodule.getTotalExp().click();
		profilemodule.getOneExp().click();
		
		profilemodule.getMonthExp();
		profilemodule.getTenmonthExp().click();
		
		profilemodule.getRevelantExp().click();
		profilemodule.getRevelantExpfive().click();
		
		profilemodule.getRevelantExpMonth().click();
		profilemodule.getRevelantExpMonthsix().click();
		
		skillpage.getSkillsModule().click();
		skillpage.getFrontendTechnologies().click();
		skillpage.getHtml().click();
		
		skillpage.getBackendTechnologies().click();
		skillpage.getSpring().click();
		
		skillpage.getMiddlewareTechnologies().click();
		skillpage.getSoapServices().click();
		
		skillpage.getDesignePatterns().click();
		skillpage.getSingleton().click();
		
		skillpage.getDataBaseUsed().click();
		skillpage.getOracle10g().click();
		
		skillpage.getVersionControlSystem().click();
		skillpage.getGitHub().click();
		
		skillpage.getDevelopmentTool().click();
		skillpage.getMaven().click();
		
		educationmodule.getEducationModule().click();
		WebElement education = educationmodule.getHighestEducationDropDown();
		Select s1 = new Select(education);
		s1.selectByIndex(1);
		
		WebElement special = educationmodule.getSpecilizationDropdown();
		Select s2 = new Select(special);
		s2.selectByIndex(2);
		
		WebElement university = educationmodule.getUniversityDropDown();
		Select s3 = new Select(university);
		s3.selectByIndex(3);
		
		projectdetails.getProjectDetails().click();
		String projectName = exceldata.readStringDataFromExcel("Sheet1", 0, 2);
		projectdetails.getProjectName().sendKeys(projectName);
		
		projectdetails.getForntendtextfield().click();
		projectdetails.getHtmltextfield().click();
		
		String projectDisc = exceldata.readStringDataFromExcel("Sheet1", 0, 3);
		projectdetails.getProjectDescription().sendKeys(projectDisc);
		
		String rolesandrep = exceldata.readStringDataFromExcel("Sheet1", 0, 4);
		projectdetails.getRolesResponsibilities().sendKeys(rolesandrep);
		
		projectdetails.getDownlordAsWORD().click();
		Thread.sleep(5000);
	}
}