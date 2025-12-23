package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage {

    public MyInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='My Info']")
    private WebElement myInfoMenu;

    @FindBy(xpath = "//h6[text()='Personal Details']")
    private WebElement personalDetailsTitle;
    
    @FindBy(name = "firstName")
    private WebElement firstNameField;

    @FindBy(name = "middleName")
    private WebElement middleNameField;

    @FindBy(name = "lastName")
    private WebElement lastNameField;
    
    @FindBy(xpath = "//label[text()='Employee Id']/../following-sibling::div//input")
    private WebElement empIDField;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//a[text()='Contact Details']")
    private WebElement contactDetailsTab;

    @FindBy(xpath = "//a[text()='Emergency Contacts']")
    private WebElement emergencyContactsTab;

    @FindBy(xpath = "//a[text()='Dependents']")
    private WebElement dependentsTab;

    public void openMyInfo() {
        myInfoMenu.click();
    }

    public String getPersonalDetailsTitle() {
        return personalDetailsTitle.getText();
    }

    public void enterFirstName(String name) {
        firstNameField.clear();
        firstNameField.sendKeys(name);
    }

    public void enterMiddleName(String name) {
        middleNameField.clear();
        middleNameField.sendKeys(name);
    }

    public void enterLastName(String name) {
        lastNameField.clear();
        lastNameField.sendKeys(name);
    }

    public void clickSave() {
        saveButton.click();
    }

    public void clickContactDetails() {
        contactDetailsTab.click();
    }

    public void clickEmergencyContacts() {
        emergencyContactsTab.click();
    }

    public void clickDependents() {
        dependentsTab.click();
    }
}
