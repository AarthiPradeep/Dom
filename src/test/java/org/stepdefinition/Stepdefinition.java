package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.base.Base;
import org.pom.Dessert_Page;
import org.pom.Login_Page;
import org.pom.VegPizza_Page;

import java.time.Duration;


public class Stepdefinition extends Base {

    Login_Page loginPage = new Login_Page();
    VegPizza_Page vegPizzaPage = new VegPizza_Page();
    Dessert_Page dessertPage = new Dessert_Page();
    @Given("launch the  url")
    public void launch_the_url() {
    driver.get("https://pizzaonline.dominos.co.in/");
    driver.manage().window().maximize();
    }
    @When("Enter your Delivery Address")
    public void enter_your_delivery_address() {
        driver.findElement(loginPage.Enter_your_delivery_address).click();

    }
    @When("Enter your Area.")
    public void enter_your_area() throws InterruptedException {
//        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(loginPage.enterArea).sendKeys("600049");
        driver.findElement(loginPage.Address).click();
        driver.findElement(loginPage.suggest).click();
    }
    @When("Go to veg pizza tab")
    public void go_to_veg_pizza_tab() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        jclick(driver,driver.findElement(vegPizzaPage.vegPizza));
        driver.findElement(vegPizzaPage.Allowbtn).click();
    }
    @When("Add Two quantities of Margherita pizza to the cart")
    public void add_two_quantities_of_margherita_pizza_to_the_cart(){
       driver.findElement(vegPizzaPage.Margherita).click();
       driver.findElement(vegPizzaPage.Nothanksbtn).click();
       driver.findElement(vegPizzaPage.addmargherita).click();
       driver.findElement(vegPizzaPage.removeMargherita).click();
    }
    @When("Add Two Quantities of Peppy Paneer pizza to the cart")
    public void add_two_quantities_of_peppy_paneer_pizza_to_the_cart() throws InterruptedException {

        driver.findElement(vegPizzaPage.peppypaneer).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(vegPizzaPage.Nothanksbtn).click();

        driver.findElement(vegPizzaPage.addpeppypaneer).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @When("Go to dessert Tab.")
    public void go_to_dessert_tab() {
      driver.findElement(dessertPage.Desserts).click();
    }
    @When("Add choco lava cake to the cart")
    public void add_choco_lava_cake_to_the_cart(){
        driver.findElement(dessertPage.choco_lava_cake).click();
    }
    @When("Recheck the cart to delete an item from cart")
    public void recheck_the_cart_to_delete_an_item_from_cart() {
        jclick(driver,driver.findElement(vegPizzaPage.removeMargherita));
    }
    @Then("Click the checkout button")
    public void click_the_checkout_button() throws InterruptedException {
       driver.findElement(dessertPage.checkout).click();

       driver.close();
    }

}

