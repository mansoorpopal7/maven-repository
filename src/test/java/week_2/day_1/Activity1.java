package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        By signinlocator = By.id("signinLink");
        WebElement signinelement = driver.findElement(signinlocator);
        signinelement.click();

        By emailinputlocator = By.id("email");
        WebElement emailinputelement = driver.findElement(emailinputlocator);
        emailinputelement.sendKeys("mnsrpopal1@gmail.com");

        By passwordlocator = By.id("password");
        WebElement passwordelement = driver.findElement(passwordlocator);
        passwordelement.sendKeys("password123");

        By loginbtnlocator = By.id("loginBtn");
        WebElement loginbtnelement = driver.findElement(loginbtnlocator);
        loginbtnelement.click();


    }
}
