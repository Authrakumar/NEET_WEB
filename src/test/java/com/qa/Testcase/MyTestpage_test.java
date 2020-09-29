package com.qa.Testcase;

import Pages.*;
import com.qa.Base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class MyTestpage_test extends TestBase {
    Signinpage signinpage;
    Homepage homepage;
    MyTestpage myTestpage;
    Testpage testpage;
    @BeforeMethod
    public void beforeMethod(Method m)
    {

        signinpage=new Signinpage();
        homepage=new Homepage();
        myTestpage=new MyTestpage();
        testpage=new Testpage();
        System.out.println("\n" + "****** Starting Test:"+ m.getName() +"*****"+"\n");
    }
    @Test(priority = 1)
    public void Sigin() throws InterruptedException {
        signinpage.entermobile("8667651940");
        signinpage.enterpwd("abc@123");
        signinpage.pressSignin();
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    public void mytest() throws InterruptedException {
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
        homepage.mytest();
        String s2=myTestpage.Title.getText();
        System.out.println(s2);
        softAssert(s1,s2);
    }
    @Test(priority = 3)
    public void logout() throws InterruptedException {
        //testpage.presshomemenu();
        myTestpage.scolltilllogout();
        homepage.logout();
    }
}

