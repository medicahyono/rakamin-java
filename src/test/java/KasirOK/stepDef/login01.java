package KasirOK.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class login01
{
    WebDriver driver; //
    String baseUrl="https://kasirdemo.belajarqa.com/";
    @Given("Halaman login kasir aja")
    public void halaman_login_kasir_aja() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @When("Input username")

    public void inputUsername()
    {
        driver.findElement(By.id("email")).sendKeys("tokomedic@gmail.com");
    }

    @And("Input password")
    public void inputPassword()
    {
        driver.findElement(By.id("password")).sendKeys("tokomedic");
    }


    @Then("User in on dashboard page")
    public void userInOnDashboardPage()
    {
        driver.findElement(By.xpath("//div[contains(text(),'dashboard')]"));
        String username= driver.findElement(By.xpath("//dd[contains(text(),'hai')]/preceding-sibling::dt")).getText();
        Assert.assertEquals(username,"TOKO MEDIC");
        driver.close();
    }

    @And("Click login button")
    public void click_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @And("Input Invalid password")
    public void inputInvalidPassword()
    {
        driver.findElement(By.id("password")).sendKeys("tdd-seleniumokk");
    }

    @Then("User get error message")
    public void userGetErrorMessage()
    {
        String errorlogin = driver.findElement(By.xpath("//div[@role='alert']")).getText();
        Assert.assertEquals(errorlogin, "Kredensial anda salah");
        driver.close();
    }
}