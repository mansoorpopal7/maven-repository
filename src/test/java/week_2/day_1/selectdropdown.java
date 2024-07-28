package week_2.day_1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class selectdropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        Thread.sleep(2000);
        WebElement element =  driver.findElement(By.id("countrySelect"));
        Select selectpro = new Select(element);
        selectpro.selectByVisibleText("United States");

    }


    }

