package co.uam.automation.pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


//BasePage actúa como una clase padre fundamental. Contiene
//elementos y métodos comunes a todas las páginas de la aplicación web,
//como dar clic, introducir texto, obtener texto
public class BasePage {

    private WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public WebDriver chromeDriverConnection() {
        driver = new ChromeDriver();
        return driver;
    }
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }
    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }
    public String getText(WebElement element){
        return element.getText();
    }
    public String getText(By locator){
        return driver.findElement(locator).getText();
    }
    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }
    public void click(By locator){
        driver.findElement(locator).click();
    }
    public Boolean isDisplayed(By locator){
        try{
            return
                    driver.findElement(locator).isDisplayed();
        }catch(org.openqa.selenium.NoSuchElementException
                e){
            return false;
        }
    }
    public void visit(String url){
        driver.get(url);
    }

    public void clickAlert(){
        driver.switchTo().alert().accept();
    }

}
