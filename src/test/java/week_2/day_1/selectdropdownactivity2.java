package week_2.day_1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class selectdropdownactivity2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        WebElement element = driver.findElement(By.id("languageSelect"));
        Select selectprogramming = new Select(element);
        selectprogramming.selectByValue("Pashto");
    }
}
