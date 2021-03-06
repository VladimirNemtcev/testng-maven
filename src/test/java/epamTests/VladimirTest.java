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
        Thread.sleep(2000);

        WebElement enterButton = driver.findElement(By.xpath("//button"));
        enterButton.click();
        Thread.sleep(2000);

        WebElement supportLabel = driver.findElement(By.xpath("//*[@id='mCSB_1_container']/ul/li[3]/ul/li[1]/a/p/span"));
        supportLabel.click();
        Thread.sleep(2000);

        WebElement dropDownToggle = driver.findElement(By.xpath("//a[contains(@href, '#')]"));
        dropDownToggle.click();
        Thread.sleep(2000);

        WebElement logoutButton = driver.findElement(By.className("logout"));
        logoutButton.click();
        Thread.sleep(2000);

        boolean isLoggedOut = driver.findElement(By.className("fa-user")).isDisplayed();
        Assert.assertTrue(isLoggedOut);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Thread.sleep(2000);
        driver.close();

          }

      @Test(groups = {"part3"})
      public  void third() throws InterruptedException {

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
          Thread.sleep(2000);

          WebElement enterButton = driver.findElement(By.xpath("//button"));
          enterButton.click();
          Thread.sleep(2000);

          WebElement contactFormLabel = driver.findElement(By.xpath("//div[@id='mCSB_1_container']/ul/li[2]/a/span"));
          contactFormLabel.click();
          Thread.sleep(2000);



          WebElement contactFormName = driver.findElement(By.id("Name"));
          contactFormName.sendKeys("Vladimir");
          Thread.sleep(2000);

          WebElement contactFormLastName = driver.findElement(By.id("LastName"));
          contactFormLastName.sendKeys("Nemtcev");
          Thread.sleep(2000);

          WebElement contactFormDescription = driver.findElement(By.id("Description"));
          contactFormDescription.sendKeys("Hello World,Hello World,Hello World,Hello World");
          Thread.sleep(2000);

          WebElement webFormSubmitButton = driver.findElement(By.cssSelector("div.col-sm-12.text-right > button.uui-button.dark-blue"));
          webFormSubmitButton.click();
          Thread.sleep(2000);

          boolean isLoggedOut = driver.findElement(By.className("fa-user")).isDisplayed();
          Assert.assertTrue(isLoggedOut);
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

          Thread.sleep(2000);
          driver.close();

      }

    }

