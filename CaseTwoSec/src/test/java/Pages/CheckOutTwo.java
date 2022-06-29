package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutTwo {
    WebDriver driver;

    public CheckOutTwo(WebDriver driver){

        this.driver=driver;


    }

    By email_create= By.xpath("//*[@id=\"email_create\"]");
    By SubmitCreate= By.xpath("//*[@id=\"SubmitCreate\"]");
    By id_gender1= By.xpath("//*[@id=\"id_gender1\"]");
    By customer_firstname=By.xpath("//*[@id=\"customer_firstname\"]");
    By customer_lastname= By.xpath("//*[@id=\"customer_lastname\"]");
    By passwd= By.xpath("//*[@id=\"passwd\"]");
    By days= By.xpath("//*[@id=\"days\"]");
    By months= By.xpath("//*[@id=\"months\"]");
    By years= By.xpath("//*[@id=\"years\"]");
    By company= By.xpath("//*[@id=\"company\"]");
    By address1= By.xpath("//*[@id=\"address1\"]");
    By city= By.xpath("//*[@id=\"city\"]");
    By id_state= By.xpath("//*[@id=\"id_state\"]");

    public void setEmail_create(String email){
        driver.findElement(email_create).sendKeys(email);
        driver.findElement(SubmitCreate).click();

    }
    public void createAccount(String firstname, String lastname, String pwd){
        driver.findElement(id_gender1).click();
        driver.findElement(customer_firstname).sendKeys(firstname);
        driver.findElement(customer_lastname).sendKeys(lastname);
        driver.findElement(passwd).sendKeys(pwd);
        driver.findElement(days).click();
        driver.findElement(months).click();
        driver.findElement(years).click();

    }

    public void address(String compName,String add,String cityName){
        driver.findElement(company).sendKeys(compName);
        driver.findElement(address1).sendKeys(add);
        driver.findElement(city).sendKeys(cityName);
        driver.findElement(id_state).click();
    }


}
