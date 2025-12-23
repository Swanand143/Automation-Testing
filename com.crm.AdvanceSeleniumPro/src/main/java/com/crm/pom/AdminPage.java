package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

    public AdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h5[text()='System Users']")
    private WebElement systemUsersTitle;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement addButton;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement usernameSearchField;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement resetButton;

    public String getTitle() {
        return systemUsersTitle.getText();
    }

    public void clickAdd() {
        addButton.click();
    }

    public void enterSearchUsername(String name) {
        usernameSearchField.sendKeys(name);
    }

    public void clickSearch() {
        searchButton.click();
    }

    public void clickReset() {
        resetButton.click();
    }
}
