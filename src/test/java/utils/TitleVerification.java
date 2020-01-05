package utils;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(0));
        String title1 = driver.getTitle();
        String url1 = driver.getCurrentUrl();
        url1 = url1.substring(0, 35);

        driver.get(urls.get(1));
        String title2 = driver.getTitle();
        String url2 = driver.getCurrentUrl();
        url2 = url2.substring(0, 35);

        driver.get(urls.get(2));
        String title3 = driver.getTitle();
        String url3 = driver.getCurrentUrl();
        url3 = url3.substring(0,35);
        driver.close();

        //String trueTitle = "http://practice.cybertekschool.com";

        if (title1.equals(title2) && title2.equals(title3)) {
            if(url1.equals(url2) && url2.equals(url3))
            System.out.println("Test passed successfully.");
        } else {
            System.out.println("Something went wrong, please report it to the developer!");
            System.out.println(title1);
            System.out.println(title2);
            System.out.println(title3);
        }

    }
}