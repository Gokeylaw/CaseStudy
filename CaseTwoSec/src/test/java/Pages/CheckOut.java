package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOut {

    WebDriver driver;
public CheckOut(WebDriver driver1){
    this.driver= driver1;
}

    WebElement email;


    {
        assert false;
        email = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
    }

    public void ClickOp(String emailId){
        email.click();
        SendOp(email,emailId);


    }

    public void SendOp(WebElement getElement,String sendString){
        email.sendKeys(sendString);
    }
}
