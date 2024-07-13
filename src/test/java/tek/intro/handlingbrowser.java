package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class handlingbrowser {
    public static void main(String[] args) {
        // open browser chrome browser
        ChromeDriver driver = new ChromeDriver();

        //navigate to a url
        driver.get("https://google.com");

    }
}
