package cucumber.stepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Login
{
    WebDriver driver; //
    String baseUrl="https://kasirdemo.belajarqa.com/";

    @Given("Halaman login kasir aja")
    public void halaman_login_kasir_aja()
    {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);

        driver.findElement(By.id("email")).sendKeys("tokomedic@gmail.com");
        driver.findElement(By.id("password")).sendKeys("tokomedic");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Assertion
        String loginPageAssert = driver.findElement(By.xpath("//h2[contains(text(),'hai, kasirAja')]")).getText();
        Assert.assertEquals(loginPageAssert, "hai, kasirAja");
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

    @And("Click login button")
    public void clickLoginButton()
    {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("User in on dashboard page")
    public void userInOnDashboardPage()
    {
        driver.findElement(By.xpath("//div[contains(text(),'dashboard')]"));
        String username= driver.findElement(By.xpath("//dd[contains(text(),'hai')]/preceding-sibling::dt")).getText();
        Assert.assertEquals(username,"tokomedic@gmail.com");
        driver.close();
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
