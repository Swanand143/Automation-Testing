package com.crm.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(css = "input[type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//p[text()='Forgot your password? ']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//p[contains(@class, 'alert')] | //p[text()='Invalid credentials']")
    private WebElement errorMessage;

    public void enterUsername(String data) {
        usernameField.sendKeys(data);
    }

    public void enterPassword(String data) {
        passwordField.sendKeys(data);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void clickForgotPassword() {
        forgotPasswordLink.click();
    }
}





//This are public that can directly used
//	@FindBy(name = "username")
//	public WebElement username;
//	
//	@FindBy(css = "input[type='password']")
//	public WebElement password;
//	
//	@FindBy(xpath = "//button[@type='submit']")
//	public WebElement login_button;
//	
//	@FindBy(xpath = "//p[text()='Forgot your password?']")
//	public WebElement forgot_password;

	// Here we achiving data hiding with making variables private