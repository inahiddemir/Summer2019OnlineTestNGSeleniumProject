package utils;

public class BrowserUtils {


    //It will be used to pause our test execution
    //just provide number of seconds as a parameter
    public static void wait(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
/*
    //BrowserUtils -- class that has reusable methods for writing scripts.
    //You cannot call driver after quit(), otherwise you will get an Exception:
    //Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
    //create a webdriver object, to work with a browser
    WebDriver driver = BrowserFactory.getDriver("chrome");
    //to maximize browser window
        driver.manage().

    window().

    maximize();
        driver.get("http://google.com");
    //wait for 3 seconds
    //this is out custom method
    //since method is static, we use class name to call the method
    //as a parameter, we provide number of seconds(time in seconds)
        BrowserUtils.wait(3);
    ///HOW TO PRINT PAGE TITLE??
        System.out.println(driver.getTitle());
        driver.navigate().

    to("http://amazon.com");
    //navigate back to google (previous URL)
        driver.navigate().

    back();
    //move forward to the amazon again
        driver.navigate().

    forward();
    //to refresh/reload a webpage/website
        driver.navigate().

    refresh();
    //shutdown browser
        driver.quit();
    //if tab only one, close() will shutdown browser
    //and we cannot use driver any more
    //so we have to recreate an object of WebDriver
    //what will happened, if I will call driver again
    //after quit()?
        driver.get("http://google.com");
 */
    }
}