package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L05_ClassWork2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Bu method sayfadaki her bir web element icin max bekleme suresini belirler.
                                                            //her web elementinin yuklenmesi icin 15 saniye siniri veriyoruz.
                                                            //Burada herseferinde 15 saniye beklemiyor.Eger web element yuklendiyse sorun yok
                                                            //yuklenmezse 15 saniye bekler ve sonra yine yuklenmezse Failed olur.

        /*
        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
yazdirin.
https://www.walmart.com/ sayfasina gidin.
Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
Tekrar “facebook” sayfasina donun
Sayfayi yenileyin
Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
         */
        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginda (title) “facebook”
        //varsa dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("Facebook")){
            System.out.println("Title de la page: PASSED");
        }else{
            System.out.println("Title de la page: FAILED "+actualTitle);
        }
        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualURL = driver.getCurrentUrl();
        if(actualURL.contains("facebook")){
            System.out.println("Test URL Passed");
        }else System.out.println("Test URL FAILED: "+ actualURL);

        //https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualTitleWallmart = driver.getTitle();
        String expectedTitleWallmart="Walmart.com";
        if (actualTitleWallmart.contains(expectedTitleWallmart)){
            System.out.println("Test title2 de la page PASSED");
        }else System.out.println("Test title2 de la page FAILED");

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        // 9.Browser’i kapatin
        driver.close();


    }
}
