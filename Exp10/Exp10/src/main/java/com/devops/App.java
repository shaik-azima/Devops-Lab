
package com.devops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("Page Title: " + driver.getTitle());

        Thread.sleep(10000); // Keep Chrome open for 10 seconds

        driver.quit();
    }
}
