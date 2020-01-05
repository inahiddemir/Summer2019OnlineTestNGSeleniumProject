package tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
///*
//       //////*/ IF YOU HAVE ISSUES WITH THE PROJECT ALTERNATIVE WAY IS HERE  //////*/*/
//
//        IF you have issues with your project, clone Vasyl's project
//
//        https://github.com/CybertekSchool/
//        Summer20190nlinE
// */
public class DifferenceBetweenQuitAndClose {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(4000);  // will pause execution for 4 secs
        /*
        sleep method need to throws checked exception. Otherwise you will have a compilation error.
        At this point, just add "throws InterruptedException" in the method signature.
         */
       // driver.close(); // close only the current tab
       // driver.quit(); // close the window


    }
}
