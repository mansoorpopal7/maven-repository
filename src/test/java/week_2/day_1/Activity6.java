package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://WWW.bbc.com");

        By tagname = By.tagName("img");
        List<WebElement> tagelements = driver.findElements(tagname);
        System.out.println(tagelements.size());
    }
}
