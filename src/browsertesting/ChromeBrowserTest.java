package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current URL:" + driver.getCurrentUrl());
        System.out.println("Page source: "+ driver.getPageSource());
        WebElement usernameFIeld = driver.findElement(By.name("user-name"));
        usernameFIeld.sendKeys("Sitaram");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("sitaram123");
        driver.close();
    }

}
