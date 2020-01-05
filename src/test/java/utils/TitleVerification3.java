package utils;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("https://lulugandgeorgia.com", "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");
        WebDriver driver = BrowserFactory.getDriver("chrome");
        WebDriver driver1 = BrowserFactory.getDriver("chrome");
        WebDriver driver2 = BrowserFactory.getDriver("chrome");
        WebDriver driver3 = BrowserFactory.getDriver("chrome");

        driver.get(urls.get(0));
        String title0 = driver.getTitle();
        title0 = title0.toLowerCase();
        title0 = title0.trim();
        String url0 = driver.getCurrentUrl();

        if(url0.contains(title0)){
            System.out.println("Test case number 0 passed successfully.");
        }else{
            System.out.println("Something went wrong with test case number 0, check your selenium code then talk with the developer!");
            System.out.println(url0+" == "+title0);
        }
        driver.close();


        driver1.get(urls.get(1));
        String title1 = driver1.getTitle();
        title1 = title1.toLowerCase();
        title1 = title1.trim();
        String url1 = driver1.getCurrentUrl();

        if(url1.contains(title1)){
            System.out.println("Test case number 1 passed successfully.");
        }else{
            System.out.println("Something went wrong with test case number 1, check your selenium code then talk with the developer!");
            System.out.println(url1+" == "+title1);
        }
        driver1.close();

        driver2.get(urls.get(2));
        String title2 = driver2.getTitle();
        title2 = title2.toLowerCase();
        title2 = title2.trim();
        String url2 = driver2.getCurrentUrl();

        if(url2.contains(title2)){
            System.out.println("Test case number 2 passed successfully.");
        }else{
            System.out.println("Something went wrong with test case number 2, check your selenium code then talk with the developer!");
            System.out.println(url2+" == "+title2);
        }
        driver2.close();

        driver3.get(urls.get(3));
        String title3 = driver3.getTitle();
        title3 = title3.toLowerCase();
        title3 = title3.trim();
        String url3 = driver3.getCurrentUrl();

        if(url3.contains(title3)){
            System.out.println("Test case number 3 passed successfully.");
        }else{
            System.out.println("Something went wrong with test case number 3, check your selenium code then talk with the developer!");
            System.out.println(url3+" == "+title3);
        }
        driver3.close();

    }
}
