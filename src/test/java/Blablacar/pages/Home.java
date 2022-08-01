package Blablacar.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Blablacar.tests.LoginEmail.driver;

public class Home  {

    static WebElement Open_Login_Menu=driver.findElement(By.xpath("//*[@id='root']/header/div/div[3]/div/button"));
    static WebElement Login=driver.findElement(By.xpath("//*[@id='connect-menu']/ul/li[1]/a"));


    public static void Open_Login(){
        Open_Login_Menu.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Login.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
 }


