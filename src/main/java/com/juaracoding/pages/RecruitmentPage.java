package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
    private WebDriver driver;

    public RecruitmentPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;
    @FindBy(xpath = "//button[contains(@class, 'login-button')]")
    private WebElement btnLogin;
    @FindBy(xpath = "//h6[contains(@class, 'topbar-header')]")
    private WebElement txtDashboard;
    @FindBy(xpath = "//span[contains(@class, 'topbar-header-breadcrumb')]")
    private WebElement txtRecruitment;
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Recruitment']")
    private WebElement menuRecruitment;
    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement tambahCandidate;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstName;
    @FindBy(xpath = "//label[normalize-space()='Full Name']")
    private WebElement txtFullName;
    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    private WebElement middleName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;
    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    private WebElement vacancy;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    private WebElement email;
    @FindBy(xpath = "//label[normalize-space()='Email']")
    private WebElement txtEmail;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
    private WebElement contactNumber;
    @FindBy(xpath = "//label[normalize-space()='Contact Number']")
    private WebElement txtContactNumber;
    @FindBy(xpath = "//label[normalize-space()='Vacancy']")
    private WebElement txtVacancy;
    @FindBy(xpath = "//input[@type='file']")
    private WebElement fileInput;
    @FindBy(xpath = "//div[@class='oxd-file-input-div']")
    private WebElement txtFileInput;
    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    private WebElement keywords;
    @FindBy(xpath = "//label[normalize-space()='Keywords']")
    private WebElement txtKeywords;
    @FindBy(xpath = "//textarea[@placeholder='Type here']")
    private WebElement notes;
    @FindBy(xpath = "//label[normalize-space()='Notes']")
    private WebElement txtNotes;
    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    private WebElement checklistConsent;
    @FindBy(xpath = "//label[normalize-space()='Consent to keep data']")
    private WebElement txtCheckListConsent;
    @FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
    private WebElement clickDateApplication;
    @FindBy(xpath = "//div[contains(text(),'14')]")
    private WebElement dateApplication;
    @FindBy(xpath = "//label[normalize-space()='Date of Application']")
    private WebElement closeDateApplication;
    @FindBy(xpath = "//label[normalize-space()='Date of Application']")
    private WebElement txtDateApplication;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement txtBtnSave;


    //Step Action

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public void setRecruitment() {
        menuRecruitment.click();
    }

    public void addCandidate(){
        tambahCandidate.click();
    }

    public void setFullName(String firstName, String middleName, String lastName) {
        this.firstName.sendKeys(firstName);
        this.middleName.sendKeys(middleName);
        this.lastName.sendKeys(lastName);
    }
    public void setVacancy(){
        vacancy.click();
        DriverSingleton.delay(4);
        vacancy.sendKeys("Associate IT Manager");

    }

    public void setFileInput(){
        fileInput.sendKeys("C:\\MyTools\\Tester.png");
    }

    public void setEmail() {
        email.sendKeys("diky123rhan@gmail.com");
    }

    public void setContactNumber() {
        contactNumber.sendKeys("0855555555");
    }

    public void setKeywords() {
        keywords.sendKeys("Test Keyword");

    }

    public void setNotes() {
        notes.sendKeys("Halo");
    }

    public void setChecklistConsent() {
        checklistConsent.click();
    }

    public void setClickDateApplication() {
        clickDateApplication.click();
    }
    public void clickCloseDateApplication(){
        closeDateApplication.click();
    }

    public void setBtnSave() {
        btnSave.click();
    }

    //Soal buat action
    public String getTxtDashboard() {
        return txtDashboard.getText();
    }
    public String getTxtRecruitment() {
        return txtRecruitment.getText();
    }
    public String getTxtFullName(){
        return txtFullName.getText();
    }
    public String getVacancy(){
        return txtVacancy.getText();
    }
    public String getTxtEmail(){
        return txtEmail.getText();
    }
    public String getTxtContactNumber(){
        return txtContactNumber.getText();
    }

    public String getTxtFileInput(){
        return txtFileInput.getText();
    }
    public String getTxtKeywords(){
        return txtKeywords.getText();
    }
    public String getTxtNotes(){
        return txtNotes.getText();
    }
    public String getTxtDateofApplication(){
        return txtDateApplication.getText();
    }
    public String getTxtConsent(){
        return txtCheckListConsent.getText();
    }
    public String getTxtBtnSave(){
        return txtBtnSave.getText();
    }


}
