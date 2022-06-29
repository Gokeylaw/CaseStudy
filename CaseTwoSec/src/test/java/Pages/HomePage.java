package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    //Locator for Add to cart button
    By AddToCartBtn = By.xpath("(//span[contains(text(),'Add to cart')])[1]");

    //Method to click login button
    public void AddToCart() {
        driver.findElement(AddToCartBtn).click();
    }

    By Product = By.xpath("//body/div[@id='page']/div/header[@id='header']/div/div/div/div[@id='layer_cart']/div/div[2]");
    public void PrdCLick() {
        driver.findElement(Product).click();
        System.out.println(driver.getTitle());
    }

    public void ReOccur(){
        for (int i=0; i < 4; i++) {
            driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
        }

    }

}
