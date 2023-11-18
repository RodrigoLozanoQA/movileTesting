package testSuite;

import activities.calculator.CalculatorScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import session.Session;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CalculatorTest {
    CalculatorScreen calculatorScreen = new CalculatorScreen();
    //Para la Suma
    @Test
    public void verifySumaNumber() throws InterruptedException {
        //Ingresando el primer numero
        calculatorScreen.addnumberFirt.clearSetText("4");
        //Ingresando el segundo numero
        calculatorScreen.addnumberSecond.clearSetText("2");
        //Para el botonScree
        calculatorScreen.addButton.click();

        Thread.sleep(5000);
        // verificacion  expected vs actual
        String expectedResult = "6";
        String actualResult =  calculatorScreen.result.getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta");
    }
    //Para la resta
    @Test
    public void verifyRestaNumber() throws InterruptedException {

        //Ingresando el primer numero
        calculatorScreen.addnumberFirt.clearSetText("4");
        //Ingresando el segundo numero
        calculatorScreen.addnumberSecond.clearSetText("2");
        //Para la resta
        calculatorScreen.suma.click();
        calculatorScreen.resta.click();
        //Para el boton
        calculatorScreen.addButton.click();

        Thread.sleep(5000);
        // verificacion  expected vs actual
        String expectedResult = "2";
        String actualResult =  calculatorScreen.result.getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la resta es incorrecta");
    }
    //Para la multiplicacion
    @Test
    public void verifyMultiplicacionNumber() throws InterruptedException {

        //Ingresando el primer numero
        calculatorScreen.addnumberFirt.clearSetText("4");
        //Ingresando el segundo numero
        calculatorScreen.addnumberSecond.clearSetText("2");
        //Para la resta
        calculatorScreen.suma.click();
        calculatorScreen.multiplicar.click();
        //Para el boton
        calculatorScreen.addButton.click();

        Thread.sleep(5000);
        // verificacion  expected vs actual
        String expectedResult = "8";
        String actualResult =  calculatorScreen.result.getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la multiplicacion es incorrecta");
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeSession();
    }
}