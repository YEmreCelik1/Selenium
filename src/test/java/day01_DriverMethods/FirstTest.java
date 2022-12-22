package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    /*bir web sitesinde manuel olarak yapabildigimiz herseyi selenium kullanarak da yapabiliriz.
Software Testing, expected result, actual result esit olupr olmadigini kontrol etme islemidir. Sonuc olarak, olmasi gereken seylerin olmadigini
veya olmamasi gereken seylerin oldugunu kontrol etmek ve ortaya cikartmak yazilim testinin amaci olmalidir.
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Resources/Drivers/chromedriver.exe");
        /*
        En temel haliyle otomasyon yapmak icin Class imiza otomasyon icin gerkli olan webdriver in yerini gostermemiz gerekir.Bunun icin
        java kutuphanesinden System.setProperty() methodunun icine ilk olarak driveri i yazariz.Ikinci olarak driveri in fiziki yolunu
        yazariz.
        Daha sonra Webdriver data type i olan bir object olusturup bu object ile otomasyonumuza baslamamiz gerekiyor. Ancak Webdriver bir
        interface dir ve bu nedenle ChromeDriver() constructor unu kullanarak object olusturuyoruz.
         */
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com"); //bu metodla, Strin url girerek (www yazamasak da olur) sayfaya gideriz
        driver.get("https://youtube.com");

        driver.close();
        //driver.quit(); coklu pencereler icin
    }
}
