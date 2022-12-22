package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class L02_WebElementsAndLocators {
    /*
    Bir web elementi icin eger varsa once id attribut u  kullanilir.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasina gidelim
        //Search bolumunu locate edelim
        //Search bolumunde iphone arayalim

        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");

        //Search bolumunu locate edelim
        //WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement searchBox2 = driver.findElement(By.name("field-keywords"));


        //Search bolumunde iphone arayalim
        //searchBox.sendKeys("iphone", Keys.ENTER);
        searchBox2.sendKeys("iphone",Keys.ENTER);


        /*
        eger bir web elementi(web sayfasindaki herbir buton ya da text) locate(konumunu belirleme) etmek istersek,
        once manuel olarak web sayfasini acip sayfa uzerinde sag click yapip incele ye tiklariz. Karsimiza cikan html kodlarindan
        locater lardan(konum belirleyiciler) essiz olani seceriz genellikle id attribute u kullanilir. Sectigimiz attribute degerini
        findelement(By.id("attribute degeri")) seklinde yazariz.

         */

        //Amazon sayfasindaki <input> ve <a> tag larinin sayisini yazdiriniz

        List<WebElement> inputTags = driver.findElements(By.tagName("input"));
        System.out.println("input tag sayisi: "+inputTags.size());

        List<WebElement> linklerList = driver.findElements(By.tagName("a"));
        System.out.println("Link sayisi: "+linklerList.size());

        for (WebElement w : linklerList){
            System.out.println(w.getText()); //linkleri yazdirmak icin
        }


    }
}
