package VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrackUserLogin {
    public static void main(String[] args) {

       WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://qa2.vytrack.com/user/login");

        WebElement userNameBox = driver.findElement(By.name("_username"));
        userNameBox.sendKeys("storemanager204");

        WebElement passwordBox = driver.findElement(By.name("_password"));
        passwordBox.sendKeys("UserUser123",Keys.ENTER);

        String validTitle = driver.getTitle();

        driver.close();

        if(validTitle.equals("Dashboard")){
            System.out.println("Test Passed Successfully");
        }else{
            System.out.println("FAILED!");
        }

    }
}
