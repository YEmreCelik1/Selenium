package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L02_ClassWork {
    /*

//Amazon sayfasina gidelim. https://www.amazon.com/
//Sayfa basligini(title) yazdirin
//Sayfa basliginin “Amazon” icerdigini test edin
//Sayfa adresini(url) yazdirin
//Sayfa url’inin “amazon” icerdigini test edin.
//Sayfa handle degerini yazdirin
//Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
//Sayfayi kapatin.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Sayfa basligini(title) yazdirin
        System.out.println("Le titre de page: "+driver.getTitle());
        //Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("Amazon")){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title test FAILED");
        }

        //Sayfa adresini(url) yazdirin

        System.out.println("Sayfa url i:"+driver.getCurrentUrl());
        //Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("amazon")){
            System.out.println("URL Test est PASSED");
        }else {
            System.out.println("URL test est FAILED");
        }
        //Sayfa handle degerini yazdirin
        System.out.println("Window handle degeri: "+driver.getWindowHandle());
        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfaKodlari = driver.getPageSource();
        if(sayfaKodlari.contains("Gateway")){
            System.out.println("Source Code Test est passé");
        }else{
            System.out.println("Source Code Test est echec");
        }
        //Sayfayi kapatin.
        driver.close(); //sayfayi kapatmak icin kullaniyoruz.









    }
}
