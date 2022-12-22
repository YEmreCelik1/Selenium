package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class L04_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfayi simge durumuna getirin
        simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        Sayfayi fullscreen yapin
        Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        Sayfayi kapatin

         */
        System.setProperty("webdriver.chrome.driver","src/Resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutlari: "+driver.manage().window().getSize()); //pixel olarak sonuc veriyor
        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanin konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutlari: "+driver.manage().window().getSize());
        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutlari: "+driver.manage().window().getSize());
        //Sayfayi kapatin
        Thread.sleep(4000);
        driver.close();
    }
}
