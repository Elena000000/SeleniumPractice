package com.example.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
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
    public void goToHomePage(){

        driver = new ChromeDriver();

        driver.get("http://tutorialsninja.com/demo/index.php?route=product/product&path=57&product_id=49");
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click();
       // driver.close();
    }
    @Test
    public void goToRegister(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\elena\\IdeaProjects\\SeleniumPractice\\src\\test\\resources\\chromedriver.exe");


        driver.get("http://tutorialsninja.com/demo/index.php?route=product/product&path=57&product_id=49");
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
       // driver.close();
    }

}
