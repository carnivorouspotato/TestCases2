package DriverWrapper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Web {

    private static WebDriver driver;


    @BeforeMethod
    public void initDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("Chrome.switch", Arrays.asList("--incognito"));
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver");
        driver = new ChromeDriver(capabilities);
        driver.get("https://clubs3qa1.scholastic.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }



}
