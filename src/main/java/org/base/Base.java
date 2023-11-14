package org.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Base {
    public static WebDriver driver;

    //public static WebElement web;
    //To Launch the URL
    //public static void launchurl(WebDriver driver, String URL)
    //{

        //driver.get(URL);
   // }

    //get the title
//    public static void currenturl()
//    {
//        String currenturl=driver.getCurrentUrl();
//        System.out.println(currenturl);
//    }
//getpagesource

//    public static void getpagesource()
//    {
//        String getpagesource=driver.getPageSource();
//        System.out.println(getpagesource);
//    }
//    //close
//    public static void close()
//    {
//
//        driver.close();
//    }
//    //quit
//    public static void quit()
//    {
//
//        driver.quit();
//    }
//    //navigate to another URL
//    public static void navigatetoanotherurl(String anotherurl)
//    {
//
//        driver.navigate().to(anotherurl);
//    }
//    //navigate forward
//    public static void tonavigateforward()
//    {
//
//        driver.navigate().forward();
//    }
//    //navigate refresh
//    public static void refresh()
//    {
//
//        driver.navigate().refresh();
//    }
//    //window maximise
//    public static void maximize(WebDriver driver)
//    {
//
//        driver.manage().window().maximize();
//    }
//    //window minimize
//    public static void minimize()
//    {
//        driver.manage().window().minimize();
//    }
//    //window Fullscreen
//    public static void fullscreen()
//    {
//        driver.manage().window().fullscreen();
//    }
//    //getsize
//    public static void getsize()
//    {
//        Dimension size= driver.manage().window().getSize();
//        System.out.println(size);
//    }
//    //set size for window
//    public static void setsize(int length,int breadth)
//    {
//        driver.manage().window().setSize(new Dimension(length,breadth));
//    }
//    //sendvalues
//    public static void sendvalues(WebElement webelement,String text)
//    {
//        webelement.sendKeys(text);
//
//    }
//    //click button
//    public static void clickbutton(WebElement web)
//    {
//        web.click();
//    }
    //screenshot
    public static void takesscreenshot(String screenshot)throws IOException
    {
        TakesScreenshot ts= (TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        File destination=new File(screenshot);
        FileUtils.copyFile(source,destination);
    }
    //Implicitwait
   public static void Implicitwait(int seconds)
    {
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
//    //thread sleep
//    public static void threadsleep(int time)throws InterruptedException
//    {
//        Thread.sleep(time);
//    }
    //keyboard action down
    public static void keyboardactiondown()throws AWTException
    {
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
    }
    //Keyboard action up
    public static void keyboardactionup()throws AWTException
    {
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_UP);
        r.keyRelease(KeyEvent.VK_UP);
    }
    //Keyboard action Enter
    public static void Keyboardactionenter()throws AWTException
    {
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }

    //dropdown ismultiple
    public static void ismultiple(WebElement web) {
        Select s = new Select(web);
        boolean a = s.isMultiple();
        System.out.println(a);
    }

    //dropdownselectbyindex
    public static void selectbyindex( WebElement web,int num)
    {
        Select s1 = new Select(web);
        s1.selectByIndex(num);
        System.out.println(num);
    }



    //dropdownselectbyvalue()
    public static void selectbyvalue(WebElement web, String  value)

    {

        Select s2=new Select(web);
        s2.selectByValue(value);
        System.out.println(value);
    }
    //selectbyvisibletext()
    public static void selectbyvisibletext(WebElement web,String value)
    {
        Select s3=new Select(web);

        s3.selectByVisibleText(value);
        System.out.println(value);
    }
    //getallselectedoptions
    public static void getallselectedoptions(WebElement web) {
        Select S = new Select(web);

        List<WebElement> allSelectedOptions = S.getAllSelectedOptions();
        for (WebElement w : allSelectedOptions) {
            System.out.println(w.getText());
        }
    }

    //alert(pop up)doubt
    public static void Simplealert()
    {
        Alert simplealert=driver.switchTo().alert();
        simplealert.accept();
    }
    //confirmationalert
    public static void Confirmationalert(WebDriver driver)
    {
        Alert confirmalert=driver.switchTo().alert();
        confirmalert.accept();
        confirmalert.dismiss();
    }
    //promptalert
    public static void promptalert()
    {
        Alert promptaAlert=driver.switchTo().alert();
        promptaAlert.accept();
        promptaAlert.dismiss();
        promptaAlert.getText();
    }
    //mouse Action rightclick
    public static void mouseactionrightclick(WebElement web,WebDriver driver)
    {
        Actions a=new Actions(driver);
        a.contextClick(web).build().perform();
    }

    //mouse Action doubleclick
    public static void mouseactiondoubleclick(WebElement web,WebDriver driver)
    {
        Actions a=new Actions(driver);
        a.contextClick(web).build().perform();
    }
    //mouseaction movetoelement
    public static void mouseactionmovetoelement(WebElement web,WebDriver driver)
    {
        Actions a=new Actions(driver);
        a.moveToElement(web).build().perform();
    }
    //mouseaction draganddrop
    public static void mouseactiondraganddrop(WebElement s,WebElement d)
    {
        Actions actions=new Actions(driver);
        actions.dragAndDrop(s,d).build().perform();

    }
    //frame
    public static void toswitchintoframe(WebElement ref)
    {
        driver.switchTo().frame(ref);
    }
    //frame
    public static void toswitchintoframe(String id)
    {
        driver.switchTo().frame(id);
    }
    //toparentframe
    public static void toparentframe()
    {
        driver.switchTo().parentFrame();
    }
    //todeafultcontent
    public static void todefaultcontent()
    {
        driver.switchTo().defaultContent();
    }
    //scroll
//    public static void toscroll(WebElement re,int a,int b)
//    {
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scroll(a,b)",re);
//
//    }
    public static void switchto() {
        driver.switchTo().alert();
    }
    public static void switchtoframe() {

        driver.switchTo().frame(0);
    }
    public static void switchtowindow() {
        driver.switchTo().window(null);
    }
//toscrollup
    public static void toscrollup(WebDriver driver, WebElement ref)
{JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollintoview(true)",ref);
}
//toscrolldown
    public static void toScrollDown(WebDriver driver,WebElement ref) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", ref);
    }
    //toscroll
    public static void toscroll(WebElement ref,int a,int b)
    {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", ref);
    }

    public static void jclick(WebDriver driver,WebElement ref){
        JavascriptExecutor js= (JavascriptExecutor) driver ;
        js.executeScript("arguments[0].click;",ref);
    }

}


