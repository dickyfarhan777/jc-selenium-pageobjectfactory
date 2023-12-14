package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.RecruitmentPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RecruitmentTest {
    private WebDriver driver;
    private RecruitmentPage recruitmentPage;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(URL);
        recruitmentPage = new RecruitmentPage();
    }

    @AfterClass
    public void finish() {
        DriverSingleton.delay(4);
        DriverSingleton.closeObjectInstance();
    }

    @Test(priority = 1)
    public void testValidLogin() {
        recruitmentPage.login("Admin", "admin123");
        Assert.assertEquals(recruitmentPage.getTxtDashboard(),"Dashboard");
    }

    @Test(priority = 2)
    public void menuRedruitment() {
        recruitmentPage.setRecruitment();
        Assert.assertTrue(recruitmentPage.getTxtRecruitment().contains("Recruitment"));
    }

    @Test(priority = 3)
    public void addCandidate(){
        recruitmentPage.addCandidate();
    }
//
    @Test(priority = 4)
    public void fullName(){
        recruitmentPage.setFullName("Dicky"," ","Farhan");
        Assert.assertEquals(recruitmentPage.getTxtFullName(),"Full Name");
    }
    @Test(priority = 5)
    public void vacancy(){
        recruitmentPage.setVacancy();;
        Assert.assertEquals(recruitmentPage.getVacancy(),"Vacancy");
    }
    @Test(priority = 6)
    public void resume(){
        recruitmentPage.setFileInput();
        DriverSingleton.delay(4);
        Assert.assertEquals(recruitmentPage.getTxtFileInput(),"Tester.png");
    }
    @Test(priority = 7)
    public void email(){
        recruitmentPage.setEmail();
        Assert.assertEquals(recruitmentPage.getTxtEmail(),"Email");
    }
    @Test(priority = 8)
    public void contactNumber(){
        recruitmentPage.setContactNumber();
        Assert.assertEquals(recruitmentPage.getTxtContactNumber(), "Contact Number");
    }
    @Test(priority = 9)
    public void keywords(){
        recruitmentPage.setKeywords();
        Assert.assertEquals(recruitmentPage.getTxtKeywords(),"Keywords");
    }
    @Test(priority = 10)
    public void notes(){
        recruitmentPage.setNotes();
        Assert.assertEquals(recruitmentPage.getTxtNotes(),"Notes");
    }
    @Test(priority = 11)
    public void checkListConsent(){
        recruitmentPage.setChecklistConsent();
        Assert.assertEquals(recruitmentPage.getTxtConsent(),"Consent to keep data");
    }
    @Test(priority = 12)
    public void dateApplication(){
        recruitmentPage.setClickDateApplication();
        Assert.assertEquals(recruitmentPage.getTxtDateofApplication(),"Date of Application");
    }
    @Test(priority = 13)
    public void closeDateApplication(){
        recruitmentPage.clickCloseDateApplication();
        Assert.assertEquals(recruitmentPage.getTxtDateofApplication(),"Date of Application");
    }
    @Test(priority = 14)
    public void btnSave(){
        DriverSingleton.delay(4);
        recruitmentPage.setBtnSave();
        Assert.assertEquals(recruitmentPage.getTxtBtnSave(),"Save");
    }
//    @Test(priority = 13)
//    @Test(priority = 14)
//    @Test(priority = 15)
//    @Test(priority = 16)
//    @Test(priority = 17)

}
