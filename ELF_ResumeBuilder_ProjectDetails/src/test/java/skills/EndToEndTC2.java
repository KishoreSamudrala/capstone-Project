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

public class EndToEndTC2 extends Base_Class {
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
		
		projectdetails.getDownlordAsPDF().click();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//pg.getProjectDetails().click();
		//Thread.sleep(5000);
		//pg.getProjectName().sendKeys("akksjsj");
		//pg.getForntendtextfield().click();
		//pg.getForntendcheckbox().click();
		//Thread.sleep(5000);
		//WebElement kk = pg.getForntendtextfield();
		// pg.htmltextfield().click();
		 //Thread.sleep(5000);
		// ExcelUtil excel = new ExcelUtil();
		// excel.readAnyDataFromExcelInString(sheetName, rowNum, cellNum);
		//ProfileModule pro=new ProfileModule(driver);
		
		//pro.getFirstName().clear();
		//pro.getFirstName().sendKeys("jjj");
		//Thread.sleep(5000);
		//pro.getLastName().clear();
		//pro.getLastName().sendKeys("hghggfff");
		//pro.getSelectTechnologies().click();
		//pro.getJavaFullStack().click();
		//Thread.sleep(3000);
		//pro.getTotalExp().click();
		//pro.getZeroExp().click();
		//Thread.sleep(5000);
		//pro.getMonthExp().click();
		//pro.getTenmonthExp().click();
		//Thread.sleep(5000);
		//pro.getRevelantExp().click();
		//pro.getRevelantExpfive().click();
		//Thread.sleep(5000);
		//pro.getRevelantExpMonth().click();
		//pro.getRevelantExpMonthsix().click();
		//Thread.sleep(5000);
		//SummaryPage sp=new SummaryPage(driver);
		//sp.getSummaryModule().click();
		//Thread.sleep(5000);
		//sp.getSummaryTextfield().click();
		//sp.getSummaryTextfield().sendKeys("kjwkj");
		//Thread.sleep(5000);
		
		
		//SkillsPage sk=new SkillsPage(driver);
		//sk.getSkillsModule().click();
		//sk.getResumeBuilderName().click(); 
		//sk.getFrontendTechnologies().click();
		//sk.getHtml().click();
		//Thread.sleep(5000);
		
		//sk.getBackendTechnologies().click();
		//sk.getSql().click();
		//Thread.sleep(5000);
		//sk.getMiddlewareTechnologies().click();
		//sk.getJms().click();
		//Thread.sleep(5000);
		//sk.getDesignePatterns().click();
		//sk.getModelViewControl().click();
		//Thread.sleep(5000);
		//sk.getDataBaseUsed().click();
		//sk.getOracle10g().click();
		//Thread.sleep(5000);
		
		//sk.getVersionControlSystem().click();
		//sk.getGitHub().click();
		
		//sk.getAws().click();
		//sk.getEc2().click();
		
		//sk.getSdlc().click();
		//sk.getWaterfallModelAndAgileGit().click();
		
		//sk.getDevelopmentTool().click();
		//sk.getMaven().click();
		//Thread.sleep(5000);
		
		//EducationModule ed=new EducationModule(driver);
		//ed.getEducationModule().click();
		//Thread.sleep(5000);
		
		//WebElement kk = ed.getHighestEducationDropDown();
		//Select s=new Select(kk);
		//s.selectByIndex(2);
		//Thread.sleep(5000);
		
		//WebElement ss = ed.getSpecilizationDropdown();
		//Select sss=new Select(ss);
		//sss.selectByIndex(1);
		//Thread.sleep(5000);
		
		//WebElement eee = ed.getUniversityDropDown();
		//Select ssp=new Select(ss);
		//ssp.selectByIndex(1);
		//Thread.sleep(5000);
		
		//pg.getProjectDetails().click();
		//Thread.sleep(5000);
		//pg.getProjectName().click();
		//pg.getProjectName().sendKeys("jsjjj");
		//Thread.sleep(5000);
		//pg.getForntendtextfield().click();
		//Thread.sleep(5000);
		//pg.getBackendtextfield().click();
		//Thread.sleep(5000);
		//pg.getMiddleWaretextfield().click();
		//Thread.sleep(5000);
		//pg.getDesignPatterntextfield().click();
		//Thread.sleep(5000);
		//pg.getDevelopmentTooltextfield().click();
		//Thread.sleep(5000);
		//pg.getTeamSize().click();
		//Thread.sleep(5000);
		//pg.getProjectDescription().click();
		//Thread.sleep(5000);
		//pg.getRolesResponsibilities().click();
		//Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
