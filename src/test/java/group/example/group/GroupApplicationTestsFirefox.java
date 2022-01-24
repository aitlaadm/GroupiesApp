package group.example.group;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.lang.Thread;
import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GroupApplicationTestsFirefox {
    static WebDriver driver;

    @BeforeClass
    public static void setupWebDriver(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Abdo\\Desktop\\GroupiesApp\\Grid\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Before
    public void get(){
        driver.get("http://localhost:3000/");
    }
    @Test
    void testUser(){


        driver.findElement(By.cssSelector("input")).sendKeys("TestUser");
        driver.findElement(By.cssSelector("button")).click();

    }
    @Test
    void testAdmin() {

        driver.findElement(By.cssSelector("input")).sendKeys("admin");
        driver.findElement(By.cssSelector("button")).click();
    }

    @Test
    public void testEmpty() {

        driver.findElement(By.cssSelector("input")).sendKeys("");
        driver.findElement(By.cssSelector("button")).click();
    }
    @After
    public void close(){
        if(driver!=null)
            driver.quit();
    }
}
