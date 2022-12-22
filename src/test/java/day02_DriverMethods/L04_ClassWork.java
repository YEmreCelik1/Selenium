package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class L04_ClassWork {
    public static void main(String[] args) {

        /*
        a.web sayfasına gidin. https://www.amazon.com/
Search(ara) “city bike”
Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
         */
        System.setProperty("wedriver.chrome.driver","src/Resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println("Arama Sonuc Yazisi: "+aramaSonucYazisi.get(0).getText());

        //Arama sonuc sayisini yazdiralim
        String [] sonucSayisi= aramaSonucYazisi.get(0).getText().split(" ");
        System.out.println("Sonuc Sayisi: "+sonucSayisi[2]);

        //Sonuc sayisini Lambda ile yapalim
        Arrays.stream(aramaSonucYazisi.get(0).getText().split(" ")).limit(3).skip(2).forEach(t-> System.out.println("Sonuc Sayisi: "+ t));

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> ilkWebElement = driver.findElements(By.className("s-image"));
        ilkWebElement.get(0).click();
















    }
}
