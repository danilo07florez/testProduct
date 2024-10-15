package co.uam.automation.pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class LoginTest {
    private WebDriver driver;
    LoginPage loginPage;
    Porductopage productoPage;

    @BeforeMethod
    public void setUp() throws Exception{
        loginPage = new LoginPage(driver);
        driver = loginPage.chromeDriverConnection();
        loginPage.visit("https://www.demoblaze.com/");


//        driver = productoPage.chromeDriverConnection();
//        productoPage.visit("https://www.demoblaze.com/");
    }
    @AfterMethod
    public void tearDown() throws Exception{
        driver.quit();
    }
//    @Test
//    public void loginUser() throws InterruptedException {
//        loginPage.login("username", "password");
//        Thread.sleep(2000);
//        assertEquals(loginPage.loginSuccessfulText(),
//                "Welcome username");
//    }

//    @Test
//   public void ComprarUser() throws InterruptedException {
//        productoPage.comprar("Pepito Perez", "Colombia", "Bogota", "1234","Octubre","2024");
//       Thread.sleep(5000);
//        //assertEquals(productoPage.CompraSuccessfulText(), "OK");
//    }

    @Test
    public void UserLoginPay() throws InterruptedException {
        loginPage.login("username", "password");
        Thread.sleep(2000);
        assertEquals(loginPage.loginSuccessfulText(),
                "Welcome username");

        productoPage = new Porductopage(driver);
        productoPage.comprar("Pepito Perez", "Colombia", "Bogota", "1234","Octubre","2024");
    }
}
