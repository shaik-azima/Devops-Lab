
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Main {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void testIncrementButton() {
        driver.get("file:///Users/shaikazima/Desktop/Devops-Lab/Exp11/program.html");

        driver.findElement(By.id("increment-button")).click();

        String result = driver.findElement(By.id("output")).getText();

        assertEquals("1", result);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
