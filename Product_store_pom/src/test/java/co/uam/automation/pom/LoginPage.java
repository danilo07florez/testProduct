package co.uam.automation.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//representan páginas específicas de la aplicación web bajo
//prueba. Cada clase Page encapsula los elementos web (botones, campos de
//entrada, enlaces, etc.) y las interacciones (clics, entradas de texto,
//selecciones)
public class LoginPage extends BasePage {
    public By loginOption = By.linkText("Log in");
    public By nameofuser = By.id("nameofuser");
    public By username = By.id("loginusername");
    public By password = By.id("loginpassword");
    public By loginButton =
            By.xpath("//button[text()='Log in']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void login(String username, String password)
            throws InterruptedException {
        click(loginOption);
        Thread.sleep(2000);
        type(username, this.username);
        type(password, this.password);
        click(loginButton);
    }
    public String loginSuccessfulText() {
        return getText(nameofuser);
    }
}
