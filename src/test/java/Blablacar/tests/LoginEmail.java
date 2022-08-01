package Blablacar.tests;
import Blablacar.asserts.LoginAsserts;
import Blablacar.data.Dataset;
import Blablacar.pages.Cookies;
import Blablacar.pages.Home;
import Blablacar.pages.Login;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginEmail {
    public static WebDriver driver;
    @Test
    public void LoginInvalidUser() {
        System.setProperty("webdriver.chrome.driver","/Users/lrodrigo/Documents/Automation/chromedriver");
        driver = new ChromeDriver();
        String url = Dataset.URL;
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //On this wait it's necessary to make Captcha manually for proceeding
        Cookies.Accept_Cookies();
        Home.Open_Login();
        Login.Complete_Login();
        LoginAsserts.Validate_Error_Message();
        driver.quit();
}



}

