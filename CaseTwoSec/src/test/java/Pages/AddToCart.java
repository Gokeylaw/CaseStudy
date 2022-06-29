package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {

    WebDriver driver;

    public AddToCart(WebDriver driver){

        this.driver=driver;


    }

    By Search= By.id("search_query_top");
    By SubmitBtn=By.name("submit_search");
    String ActualTitle= null;
    By PrintedDress = By.xpath("//h5[@itemprop='name']//a[@title='Printed Chiffon Dress'][normalize-space()='Printed Chiffon Dress']");
    By product = By.xpath("//span[normalize-space()='Add to cart']");

    By layer = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    By center =By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");


    public void SearchItem(String Item){

        driver.findElement(Search).sendKeys(Item);

    }

    public void Submit(){
        driver.findElement(SubmitBtn).click();


    }

    public void StringCom(String ExpectedTitle){

        ActualTitle=driver.getTitle();
        Assert.assertEquals(ActualTitle,ExpectedTitle);
        System.out.println(ActualTitle +"  "+ExpectedTitle);

        }


    public void  clickItem()
        {

        driver.findElement(PrintedDress).click();


    }

    public  void  ReOccur(){
        for (int i=0; i < 4; i ++) {
            driver.findElement(By.className("icon-plus")).click();
        }
    }

    public void ProductClick(){

        driver.findElement(product).click();


    }

    public void layerCart(){
        driver.findElement(layer).click();
    }

    public void centerCol(){
        driver.findElement(center).click();
    }

}
