package tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class MyFirstSeleniumScript {
    public static void main(String[] args) {
        // we have to setup web driver based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();
        //we need to create an object of appropriate class
        ChromeDriver driver = new ChromeDriver();
        //lets open google.com
        //.get() method allows to open some website
        driver.get("http://google.com");
        //to close
        driver.close();

    }
}
