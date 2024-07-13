package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.quit();
    }
}
