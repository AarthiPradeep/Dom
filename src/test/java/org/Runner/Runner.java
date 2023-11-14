package org.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.base.Base;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prade\\IdeaProjects\\Dominos_New\\src\\test\\Dominos.feature",
glue = "org.stepdefinition"
)
public class Runner extends Base {


//    public static WebDriver driver;


    @BeforeClass
    public static void start(){

        driver=new ChromeDriver();
    }
}
