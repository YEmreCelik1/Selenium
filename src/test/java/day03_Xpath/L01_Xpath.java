package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L01_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin 2- Add Element butonuna basin
        3Delete butonu’nun gorunur oldugunu test edin
        4Delete tusuna basin
        5“Add/Remove Elements” yazisinin gorunur oldugunu test edin
         */

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // Add Element butonuna basin
       // WebElement addButton =  driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        WebElement addButton =  driver.findElement(By.xpath("//*[text()='Add Element']"));//xpath kullaniminda locate edecegimiz
        addButton.click();                                                      //webelement  text e sahipse yukaridaki sekilde kullanabiliriz.

        // Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if(deleteButonu.isDisplayed()){ //bir webelementini  gorunur olup olmadigini isDisplayed() methodu ile bakariz.
            System.out.println("Test button Delete is passed");
        }else System.out.println("Test button Delete is not passed");
        // Delete tusuna basin
        deleteButonu.click();
        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElementYazisi = driver.findElement(By.xpath("//h3"));
        if (addRemoveElementYazisi.isDisplayed()){
            System.out.println("Test addRemoveElementYazisi is passed");
        }else System.out.println("Test addRemoveElementYazisi is not passed");


    }
}
