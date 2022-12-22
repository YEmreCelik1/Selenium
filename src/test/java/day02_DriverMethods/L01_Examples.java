package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L01_Examples {
    static WebDriver driver;
    public static void main(String[] args) {
        /*
        Ilk once browser i maximiza yapalim.Sonra tum Sayfa icin max bekleme suresi olarak 15 sn belirtelim
        Sirasiyla amazon.com, facebook.com ve youtube.com sayfalarina gidelim.
        Amazon sayfasina tekrar donelim.
        Amazon sayfasinin URL inin https://www.amazon.com adresine esit oldugunu test edelim
        Sayfanin konumunu ve size ini yazdiralim
        sayfanin konumunu ve size ini istedigimiz sekilde ayarlayalim
        Ve istedigimiz sekilde oldugunu test edelim
        ve sayfayi kapatalim.
         */

        System.setProperty("webdriver.chrome.driver","src/Resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Ilk once browser i maximiza yapalim.Sonra tum Sayfa icin max bekleme suresi olarak 15 sn belirtelim
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Sirasiyla amazon.com, facebook.com ve youtube.com sayfalarina gidelim.
        driver.get("https://www.amazon.com/");
        driver.get("https://facebook.com");
        driver.get("https://youtube.com");

        // Amazon sayfasina tekrar donelim.
        driver.navigate().back();
        driver.navigate().back();

        // Amazon sayfasinin URL inin https://www.amazon.com/ adresine esit oldugunu test edelim
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/";
        if(actualURL.equals(expectedURL)){
            System.out.println("Test URL is PASSED");
        }else{
            System.out.println("TEST URL is FAILED");
        }

        // Sayfanin konumunu ve size ini yazdiralim
        System.out.println("size de la page: "+driver.manage().window().getSize());
        System.out.println("position de la page: "+ driver.manage().window().getPosition());

        // sayfanin konumunu ve size ini istedigimiz sekilde ayarlayalim
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("le nouveau size de la page: "+driver.manage().window().getSize());
        System.out.println("la nouvelle position de la page: "+ driver.manage().window().getPosition());

        // Ve istedigimiz sekilde oldugunu test edelim
        Dimension actualNewSize = driver.manage().window().getSize();
        if(actualNewSize.getWidth()==600 && actualNewSize.getHeight()==600){
            System.out.println("Test Size is PASSED");
        }else {
            System.out.println("Test Size is FAILED");
        }

        Point actualNewPosition = driver.manage().window().getPosition();
        if(actualNewPosition.getX()==50 && actualNewPosition.getY()==50){
            System.out.println("Test Position is PASSED");
        }else{
            System.out.println("Test Position is FAILED");
        }
        // ve sayfayi kapatalim.
        driver.close();




























    }
}
