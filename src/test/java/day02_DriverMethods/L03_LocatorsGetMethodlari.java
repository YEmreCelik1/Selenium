package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L03_LocatorsGetMethodlari {
    public static void main(String[] args) {

        System.setProperty("wedriver.chrome.driver","src/Resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasina gidelim
        //Search bolumunu locate edip, iphone aratalim
        //Arama sonuc yazisini konsola yazdiralim
        //Sayfayi kapatalim

        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");
        //Search bolumunu locate edip, iphone aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //Arama sonuc yazisinda iphone yazisini locate edip konsola yazdiralim
        WebElement aramaSonucYazisi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.getText());
        //Sayfayi kapatalim
        driver.close();


















    }
}
