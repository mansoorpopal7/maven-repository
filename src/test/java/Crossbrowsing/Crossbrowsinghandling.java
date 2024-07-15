package Crossbrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Crossbrowsinghandling {
    public static void main(String[] args) {
        String browsertype;
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose browser: chrome, firefox, edge");
         browsertype = scanner.next();
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
