package saucedemo.cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class login
{
    WebDriver driver;
    String baseUrl="https://kasirdemo.belajarqa.com/";
    @Given("Halaman login kasir aja")

    public void halaman_login_kasir_aja()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 60, TimeUnit.SECONDS);
        driver.get(baseUrl);

        //Assertion
        String loginPageAssert = driver.findElement(By.xpath("//h2[contains(text),'hai, kasir Aja')]")).getText();
        Assert.assertEquals(loginPageAssert, "hai, kasir Aja");
    }

    @When("Input username")
    public void inputUsername()
    {
        driver.findElement(By.id("email")).sendKeys("tdd-selenium@gmail.com");
    }

    @And("Input password")
    public void inputPassword()
    {
        driver.findElement(By.id("password")).sendKeys("tdd-selenium");

    }

    @And("Click login button")
    public void clickLoginButton() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("User in on dashboard page")
    public void userInOnDashboardPage()
    {
        driver.findElement(By.xpath("//div[contains(text(),'dashboard']"));
        String username= driver.findElement(By.xpath("//dd[contains(text),'hai')]/preceding-sibling::dt")).getText();
        Assert.assertEquals(username,"tdd-selenium");
    }
}
