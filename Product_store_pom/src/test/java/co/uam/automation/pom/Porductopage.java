package co.uam.automation.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Porductopage extends BasePage{

    public Porductopage(WebDriver driver) {
        super(driver);
    }

    //public By Comprar1Button = By.xpath("//a[@onclick=\"addToCart(1)\"]");
    // //a[text()='Add to cart']
    // //a[contains(text(),'cart')]
    //

    public By productoseleccionado = By.xpath("//a[contains(text(),'Samsung galaxy s6')]");
    public By Comprar2Button = By.xpath("//a[text()='Add to cart']");
    //public By ComprarButton = By.xpath("//a[@onclick='addToCart(1)']");
    //public By carritoCompra = By.xpath("//a[@onclick='showcart()']");// cuando estas en l apgina cart
    public By carritoCompra = By.id("cartur");;// funciona cuando esta en el home
    public By botonBorrar = By.xpath("//tbody/tr/td[contains(text(),'Samsung')]/../td/a");
    public By botonOrder = By.xpath("//button[text()='Place Order']");

    //  //h2[text()='Thank you for your purchase!']
    // //button[text()='Place Order']
    //button[contains( text(),'Place Order')]
    // //tbody/tr/td[contains(text(),'Nokia')]/../td[4]/a


    public By nameUser = By.id("name");
    public By nameCountry = By.id("country");
    public By nameCity = By.id("city");
    public By nameCard = By.id("card");
    public By nameMonth = By.id("month");
    public By nameYear = By.id("year");
    public By botonPurchase = By.xpath("//button[@onclick='purchaseOrder()']");
    public By botonOk = By.xpath("//button[text()='OK']");
    public By mensaje = By.xpath("//h2[text()='Thank you for your purchase!']");

    public void comprar(String nombre, String pais,String ciudad,String card,String mes, String year) throws InterruptedException {
       click(productoseleccionado);
        Thread.sleep(2000);
       click(Comprar2Button);
        Thread.sleep(2000);
       clickAlert();
        Thread.sleep(2000);
       click(carritoCompra);
        Thread.sleep(2000);
       click(botonOrder);
        Thread.sleep(8000);
        type(nombre, this.nameUser);
        type(pais, this.nameCountry);
        type(ciudad, this.nameCity);
        type(card, this.nameCard);
        type(mes, this.nameMonth);
        type(year, this.nameYear);
        Thread.sleep(2000);
        click(botonPurchase);
        Thread.sleep(2000);
        click(botonOk);
        Thread.sleep(2000);
    }
}
