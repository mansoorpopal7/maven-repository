package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

          By signinlocator = By.id("signinLink");
          WebElement signinelement = driver.findElement(signinlocator);
          signinelement.click();

          By emaillocator = By.name("email");
          WebElement emailelement = driver.findElement(emaillocator);
          emailelement.sendKeys("mansoor.popal1@gmail.com");

          By passwordlocator = By.name("password");
          WebElement passwordelement = driver.findElement(passwordlocator);
          passwordelement.sendKeys("password123");

          By loginbtnlocator = By.id("loginBtn");
          WebElement loginelement = driver.findElement(loginbtnlocator);
          loginelement.click();

          By errorlocator = By.className("error");
          WebElement errorelement = driver.findElement(errorlocator);
          String errortext = errorelement.getText();
        System.out.println("user and password is invalid");

    }
}
