package org.pom;
import org.base.Base;
import org.openqa.selenium.By;

public class Login_Page extends Base {

    public By Enter_your_delivery_address = By.xpath("//input[@class='srch-cnt-srch-inpt']");

    public By enterArea = By.xpath("//input[@placeholder='Enter Area / Locality']");
    public By Address = By.xpath("//button[@data-label='Locate_Me']");

    public By suggest=By.xpath("(//span[@class='lst-desc-main ellipsis'])[1]");




}
