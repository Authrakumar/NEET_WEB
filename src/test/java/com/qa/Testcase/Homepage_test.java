package com.qa.Testcase;

import Pages.Homepage;
import Pages.Signinpage;
import Pages.Testpage;
import com.qa.Base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Homepage_test extends TestBase{
    Homepage homepage;
    Signinpage signinpage;
    Testpage testpage;
    @BeforeMethod
    public void beforeMethod(Method m)
    {
        homepage=new Homepage();
        signinpage=new Signinpage();
        testpage=new Testpage();
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
    public void attenttestone(){
        homepage.selectsub(homepage.one);
        driver.navigate().back();
        homepage.selectsub(homepage.two);
        driver.navigate().back();
        homepage.selectsub(homepage.three);
        driver.navigate().back();
        homepage.selectsub(homepage.four);
        driver.navigate().back();
        homepage.selectsub(homepage.QBank);
        driver.navigate().back();
    }
    @Test(priority = 3)
    public void latest(){
        homepage.selectsub(homepage.Latest);
        testpage.pressinstruction();
        testpage.presshomemenu();
    }

    @Test(priority = 4)
    public void recentActivities() throws InterruptedException {
        int i;
        homepage.selectsub(homepage.one);
        String s1=testpage.T2.getText();
        System.out.println(s1);
        testpage.selecttest(testpage.T2);
        testpage.pressinstruction();
        String count=testpage.count.getText();
        System.out.println(count);
        int qcount=Integer.parseInt(count);
        for (i= 0;i<qcount;i++){
            System.out.println(i);
            testpage.pressfirstoption();
            Thread.sleep(1000);
            testpage.pressSubmitbutton();
            Thread.sleep(1000);
        }
        testpage.presshomemenu();
        String s2=homepage.Recentfirst.getText();
        System.out.println(s2);
        softAssert(s1,s2);
    }
    @Test(priority = 5)
    public void logout() throws InterruptedException {
        Thread.sleep(2000);
        scrolltillend();
        homepage.logout();
    }
}
