package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://WWW.bbc.com");

        By anchortaglocator = By.tagName("a");
        List<WebElement> anchorelements = driver.findElements(anchortaglocator);
        System.out.println(anchorelements.size());
    }
}
