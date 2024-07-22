package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitvity7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        By element = By.xpath("//img[@alt = 'Video Games']");
        WebElement element1 = driver.findElement(element);
        element1.click();
        Thread.sleep(1000);

        By xy = By.xpath("//p[text() = 'PlayStation 5 Console']");
        WebElement mn = driver.findElement(xy);
        mn.click();
        Thread.sleep(1000);

        By xy1 = By.xpath("//button[@id = 'addToCartBtn']");
        WebElement mn1 = driver.findElement(xy1);
        mn1.click();
        Thread.sleep(1000);

    }
}
