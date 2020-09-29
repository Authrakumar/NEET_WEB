package com.qa.Testcase;

import Pages.Homepage;
import Pages.Signinpage;
import Pages.Testpage;
import com.qa.Base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Test_test extends TestBase {
    Testpage testpage;
    Homepage homepage;
    Signinpage signinpage;
    @BeforeMethod
    public void beforeMethod(Method m)
    {
        testpage=new Testpage();
        homepage=new Homepage();
        signinpage=new Signinpage();
        System.out.println("\n" + "****** Starting Test:"+ m.getName() +"*****"+"\n");
    }
    @Test(priority = 1)
    public void Sigin(){
        signinpage.entermobile("8667651940");
        signinpage.enterpwd("abc@12345");
        signinpage.pressSignin();
        pageload();
    }
    @Test(priority = 2)
    public void attendtestt1() throws InterruptedException {
        int i;
        homepage.selectsub(homepage.one);
        testpage.selecttest(testpage.T1);
        testpage.pressinstruction();
        String count=testpage.count.getText();
        System.out.println(count);
        int qcount=Integer.parseInt(count);
        for (i= 0;i<qcount;i++) {
            System.out.println(i);
            testpage.pressfirstoption();
            Thread.sleep(1000);
            testpage.pressSubmitbutton();
            Thread.sleep(1000);
        }
        testpage.presshomemenu();
    }
    @Test(priority = 3)
    public void attendtest2() throws InterruptedException {
        int i;
        homepage.selectsub(homepage.one);
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
    }
    @Test(priority = 4)
    public void attendtest3() throws InterruptedException {
        int i;
        homepage.selectsub(homepage.one);
        testpage.selecttest(testpage.T3);
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
    }
    @Test(priority = 5)
    public void attendtest4() throws InterruptedException {
        int i;
        homepage.selectsub(homepage.one);
        testpage.selecttest(testpage.T4);
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
    }
    @Test(priority = 6)
    public void attendtest5() throws InterruptedException {
        int i;
        homepage.selectsub(homepage.one);
        testpage.selecttest(testpage.T5);
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
    }
    @Test(priority = 7)
    public void attendtest6() throws InterruptedException {
        int i;
        homepage.selectsub(homepage.one);
        testpage.selecttest(testpage.T6);
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
    }
    @Test(priority = 8)
    public void attendtest7() throws InterruptedException {
        int i;
        homepage.selectsub(homepage.one);
        testpage.selecttest(testpage.T7);
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
    }
    @Test(priority = 9)
    public void attendtest8() throws InterruptedException {
        int i;
        homepage.selectsub(homepage.one);
        testpage.selecttest(testpage.T8);
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
    }
    @Test(priority = 10)
    public void attendtest9() throws InterruptedException {
        int i;
        homepage.selectsub(homepage.one);
        testpage.selecttest(testpage.T9);
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
    }
    @Test(priority = 11)
    public void attendtest10() throws InterruptedException {
        int i;
        homepage.selectsub(homepage.one);
        testpage.selecttest(testpage.T10);
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
    }
    @Test(priority = 12)
    public void attendtest11() throws InterruptedException {
        int i;
        homepage.selectsub(homepage.one);
        testpage.selecttest(testpage.T11);
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
    }
    @Test(priority = 13)
    public void attendtest12() throws InterruptedException {
        int i;
        homepage.selectsub(homepage.one);
        testpage.selecttest(testpage.T12);
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
    }
}
