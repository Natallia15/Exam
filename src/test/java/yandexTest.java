import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class yandexTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://yandex.ru");
            }

    @Test
    public void firstTest() throws InterruptedException {

        WebElement elektronicaElement = driver.findElement(By.xpath("(//div[@class='services-new__icon'])[5]"));
        elektronicaElement.click();
       //WebElement tvElement = driver.findElement(By.xpath("//a[@href='/catalog--elektronika/54440']"));
        //WebElement tvElement = driver.findElement(By.xpath("//span[contains(text(),\"Электроника\")]"));
        WebElement tvElement = driver.findElement(By.xpath("//div[@data-zone-name='category-link'][3]"));

        tvElement.click();

    }

}
