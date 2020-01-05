package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class EnterTextPractice {
    public static void main(String[] args) {
        /*
        When you have opened an inspector tool in chrome, press ctrl+F button and you will see search box.
        That box stands for locator verification. you have enter your locater and hit enter. It will shoe you how many
        elements were found based on your locator. for id, put # to search specifially ids.
        Locator: its an address of element on the page. There are different locators, but goal is the same==> find elem.

        To enter the text we use - sendKeys("text") - method.
         */
        //grey text "browser" is not a value.
        //grey text "browser" is not a value
        //it's a placeholder/ or name of the method parameter
        //you dn't enter that
        //it comes up automatically
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement inputBox = driver.findElement(By.name("email"));
        //we enter the text
        inputBox.sendKeys("random@email.com");
        WebElement button = driver.findElement(By.id("form_submit"));
        //to click on the element
        button.click();
        BrowserUtils.wait(2);
        String expectedUrl = "http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        driver.close();



    }
}
