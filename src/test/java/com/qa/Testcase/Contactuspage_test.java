package com.qa.Testcase;

import Pages.Changepasswordpage;
import Pages.Contactuspage;
import Pages.Homepage;
import Pages.Signinpage;
import com.qa.Base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.lang.reflect.Method;

public class Contactuspage_test extends TestBase {
    Signinpage signinpage;
    Changepasswordpage changepasswordpage;
    Homepage homepage;
    Contactuspage contactuspage;
    @BeforeMethod
    public void beforeMethod(Method m)
    {
        changepasswordpage=new Changepasswordpage();
        signinpage=new Signinpage();
        homepage=new Homepage();
        contactuspage=new Contactuspage();
        System.out.println("\n" + "****** Starting Test:"+ m.getName() +"*****"+"\n");
    }
    @Test(priority = 1)
    public void Sigin() throws InterruptedException {
        signinpage.entermobile("8667651940");
        signinpage.enterpwd("abc@123");
        signinpage.pressSignin();
        try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void emptysubmit() throws InterruptedException, AWTException {
        contactuspage.scolltillcontactus();
        homepage.contactus();
        contactuspage.clearall();
        contactuspage.pressSubmitbutton();
        Assert.assertTrue(contactuspage.popup.getText().contains("Please enter your name"));
        keyboardenterkey();
    }
    @Test(priority = 3)
    public void nameonly() throws AWTException, AWTException {
        contactuspage.entername("uk");
        contactuspage.pressSubmitbutton();
        Assert.assertTrue(contactuspage.popup.getText().contains("Please enter your email id"));
        keyboardenterkey();
    }
    @Test(priority = 4)
    public void name_emailonly() throws AWTException, AWTException {
        contactuspage.clearall();
        contactuspage.entername("uk");
        contactuspage.enteremail("uthar.a305@gmail.com");
        contactuspage.pressSubmitbutton();
        Assert.assertTrue(contactuspage.popup.getText().contains("Please enter your Thought"));
        keyboardenterkey();
    }
    @Test(priority = 5)
    public void invalidEmail() throws AWTException, AWTException {
        contactuspage.clearall();
        contactuspage.entername("uk");
        contactuspage.enteremail("uthar.a305@g");
        contactuspage.pressSubmitbutton();
        Assert.assertTrue(contactuspage.popup.getText().contains("Please enter valid email id"));
        keyboardenterkey();
    }
    @Test(priority = 6)
    public void sendcontactus() throws AWTException, AWTException {
        contactuspage.clearall();
        contactuspage.entername("uk");
        contactuspage.enteremail("uthar.a305@gmail.com");
        contactuspage.entercontent("Test");
        contactuspage.pressSubmitbutton();
        String s1=contactuspage.popup.getText();
        System.out.println("success:"+s1);
        Assert.assertTrue(s1.contains("Thoughts shared successfully"));
        keyboardenterkey();
    }
    @Test(priority = 10)
    public void logout() throws InterruptedException {
        driver.navigate().refresh();
        scrolltillend();
        homepage.logout();
    }

}
