package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class labsesisionweek2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.name("email")).sendKeys("mnsrpopal1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Kbl00135!");
        driver.findElement(By.id("loginBtn")).click();
        driver.findElement(By.id("accountLink")).click();
        driver.findElement(By.id("phoneNumber")).sendKeys("7252198700");
        driver.findElement(By.id("personalUpdateBtn")).click();
        driver.quit();

    }
}
