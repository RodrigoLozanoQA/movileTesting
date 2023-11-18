package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CalculatorXpathRestaTest {
    AppiumDriver mobile;

    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability("deviceName","TECNO CAMON 18");
        config.setCapability("platformVersion","12.0");
        config.setCapability("appPackage","com.example.listadespegable");
        config.setCapability("appActivity","com.example.listadespegable.MainActivity");
        config.setCapability("platformName","Android");
        config.setCapability("automationName","UiAutomator2");
        mobile = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),config);
        // implicit / explicit / fluent
        mobile.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void verifyAddTwoNumber() throws InterruptedException {
        //BUSCAR LOCALIZADORES O CONSTRUIRLOS
        // campo de llenado 4
        mobile.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.example.listadespegable:id/et1\"]")).sendKeys("4");
        // selector -
        mobile.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"sumar\"]")).click();
        mobile.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"restar\"]")).click();
        // campo de llenado 2
        mobile.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.example.listadespegable:id/et2\"]")).sendKeys("2");
        // Button
        mobile.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.example.listadespegable:id/button\"]")).click();

        Thread.sleep(5000);
        // verificacion  expected vs actual
        String expectedResult = "2";
        String actualResult =  mobile.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.listadespegable:id/tv1\"]")).getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta");
    }

    @AfterEach
    public void closeApp(){
        mobile.quit();
    }
}