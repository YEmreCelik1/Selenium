package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //ilk olarak islm yapacagimiz sayfanin adrresini gireriz get() ile
        driver.get("https://amazon.com");
        //sayfanin basligini getirme
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //icinde olunan sayfanin url ini almak icin
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //icinde olunan sayfanin kaynak kodlarini getirmek icin
        //System.out.println("driver.getPageSource() = " + driver.getPageSource());

        //Bize o windowa ait hash degerini veriri. Biz bu hash degerini bir String e atayip
        // pencereler arasin gecis yapabiliriz.
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());//Bize verecegi hash kod ile diger pencerelere gecis yapiyoruz
    }
}
