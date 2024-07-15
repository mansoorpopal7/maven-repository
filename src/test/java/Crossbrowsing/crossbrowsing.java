package Crossbrowsing;

import org.openqa.selenium.firefox.FirefoxDriver;

public class crossbrowsing {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://Firefox.com");

        String title = driver.getTitle();

        System.out.println(title);

        driver.quit();
    }
}
