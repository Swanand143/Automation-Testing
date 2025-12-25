package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {

    public PIMPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h5[text()='Employee Information']")
    private WebElement employeeInfoTitle;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement addEmployeeButton;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement employeeNameField;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement employeeIDField;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement resetButton;

    @FindBy(xpath = "//div[@class='oxd-table']")
    private WebElement employeeTable;

    public String getTitle() {
        return employeeInfoTitle.getText();
    }

    public void clickAddEmployee() {
        addEmployeeButton.click();
    }

    public void enterEmployeeName(String name) {
        employeeNameField.sendKeys(name);
    }

    public void enterEmployeeID(String id) {
        employeeIDField.sendKeys(id);
    }

    public void clickSearch() {
        searchButton.click();
    }

    public void clickReset() {
        resetButton.click();
    }

    public boolean isTableDisplayed() {
        return employeeTable.isDisplayed();
    }
}
