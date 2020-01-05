package tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        //IF the WebDriverManager or ChromeDriver looks "red" that means you have to import it first!
        // You can import it with click the mouse on them then "Alt + Enter". (Option + Enter on mac)

        //To maximize browser
        driver.manage().window().maximize();

        //To open "google.com"
        driver.get("http://google.com");

        //we want to navigate through different page
        // url can be passed as an object ro as a string - we use string
       driver.navigate().to("http://amazon.com");

        // IF I want to add some wait time in (miliseconds)
        //Thread.sleep(3000);

        //IF I want to come back to the previous page
        driver.navigate().back();

        //IF I want to know URL of current website
        String url = driver.getCurrentUrl();   //this method returns url as a string
        System.out.println(url);

        //selenium cannot close browser automatically so we have to use method "close()"
        driver.close();



    }
}
