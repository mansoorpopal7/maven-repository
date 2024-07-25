package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Synchroniazationactivity {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("signinLink"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")))
                .sendKeys("mnsrpopal1@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")))
                .sendKeys("Kbl00135!");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Account"))).click();
       WebElement phoneelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("PhoneNumber")));
       phoneelement.clear();
       phoneelement.sendKeys("7252547882");
       wait.until(ExpectedConditions.elementToBeClickable(By.id("personalUpdateBtn"))).click();
      boolean isToastedDisplayes =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Toastify")))
              .isDisplayed();
      if(isToastedDisplayes) {
          System.out.println("test passed toast displayed");
      }else {
          System.out.println("test failed");
      }



    }
}
