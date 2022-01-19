import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class onlinerTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by");
            }

    @Test
    public void firstTest() throws InterruptedException {
        driver.get("https://www.onliner.by/");
        WebElement avtobaraholkaElement = driver.findElement(By.xpath("//ul[@class=\"b-main-navigation\"]/li[3]"));
        avtobaraholkaElement.click();
        Thread.sleep(3000);
        WebElement markaElement = driver.findElement(By.xpath("(//div[@class='input-style__real'])[4]"));
        markaElement.click();
        WebElement mersIcon = driver.findElement(By.xpath("//li[@title='Mercedes-Benz']"));
        mersIcon.click();
        Thread.sleep(3000);
        //List<WebElement> listMers = driver.findElements(By.xpath("//a[starts-with(@href,'/mercedes-benz')]"));
        List<WebElement> listMers = driver.findElements(By.xpath("//a[@class='vehicle-form__offers-unit']"));
        System.out.println(listMers.size());
        String s = listMers.get(3).getAttribute("href");
        System.out.println(s);
        listMers.get(3).click();

        Assert.assertEquals(driver.getCurrentUrl(), s);
    }

}
