import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.avito.ru/ufa/odezhda_obuv_aksessuary/botinki_-lofery_2237714734");
        WebElement input = driver.findElement(By.xpath("//*[@id='price-value']/span/span[1]"));
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String par = input.getAttribute("innerText");
        System.out.println(par);
        driver.close();
//        input.click();//нажать на область
//        input.sendKeys("КБК фиксированного платежа ", Keys.ENTER);//ввести в поиск ...
//        input = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3"));
//        input.click();

//        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//        try {
//            driver.get("http://www.google.com");
//            Thread.sleep(2000);
//
//            String window1 = driver.getWindowHandle();
//
//            js.executeScript("window.open()");
//
//            Set<String> currentWindows = driver.getWindowHandles();
//
//            String window2 = null;
//
//            for (String window : currentWindows) {
//                if (!window.equals(window1)) {
//                    window2 = window;
//                    break;
//                }
//            }
//            driver.switchTo().window(window2);
//            driver.get("http://www.vk.com");
//            driver.switchTo().window(window1);
//            driver.close();
//            //driver.switchTo().window(window1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } //finally {
//            //driver.quit();
//        //}
    }
}
