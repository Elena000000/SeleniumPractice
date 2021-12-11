package com.example.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    ChromeDriver driver;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\elena\\IdeaProjects\\SeleniumPractice\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void goToHomePageTest(){

        driver = new ChromeDriver();

        driver.get("http://tutorialsninja.com/demo/index.php?route=product/product&path=57&product_id=49");
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click();
       // driver.close();
    }
    @Test
    public void goToRegisterTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\elena\\IdeaProjects\\SeleniumPractice\\src\\test\\resources\\chromedriver.exe");


        driver.get("http://tutorialsninja.com/demo/index.php?route=product/product&path=57&product_id=49");
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
       // driver.close();
    }
 @Test
    public void inputValidDataOnFileTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\elena\\IdeaProjects\\SeleniumPractice\\src\\test\\resources\\chromedriver.exe");


        driver.get("http://tutorialsninja.com/demo/index.php?route=product/product&path=57&product_id=49");
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
        driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Elena");
        driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Truta");
        driver.findElement(By.cssSelector("#input-email")).sendKeys("elena.truta@gmail.com");
        driver.findElement(By.cssSelector("#input-telephone")).sendKeys("07214666655");
        driver.findElement(By.cssSelector("#input-password")).sendKeys("elena123");
        driver.findElement(By.cssSelector("#input-confirm")).sendKeys("elena123");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

       // driver.close();
    } @Test
    public void inputInvalidDataOnPasswordConfirmTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\elena\\IdeaProjects\\SeleniumPractice\\src\\test\\resources\\chromedriver.exe");


        driver.get("http://tutorialsninja.com/demo/index.php?route=product/product&path=57&product_id=49");
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
        driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Elena");
        driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Truta");
        driver.findElement(By.cssSelector("#input-email")).sendKeys("elena.truta@gmail.com");
        driver.findElement(By.cssSelector("#input-telephone")).sendKeys("07214666655");
        driver.findElement(By.cssSelector("#input-password")).sendKeys("elena123");
        driver.findElement(By.cssSelector("#input-confirm")).sendKeys("elena124");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
      String actualMessage = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div")).getText();
        Assert.assertEquals(actualMessage, "Password confirmation does not match password!");

       // driver.close();
    }

}
