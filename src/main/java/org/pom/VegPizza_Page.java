package org.pom;

import org.openqa.selenium.By;

public class VegPizza_Page {

    public By vegPizza = By.xpath("//span[text()='VEG PIZZA']");

    public By Allowbtn = By.id("optInText");

    public By Margherita = By.xpath("//div[@data-label='Veg Pizza']/descendant::div[@data-label='Margherita']/descendant::button[@data-label='addTocart']");

    public By Nothanksbtn = By.xpath("//span[text()='ADD']");

    public By Scrol = By.xpath("(//span[.='Peppy Paneer'])[1]");

    public By addmargherita = By.xpath("//div[@data-label='Veg Pizza']/descendant::div[@data-label='Margherita']/descendant::div[@data-label='increase']");

    public By addpeppypaneer = By.xpath("//div[@data-label='Veg Pizza']/descendant::div[@data-label='Peppy Paneer']/descendant::div[@data-label='quantity']/descendant::div[@data-label='increase']");

    public By peppypaneer = By.xpath("//div[@data-label='Veg Pizza']/descendant::div[@data-label='Peppy Paneer']/descendant::button[@data-label='addTocart']");

    public By removeMargherita = By.xpath("//div[@data-label='Veg Pizza']/descendant::div[@data-label='Margherita']/descendant::div[@data-label='decrease']");
}