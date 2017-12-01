package com;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.URL;

public class AlarmTest {

    private static WindowsDriver driver = null;

    @BeforeClass
    public void init(){
        try {
            // Launch the Alarms & Clock app
            DesiredCapabilities appCapabilities = new DesiredCapabilities();
            appCapabilities.setCapability("app", "Microsoft.WindowsAlarms_8wekyb3d8bbwe!App");
            driver = new WindowsDriver<WindowsElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
            System.out.println("Successfully created session ........... ");
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    @AfterClass
    public static void TearDown() throws InterruptedException {
        //Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void testWorldClock() throws InterruptedException {
        //Toggle alarm
        driver.findElementByName("Alarm").click();
        driver.findElement(By.name("Alarm On Off toggle button")).click();

        //Add a world clock
        driver.findElement(By.name("World Clock")).click();
        driver.findElement(By.name("Add new clock")).click();
        driver.findElement(By.name("Enter a location")).sendKeys("Mexico City, Mexico");
        driver.findElementByName("Search").click();
        Thread.sleep(3000);

        //Right click and delete added clock
        Actions action= new Actions(driver);
        WebElement mexico = driver.findElementByAccessibilityId("WorldClockItemGrid");
        action.contextClick(mexico).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();

        Thread.sleep(2000);
        driver.findElementByName("Alarm").click();
    }



}


