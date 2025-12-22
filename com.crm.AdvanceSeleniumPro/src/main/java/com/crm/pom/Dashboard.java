package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

    public Dashboard(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement dashboardTitle;

    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement adminMenu;

    @FindBy(xpath = "//span[text()='PIM']")
    private WebElement pimMenu;

    @FindBy(xpath = "//span[text()='Leave']")
    private WebElement leaveMenu;

    @FindBy(xpath = "//span[text()='My Info']")
    private WebElement myInfoMenu;

    @FindBy(xpath = "//span[text()='Recruitment']")
    private WebElement recruitmentMenu;

    public String getDashboardTitle() {
        return dashboardTitle.getText();
    }

    public void clickAdmin() {
        adminMenu.click();
    }

    public void clickPIM() {
        pimMenu.click();
    }

    public void clickLeave() {
        leaveMenu.click();
    }

    public void clickMyInfo() {
        myInfoMenu.click();
    }

    public void clickRecruitment() {
        recruitmentMenu.click();
    }
}
