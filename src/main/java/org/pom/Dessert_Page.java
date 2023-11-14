package org.pom;

import org.openqa.selenium.By;

public class Dessert_Page {

    public By Desserts = By.xpath("//span[text()='DESSERTS']");

    public By choco_lava_cake = By.xpath("//div[@data-label='Choco Lava Cake']/descendant::button[@data-label='addTocart']");

    public By checkout = By.xpath("//button[@data-label='miniCartCheckout']");



}
