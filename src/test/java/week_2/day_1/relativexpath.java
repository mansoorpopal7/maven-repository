package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        By element = By.xpath("//img[@id = 'heroImage']");
        WebElement element1 = driver.findElement(element);
        element1.click();
    }
}
