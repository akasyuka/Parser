import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']"));
        //WebElement input = driver.findElements(By.xpath("//input[@aria-label='Найти']"));
        //input.click();
        input.sendKeys("КБК фиксированного платежа ", Keys.ENTER);
    }
}
