package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {

    public LeavePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h5[text()='Leave List']")
    private WebElement leaveListTitle;

    @FindBy(xpath = "//button[normalize-space()='Apply']")
    private WebElement applyButton;

    @FindBy(xpath = "//label[text()='From Date']/..//input")
    private WebElement fromDate;

    @FindBy(xpath = "//label[text()='To Date']/..//input")
    private WebElement toDate;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement resetButton;

    @FindBy(xpath = "//div[contains(@class, 'oxd-table-card')]")
    private WebElement leaveTable;

    public String getLeaveListTitle() {
        return leaveListTitle.getText();
    }

    public void clickApply() {
        applyButton.click();
    }

    public void enterFromDate(String date) {
        fromDate.clear();
        fromDate.sendKeys(date);
    }

    public void enterToDate(String date) {
        toDate.clear();
        toDate.sendKeys(date);
    }

    public void clickSearch() {
        searchButton.click();
    }

    public void clickReset() {
        resetButton.click();
    }

    public boolean isTableVisible() {
        return leaveTable.isDisplayed();
    }
}
