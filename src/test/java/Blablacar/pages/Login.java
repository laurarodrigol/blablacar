package Blablacar.pages;

import Blablacar.data.Dataset;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static Blablacar.tests.LoginEmail.driver;

public class Login {

    static WebElement Login_Email=driver.findElement(By.cssSelector("a[href*='email']"));
            //xpath("//*[@id='MainContent']/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/nav/ul/li[2]/a"));
    static WebElement Email_Field=driver.findElement(By.name("login"));
    static WebElement Password_Field=driver.findElement(By.name("password"));
    static WebElement Login_button=driver.findElement(By.xpath("//*[@id='MainContent']/div/div/div/div/div/div/div/div/div/div/div/div/form/div[2]/div/button"));
    static WebElement Error_Message=driver.findElement(By.xpath("/html/body/div[3]/div/div/span/span"));

public static void Complete_Login(){
    String email = Dataset.Email;
    String password = Dataset.Password;
    Login_Email.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    Email_Field.sendKeys(email);
    Password_Field.sendKeys(password);
    Login_button.click();
}
public static String Get_Error_Message(){
    String value = Error_Message.getAttribute("value");
    return value;
}
}

