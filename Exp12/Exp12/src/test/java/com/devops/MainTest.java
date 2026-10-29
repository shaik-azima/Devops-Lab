
package com.devops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void testHomePageLoads() {
        driver.get(
            "http://localhost:8080"
        );

        assertTrue(driver.getTitle().length() > 0);
        System.out.println("Homepage test passed");
    }

    @Test
    public void testIncrementButtonExists() {
        driver.get(
            "http://localhost:8080"
        );

        assertTrue(
            driver.findElements(By.tagName("button")).size() > 0
        );

        System.out.println("Button test passed");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
