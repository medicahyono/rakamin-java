import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertFalse;

public class Login
{
    @Test //method membuka browser saucedemo
    public  void open_browser()
    {
        WebDriver driver;
        String baseUrl  ="https://saucedemo.com/";

        WebDriverManager.chromedriver().setup();
        //ChromeOptions opt = new ChromeOptions();
        //opt.setHeadless(false);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String tittle = driver.getTitle();
        System.out.println(tittle);
        //driver.close();
    }


    @Test
    public  void getTittle()
    {
        WebDriver driver;
        String baseUrl  ="https://kasirdemo.belajarqa.com/";

        WebDriverManager.chromedriver().setup();
        //ChromeOptions opt = new ChromeOptions();
        //opt.setHeadless(false);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String tittle = driver.getTitle();
        System.out.println(tittle);
        driver.close();
    }

    @Test
    public  void getTittlewithElement()
    {
        WebDriver driver;
        String baseUrl  ="https://saucedemo.com/";

        WebDriverManager.chromedriver().setup();
        //ChromeOptions opt = new ChromeOptions();
        //opt.setHeadless(false);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String tittle = driver.getTitle();

        //driver.findElement(By.xpath("/*contains")).isDisplayed();
        //driver.findElement(By.cssSelector("#button")).isDisplayed();

        System.out.println("Anda masuk halaman "+tittle);

        //driver.close();
    }

    @Test //lOGIN DENGAN USERNAME PASSWORD VALID
    public void LoginValid()
    {
        WebDriver driver;
        String baseUrl  ="https://saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String tittle = driver.getTitle();
        //Cetak nama halaman
        System.out.println("Anda masuk halaman "+tittle);

        // Inputs standard_user in username field.
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // Inputs secret_sauce in password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // Clicks the Login button
        driver.findElement(By.id("login-button")).click();
        //driver.close();

        //print hasil jika berhasil
        //System.out.print();
    }

    @Test //lOGIN DENGAN USERNAME VALID PASSWORD NO VALID
    public void LoginUsernameValidPasNovalid()
    {
        WebDriver driver;
        String baseUrl  ="https://saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String tittle = driver.getTitle();
        //Cetak nama halaman
        System.out.println("Anda masuk halaman "+tittle);

        // Inputs standard_user in username field.
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // Inputs secret_sauce in password field
        driver.findElement(By.id("password")).sendKeys("123456");
        // Clicks the Login button
        driver.findElement(By.id("login-button")).click();
        //driver.close();

        //print hasil jika berhasil
        System.out.print(driver.findElement(By.className("className")));
    }
}