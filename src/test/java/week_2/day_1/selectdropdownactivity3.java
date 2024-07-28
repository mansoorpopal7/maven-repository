package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class selectdropdownactivity3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        WebElement element = driver.findElement(By.id("languageSelect"));
        Select select = new Select(element);

        // it returns the last option using the size method.
        List<WebElement> options = select.getOptions();
        int size = options.size();
        select.selectByIndex(size - 1);



    }
}
