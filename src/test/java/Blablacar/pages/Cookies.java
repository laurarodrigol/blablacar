package Blablacar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Blablacar.tests.LoginEmail.driver;

public class Cookies {

    static WebElement accept=driver.findElement(By.id("didomi-notice-agree-button"));

    public static void Accept_Cookies(){
        accept.click();
    }

}
