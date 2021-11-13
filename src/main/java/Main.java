import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']"));
        //найти неск. элементов
        //WebElement input = driver.findElements(By.xpath("//input[@aria-label='Найти']"));найти неск. эл.
        input.click();//нажать на область
        input.sendKeys("КБК фиксированного платежа ", Keys.ENTER);//ввести в поиск ...
        input = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3"));
        input.click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presense);

    }
}
