import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Formatter;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.avito.ru/ufa/odezhda_obuv_aksessuary/botinki_-lofery_2237714734");
        WebElement name1 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div[5]/div[1]/div[1]/div/div[1]/h1/span"));
        String strname1 = name1.getAttribute("outerText");
//        WebElement cost1 = driver.findElement(By.xpath("//*[@id='price-value']/span/span[1]"));
//        String strcost1 = cost1.getAttribute("innerText");
//        WebElement about1 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[4]/div[1]/div[2]/div[4]/div/div/p"));
//        String strabout1 = about1.getAttribute("outerText");

//        driver.get("https://www.avito.ru/ufa/odezhda_obuv_aksessuary/botinki_zimnie_zhenskie_novye_2275253151");
//        WebElement name2 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div/div[1]/h1/span"));
//        String strname2 = name2.getAttribute("outerText");
//        WebElement cost2 = driver.findElement(By.xpath("//*[@id='price-value']/span/span[1]"));
//        String strcost2 = cost2.getAttribute("innerText");
//        WebElement about2 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[4]/div[1]/div[2]/div[4]/div/div/p"));
//        String strabout2 = about2.getAttribute("outerText");


        Formatter file = null;
        try {
            file = new Formatter("src/main/resources/avito.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        file.format(strname1 + " Цена: " + "\r\n" + "\r\n" + "\r\n");
//        file.format(strname1 + " Цена: " + strcost1 + "\r\n" + strabout1 + "\r\n" + "\r\n" + strname2 + " Цена: " + strcost2 + "\r\n" + strabout2);
        //file.format(strname2 + " Цена:" + strcost2);
        file.close();

//        try {
//            TimeUnit.SECONDS.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //driver.get("https://drive.google.com/file/d/1cC_MMw5FxT6ZvqVr-gMWCVTJxb5jy9t7/view?usp=sharing");
        driver.close();
        Desktop.getDesktop().open(new File("src/main/resources/avito.txt"));

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
