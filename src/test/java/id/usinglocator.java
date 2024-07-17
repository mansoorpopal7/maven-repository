package id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usinglocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By searchInputlocator = By.id("searchInput");
        WebElement searchInputElement = driver.findElement(searchInputlocator);
        searchInputElement.sendKeys("TV");

          By searchbtnlocator = By.id("searchbtn");
          WebElement searchbtnElement = driver.findElement(searchbtnlocator);
          searchbtnElement.click();

    }
}
