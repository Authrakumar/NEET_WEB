package com.qa.Base;


import Pages.Signinpage;
import org.openqa.selenium.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import utils.TestUtil;
import utils.WebEventListener;



public class TestBase {

    WebDriverWait wait;

    public static WebDriver driver;
    public static Properties prop;
    public  static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;

    public TestBase(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PageFactory.initElements(driver, this);
    }

    @BeforeTest
    public static void initialization(){
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "F://WFH//Drivers//chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equals("FF")){
            System.setProperty("webdriver.gecko.driver", "");
            driver = new FirefoxDriver();
        }


        e_driver = new EventFiringWebDriver(driver);
        // Now create object of EventListerHandler to register it with EventFiringWebDriver
        eventListener = new WebEventListener();
        e_driver.register(eventListener);
        driver = e_driver;

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));



    }
    public void waitForVisibility(WebElement e) {
        wait = new WebDriverWait (driver, TestUtil.Wait);
        wait.until(ExpectedConditions.visibilityOf(e));
    }
    public void sendkeys(WebElement e,String Input){
        waitForVisibility(e);
        e.sendKeys(Input);
    }
    public void click(WebElement e){
        waitForVisibility(e);
        e.click();
    }
    public void softAssert(Object actual, Object expected) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actual, expected);
        sa.assertAll();
    }
    public String getAttribute(WebElement e,String attribute) {
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }
    public Signinpage clear(WebElement e) {
        waitForVisibility(e);
        e.clear();
        return null;
    }
    public void swap(WebElement e){
        waitForVisibility(e);
        Alert alert= driver.switchTo().alert();
        alert.accept();
    }
    public void pageload(){
     new WebDriverWait(driver, 120).until(
             webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }
    public void scrollend(){
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public void elementtoeclickable(WebElement e){
        wait = new WebDriverWait (driver, TestUtil.Wait);
        WebElement e1 = wait.until(ExpectedConditions.elementToBeClickable(e));
        click(e1);
    }

    public void keyboardenterkey() throws AWTException {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
