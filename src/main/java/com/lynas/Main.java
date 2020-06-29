package com.lynas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
//        chromeOptions.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("http://localhost:6060/app");

        WebElement addToCart = driver.findElement(By.id("button-add"));
        addToCart.click();
        WebElement checkoutButton = driver.findElement(By.id("btn-header-cart"));
        checkoutButton.click();
        WebElement paymentMethod = driver.findElement(By.name("paymentMethod"));
        paymentMethod.click();
        WebElement selectedCard = driver.findElement(By.name("selectedCard"));
        selectedCard.click();
        WebElement submitButton = driver.findElement(By.id("body--cart_pay--btn"));
        submitButton.click();

    }
}
