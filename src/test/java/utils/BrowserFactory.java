package utils;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    //we gonna create a method
    //that will return a web driver object
    // this method will take one parameter - String browser
    //based on the value of browser parameter
    //method will return corresponded webdriver object
    //if browser = chrome, then return chromedriver object

    public static WebDriver getDriver(String browser){
        if(browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else {
            return null;
        }
        }




}
