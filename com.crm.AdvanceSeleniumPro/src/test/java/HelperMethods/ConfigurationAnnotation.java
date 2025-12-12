package HelperMethods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @Test
    public void main1() {
        System.out.println("Main1");
    }
    @Test
    public void main2() {
        System.out.println("Main2");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }
}
