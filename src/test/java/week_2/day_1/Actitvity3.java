package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitvity3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

         By signinlocator = By.id("signinLink");
        WebElement signinelement = driver.findElement(signinlocator);
        signinelement.click();

        By createlocator = By.id("newAccountBtn");
        WebElement createlement = driver.findElement(createlocator);
        createlement.click();

         By namelocator = By.name("name");
         WebElement nameelement = driver.findElement(namelocator);
         nameelement.sendKeys("mansoor popal");

         By emaillocator = By.name("email");
         WebElement emailelement = driver.findElement(emaillocator);
         emailelement.sendKeys("mansoorpopal1@gmail.com");

         By password = By.name("password");
         WebElement passwordelement = driver.findElement(password);
         passwordelement.sendKeys("passtwo123");

         By confirmpass = By.id("confirmPasswordInput");
         WebElement passelement = driver.findElement(confirmpass);
         passelement.sendKeys("passtwo123");

         By signupbtn = By.id("signupBtn");
         WebElement signupbtnelement = driver.findElement(signupbtn);
         signupbtnelement.click();

    }
}
