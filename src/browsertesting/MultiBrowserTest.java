package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;
    public static void main(String[] args) {
       if(browser.equalsIgnoreCase("Chrome")){
           driver = new ChromeDriver();
       } else if (browser.equalsIgnoreCase("FireFox")) {
           driver = new FirefoxDriver();
       } else if (browser.equalsIgnoreCase("Edge")) {
           driver = new EdgeDriver();
       }else {
           System.out.println("Wrong Browser name");
       }
       driver.get(baseUrl);
       driver.manage().window().fullscreen();
       driver.close();
    }
}
