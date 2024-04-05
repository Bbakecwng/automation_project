package myproject;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pagerepo.DashBoard;
import pagerepo.LoginPage;

public class DashBoardTest extends BaseClass{
	
	
	
	  
	  @Test(priority=20)
	  
	  public void verifyLoginStatusText() {
	  
	  LoginPage login = new LoginPage(driver); login.callLogin();
	  
	  DashBoard dashboardItem = new DashBoard(driver); String
	  loginStatusText =dashboardItem.loginInStatusText().getText();
	  if(dashboardItem.loginInStatusText().isDisplayed()) {
	  System.out.println("Login Status text is : "+loginStatusText);
	  Reporter.log("==Login Status Text shown and is Verified!", true); } }
	  
	  
	  @Test(priority=30)
	  
	  public void verifyGreetingText() {
	  
	  LoginPage login = new LoginPage(driver); login.callLogin();
	  
	  DashBoard dashboardItem = new DashBoard(driver); String greetingText
	  = dashboardItem.greetingText().getText();
	  if(dashboardItem.greetingText().isDisplayed()) {
	  System.out.println("Greeting text is : "+ greetingText);
	  Reporter.log("==Greeting Text is verified!", true); } }
	  
	  @Test(priority=40) public void verifyTotalApplicants() {
	  
	  LoginPage login = new LoginPage(driver); login.callLogin();
	  
	  DashBoard dashboardItem = new DashBoard(driver); String
	  totalApplicantsActualText = dashboardItem.totalApplicants().getText(); String
	  totalApplicantsExpectedText = "TOTAL APPLICANTS";
	  assertEquals(totalApplicantsActualText, totalApplicantsExpectedText);
	  Reporter.log("==Total Applicants text verified!==", true); }
	  
	  
	  @Test(priority=50) public void verifyTotalApplicantsNumber() {
	  
	  LoginPage login = new LoginPage(driver); login.callLogin();
	  
	  DashBoard dashboardItem = new DashBoard(driver); String
	  totalApplicantsNumberTxt = dashboardItem.totalApplicantsNumber().getText();
	  if(dashboardItem.totalApplicantsNumber().isDisplayed()) { System.out.
	  println("Total Applicants Number displayed with the total Applicants Number of : "
	  + totalApplicantsNumberTxt);
	  Reporter.log("==Total Applicants Number Verified!==", true); } }
	  
	  
	  @Test(priority=60) public void verifyTotalApplications() {
	  
	  LoginPage login = new LoginPage(driver); login.callLogin();
	  
	  DashBoard dashboardItem = new DashBoard(driver); String
	  totalApplicationsActualText = dashboardItem.totalApplications().getText();
	  String totalApplicationsExpectedText = "TOTAL APPLICATIONS";
	  assertEquals(totalApplicationsActualText, totalApplicationsExpectedText);
	  Reporter.log("==Total Applications Text has been Verified!==", true);
	  
	  }
	 
	
	
	  @Test(priority=70) public void verifyTotalApplicationsNumber() {
	  
	  LoginPage login = new LoginPage(driver); login.callLogin();
	  
	  DashBoard dashboardItem = new DashBoard(driver); String
	  totalApplicationsNumberTxt =
	  dashboardItem.totalApplicationsNumber().getText();
	  if(dashboardItem.totalApplicationsNumber().isDisplayed()) { System.out.
	  println("Total Applications Number is verified with the number of : "
	  +totalApplicationsNumberTxt);
	  Reporter.log("==Total Applications Number has been Verified!==", true); } }
	 
	
	  @Test(priority=80) public void verifyGrantedStudent() {
	  
	  LoginPage login = new LoginPage(driver); login.callLogin();
	  
	  DashBoard dashboardItem = new DashBoard(driver); String
	  grantedStudentActualText = dashboardItem.grantedStudent().getText(); String
	  grantedStudentExpectedText = "GRANTED STUDENTS";
	  assertEquals(grantedStudentActualText, grantedStudentExpectedText);
	  Reporter.log("==Granted Student Text has been Verified!==", true); }
	  
	  @Test(priority=90) public void verifyGrantedStudentNumber() {
	  
	  LoginPage login = new LoginPage(driver); login.callLogin();
	  
	  DashBoard dashboardItem = new DashBoard(driver); String
	  grantedStudentNumberTxt = dashboardItem.grantedStudentNumber().getText();
	  if(dashboardItem.grantedStudentNumber().isDisplayed()) {
	  System.out.println("Granted Student Number is Verified with the number of :"
	  +grantedStudentNumberTxt);
	  Reporter.log("==Granted Student Number has been Verfied!==", true); }
	  
	  }
	 
	
	@Test(priority=100)
	public void verifyTotalUniversities() {
		
		LoginPage login = new LoginPage(driver);
		login.callLogin();
		
		DashBoard dashboardItem = new DashBoard(driver);
		String totalUniversitiesActualText = dashboardItem.totalUniversties().getText();
		String totalUniversitiesExpectedText = "TOTAL UNIVERSITIES";
		assertEquals(totalUniversitiesActualText, totalUniversitiesExpectedText);
		Reporter.log("==Total Universities Text has been Verified!", true);
	}
	
	@Test(priority=110)
	public void verifyTotalUniversitiesNumber() {
		
		LoginPage login = new LoginPage(driver);
		login.callLogin();
		
		DashBoard dashboardItem = new DashBoard(driver);
		String totalUniversitiesTxt = dashboardItem.totalUniversitiesNumber().getText();
		if(dashboardItem.totalUniversitiesNumber().isDisplayed()) {
			System.out.println("Total Universities Number is verified with the number of :"+ totalUniversitiesTxt);
			Reporter.log("==Total Universities Number has been Verified!==", true);
		}
	}

}
