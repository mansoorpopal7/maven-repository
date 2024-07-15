package tek.intro;


import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // to maximize the browser
        driver.get("https://facebook.com");

       // driver.quit();
       String title = driver.getTitle();
        System.out.println(title);
    }
}
