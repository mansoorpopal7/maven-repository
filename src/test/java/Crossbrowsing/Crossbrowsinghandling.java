package Crossbrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowsinghandling {
    public static void main(String[] args) {
        String browsertype = "firefox";
        WebDriver driver;

        if(browsertype.equals("chrome")) {
           driver = new ChromeDriver();
        } else if (browsertype.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browsertype.equals("edge")) {
            driver = new EdgeDriver();
        }else {
            throw new RuntimeException("wrong driver");
        }
        driver.get("https://google.com");
    }
}
