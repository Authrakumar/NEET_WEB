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
    public void Sigin() throws InterruptedException {
        signinpage.entermobile("8667651940");
        signinpage.enterpwd("abc@123");
        signinpage.pressSignin();
        try {
            try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(2000);
    }
    
    // Subject=1
    @Test(priority = 2)
    public void attendtest1_1() throws InterruptedException {
        try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void attendtest1_2() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void attendtest1_3() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void attendtest1_4() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void attendtest1_5() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 7)
    public void attendtest1_6() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void attendtest1_7() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 9)
    public void attendtest1_8() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 10)
    public void attendtest1_9() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 11)
    public void attendtest1_10() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 12)
    public void attendtest1_11() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 13)
    public void attendtest1_12() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    
    
    //Subject=2
    @Test(priority = 14)
    public void attendtest2_1() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.two);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 15)
    public void attendtest2_2() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.two);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 16)
    public void attendtest2_3() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.two);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 17)
    public void attendtest2_4() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.two);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 18)
    public void attendtest2_5() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.two);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 19)
    public void attendtest2_6() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.two);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 20)
    public void attendtest2_7() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.two);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 21)
    public void attendtest2_8() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.two);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 22)
    public void attendtest2_9() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.two);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 23)
    public void attendtest2_10() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.two);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 24)
    public void attendtest2_11() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.two);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 25)
    public void attendtest2_12() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.two);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }

    //Subject=3
    @Test(priority = 26)
    public void attendtest3_1() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.three);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 27)
    public void attendtest3_2() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.three);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 28)
    public void attendtest3_3() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.three);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 29)
    public void attendtest3_4() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.three);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 30)
    public void attendtest3_5() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.three);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 31)
    public void attendtest3_6() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.three);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 32)
    public void attendtest3_7() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.three);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 33)
    public void attendtest3_8() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.three);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 34)
    public void attendtest3_9() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.three);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 35)
    public void attendtest3_10() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.three);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 36)
    public void attendtest3_11() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.three);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 37)
    public void attendtest3_12() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.three);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }

    //Subject=4
    @Test(priority = 38)
    public void attendtest4_1() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.four);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 39)
    public void attendtest4_2() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.four);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 40)
    public void attendtest4_3() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.four);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 41)
    public void attendtest4_4() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.four);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 42)
    public void attendtest4_5() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.four);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 43)
    public void attendtest4_6() throws InterruptedException {
        try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        }
         int i;
        homepage.selectsub(homepage.four);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 44)
    public void attendtest4_7() throws InterruptedException {
        try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i;
        homepage.selectsub(homepage.four);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 45)
    public void attendtest4_8() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.four);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 46)
    public void attendtest4_9() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.four);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 47)
    public void attendtest4_10() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.four);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 48)
    public void attendtest4_11() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.four);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }
    @Test(priority = 49)
    public void attendtest4_12() throws InterruptedException {
       try {
            exceptedcondition(homepage.one);
        } catch (Exception e) {
            e.printStackTrace();
        } 
 int i;
        homepage.selectsub(homepage.four);
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
        testpage.presshomemenu(); Thread.sleep(2000);
    }


    @Test(priority = 50)
    public void logout() throws InterruptedException {
        //testpage.presshomemenu(); Thread.sleep(2000);
        scrolltillend();
        homepage.logout();

    }
}
