package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#signinLink")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("mnsrpopal1@gmail.com");

        driver.findElement(By.cssSelector("input[name = 'password']")).sendKeys("Kbl00135!");

        driver.findElement(By.cssSelector("#loginBtn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#accountLink")).click();
       String text =  driver.findElement(By.cssSelector("div.account__information-detail > h1: last-child")).getText();
       System.out.println(text);
       driver.quit();


    }
}
