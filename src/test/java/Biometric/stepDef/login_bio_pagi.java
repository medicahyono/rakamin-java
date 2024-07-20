package Biometric.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class login_bio_pagi
{
    WebDriver driver; //
    String baseUrlGz="http://192.168.29.61/"; // gedung gizi
    String baseUrlB1="http://192.168.19.52/"; // gedung B
    String baseUrlC1="http://192.168.19.53/"; // gedung C1
    String baseUrlD1="http://192.168.29.57/"; // gedung D1
    String baseUrlE1="http://192.168.29.59/"; // gedung E1
    String baseUrlF1="http://192.168.29.60/"; // gedung F1
    String baseUrlF4="http://192.168.39.62/"; // gedung F4
    String baseUrlG1="http://192.168.39.63/"; // gedung G1
    String baseUrlR2="http://192.168.19.55/"; // gedung R2
    @Given("Halaman login biometrik Gz")
    public void halaman_login_biometrikGz()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(baseUrlGz);
    }

    @Given("Halaman login biometrik B1")
    public void halaman_login_biometrikB1()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(baseUrlB1);
    }

    @Given("Halaman login biometrik C1")
    public void halaman_login_biometrikC1()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(baseUrlC1);
    }

    @Given("Halaman login biometrik D1")
    public void halaman_login_biometrikD1()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(baseUrlD1);
    }

    @Given("Halaman login biometrik E1")
    public void halaman_login_biometrikE1()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(baseUrlE1);
    }

    @Given("Halaman login biometrik F1")
    public void halaman_login_biometrikF1()
    {
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(baseUrlF1);
    }

    @Given("Halaman login biometrik F4")
    public void halaman_login_biometrikF4()
    {
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(baseUrlF4);
    }

    @Given("Halaman login biometrik G1")
    public void halaman_login_biometrikG1()
    {
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(baseUrlG1);
    }

    @Given("Halaman login biometrik R2")
    public void halaman_login_biometrikR2()
    {
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(baseUrlR2);
    }

    @When("masukan username")

    public void inputUsername()
    {
        driver.findElement(By.name("username")).sendKeys("2");
    }

    @And("masukan password")
    public void inputPassword()
    {
        driver.findElement(By.name("userpwd")).sendKeys("2222");
    }

    @Then("User di halaman utama")
    public void userdihalamanutama()
    {
        driver.findElement(By.name("header"));
    }

    @And("klik login button")
    public void klik_login_button() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //driver.findElement(By.tagName("Login")).click();
        //driver.findElement(By.className("submit")).click();
    }

    @And("klik date time Gz")
    public void klik_date_timeGz()
    {
        driver.get("http://192.168.29.61/form/Device?act=3");
    }
    @And("klik date time B1")
    public void klik_date_timeB1()
    {
        driver.get("http://192.168.19.52/form/Device?act=3");
    }
    @And("klik date time C1")
    public void klik_date_timeC1()
    {
        driver.get("http://192.168.19.53/form/Device?act=3");
    }
    @And("klik date time D1")
    public void klik_date_timeD1()
    {
        driver.get("http://192.168.29.57/form/Device?act=3");
    }
    @And("klik date time E1")
    public void klik_date_timeE1()
    {
        driver.get("http://192.168.29.59/form/Device?act=3");
    }
    @And("klik date time F1")
    public void klik_date_timeF1()
    {
        driver.get("http://192.168.29.60/form/Device?act=3");
    }
    @And("klik date time F4")
    public void klik_date_timeF4()
    {
        driver.get("http://192.168.39.62/form/Device?act=3");
    }
    @And("klik date time G1")
    public void klik_date_timeG1()
    {
        driver.get("http://192.168.39.63/form/Device?act=3");
    }
    @And("klik date time R2")
    public void klik_date_timeR2()
    {
        driver.get("http://192.168.19.55/form/Device?act=3");
    }
    @And("klik jam manual")
    public void klik_manual()
    {
        driver.findElement(By.xpath("//input[@name='Keep' and @value='0']")).click();
    }

    @And("klik jam auto")
    public void klik_auto()
    {
        driver.findElement(By.xpath("//input[@name='Keep' and @value='1']")).click();
    }

    @And("isi tgl sekarang")
    public void isitglsekarang()
    {
        DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        Date tgl=new Date();
        String tglsaiki= df.format(tgl);

        driver.findElement(By.name("datevalue")).sendKeys(tglsaiki);
    }

    @And("isi jam sekarang")
    public void isijamsekarang()
    {
        DateFormat df1= new SimpleDateFormat("HH:mm:ss");
        Date jam =new Date();
        String  jamsaiki = df1.format(jam);
        driver.findElement(By.name("timevalue")).sendKeys(jamsaiki);
    }

    @And("isi jam pagi")
    public void isijampagi()
    {
        driver.findElement(By.name("timevalue")).sendKeys("07:15:02");
    }

    @And("isi jam pagimin1")
    public void isijampagimin1()
    {
       // DateFormat df1= new SimpleDateFormat("HH:mm:ss");
        Date jam =new Date();
        int jamm    = jam.getHours();
        int menit   = jam.getMinutes();
        int detik   = jam.getSeconds();

        int format= jamm-1;

        String formatjam    = Integer.toString(format);
        String formatmenit  = Integer.toString(menit);
        String formatdetik  = Integer.toString(detik);
        String gabungan     = formatjam+":"+menit+":"+detik;

        //System.out.println(gabungan);
        driver.findElement(By.name("timevalue")).sendKeys(gabungan);
    }
    @And("isi jam siangplus1")
    public void isijamsiangplus1()
    {
        // DateFormat df1= new SimpleDateFormat("HH:mm:ss");
        Date jam =new Date();
        int jamm    = jam.getHours();
        int menit   = jam.getMinutes();
        int detik   = jam.getSeconds();

        int format= jamm+1;

        String formatjam    = Integer.toString(format);
        String formatmenit  = Integer.toString(menit);
        String formatdetik  = Integer.toString(detik);
        String gabungan     = formatjam+":"+menit+":"+detik;

        //System.out.println(gabungan);
        driver.findElement(By.name("timevalue")).sendKeys(gabungan);
    }

    @And("isi jam siang")
    public void isijam2()
    {
        driver.findElement(By.name("timevalue")).sendKeys("14:15:31");
    }


    @And("klik OK")
    public void klik_OK()
    {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @And("klik OK-popup")
    public void klik_OKpopup()
    {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Alert oke= driver.switchTo().alert();
        oke.accept();
    }


    @And("klik reboot Gz")
    public void klik_rebootGz()
    {
        driver.get("http://192.168.29.61/form/Device");
    }

    @And("klik reboot B1")
    public void klik_rebootB1()
    {
        driver.get("http://192.168.19.52/form/Device");
    }

    @And("klik reboot C1")
    public void klik_rebootC1()
    {
        driver.get("http://192.168.19.53/form/Device");
    }

    @And("klik reboot D1")
    public void klik_rebootD1()
    {
        driver.get("http://192.168.29.57/form/Device");
    }

    @And("klik reboot E1")
    public void klik_rebootE1()
    {
        driver.get("http://192.168.29.59/form/Device");
    }

    @And("klik reboot F1")
    public void klik_rebootF1()
    {
        driver.get("http://192.168.29.60/form/Device");
    }

    @And("klik reboot F4")
    public void klik_rebootF4()
    {
        driver.get("http://192.168.39.62/form/Device");
    }

    @And("klik reboot G1")
    public void klik_rebootG1()
    {
        driver.get("http://192.168.39.63/form/Device");
    }

    @And("klik reboot R2")
    public void klik_rebootR2()
    {
        driver.get("http://192.168.19.55/form/Device");
    }

    @And("close browser")
    public void close_browser()
    {
        driver.close();
    }

    //@And("Input Invalid password")
    //public void inputInvalidPassword()
    //{
    //    driver.findElement(By.id("password")).sendKeys("tdd-seleniumokk");
    //}

    //@Then("User get error message")
    //public void userGetErrorMessage()
    //{
     //   driver.findElement(By.className("error-button")).sendKeys("Epic sadface: Username and password do not match any user in this service");
        //driver.close();
    //}

    //@When("Input Invalid username")
    //public void inputInvalidUsername()
    //{
    //    driver.findElement(By.id("user-name")).sendKeys("aaaaaaaa");
    //}
}
