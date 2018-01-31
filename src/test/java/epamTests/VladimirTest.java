package epamTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


  public class VladimirTest {

        @Test(groups = {"part1"})
        public  void first() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:/Selenium/Tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(" https://epam.github.io/JDI/index.html");


        WebElement userIcon = driver.findElement(By.className("fa-user"));
        userIcon.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebElement loginField = driver.findElement(By.id("Login"));
        loginField.clear();
        loginField.sendKeys("epam");


        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.clear();
        passwordField.sendKeys("1234");
        Thread.sleep(2000);

        WebElement enterButton = driver.findElement(By.xpath("//button"));
        enterButton.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        boolean isLoggedIn = driver.findElement(By.className("logout")).isDisplayed();
        Assert.assertTrue(isLoggedIn);

        Thread.sleep(2000);

        WebElement logoutButton = driver.findElement(By.className("logout"));


        boolean isLoggedOut = driver.findElement(By.className("fa-user")).isDisplayed();
        Assert.assertTrue(isLoggedOut);

        logoutButton.click();

        Thread.sleep(2000);
        driver.close();

        }


        @Test(groups = {"part2"})
        public  void second() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:/Selenium/Tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(" https://epam.github.io/JDI/index.html");


        WebElement userIcon = driver.findElement(By.className("fa-user"));
        userIcon.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement loginField = driver.findElement(By.id("Login"));
        loginField.clear();
        loginField.sendKeys("epam");

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.clear();
        passwordField.sendKeys("1234");

        WebElement enterButton = driver.findElement(By.xpath("//button"));
        enterButton.click();

        Thread.sleep(2000);

        WebElement logoutButton = driver.findElement(By.className("logout"));

        logoutButton.click();

        Thread.sleep(2000);

        driver.close();

          }

    }

