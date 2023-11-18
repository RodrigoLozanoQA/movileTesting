package activities.calculator;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class CalculatorScreen {
    //Para el Numero 1
     public TextBox addnumberFirt = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.example.listadespegable:id/et1\"]"));
    //Para el Numero 2
    public TextBox addnumberSecond = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.example.listadespegable:id/et2\"]"));
    //Para la Suma
    public TextBox suma = new TextBox(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"sumar\"]"));
    //Para la Resta
    public TextBox resta = new TextBox(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"restar\"]"));
    //Para la Multiplicar
    public TextBox multiplicar = new TextBox(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"multiplicar\"]"));
    //Para el Boton
    public Button addButton = new Button(By.xpath("//android.widget.Button[@resource-id=\"com.example.listadespegable:id/button\"]"));
    //Para el Resultado
    public Label result = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.example.listadespegable:id/tv1\"]"));
}