package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://WWW.google.com");
        By namelocator = By.name("q");
        WebElement nameelement = driver.findElement(namelocator);
        nameelement.sendKeys("TekSchool");

        By namelocator1 = By.name("btnK");
        WebElement nameelement1 = driver.findElement(namelocator1);
        nameelement1.click();

        Thread.sleep(2000);

        By partlocator = By.partialLinkText("TEK SCHOOL Modern");
        WebElement partelement = driver.findElement( partlocator);
        partelement.click();
    }
}
