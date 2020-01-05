package tests.day1;

import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class day1_continue {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://google.com");

        // to read page title, there is method  .getTitle();

        // Test1. Verify that title of the page is a "Google"
        String actualResult = driver.getTitle();
        String expectedResult = "Google";

        if(actualResult.equals(expectedResult)){
            System.out.println("Test pass");
        }else{
            System.out.println("Test Failed");
        }
        // in terms of testing the problem of "equalsIgnoreCase" is test must verify the exact same result
        // that you want. Wrong spelling is also BUG!

        //to close driver
        // at the end of test execution close the browser
        // if you open a gate, you need to close it back!
        driver.close();
    }
}
