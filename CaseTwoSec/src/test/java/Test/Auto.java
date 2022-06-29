package Test;

import Pages.AddToCart;
import Pages.CheckOutTwo;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;


public class Auto {

    public static void main(String[] args) throws InterruptedException, AWTException {

        // public static void welcome()  {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("http://automationpractice.com/index.php");
        Duration time = Duration.ofSeconds(40);                      //Waiting for page to load

        // *-------------------------Scroll down to add items into cart--------------------*//

        js.executeScript("window.scrollBy(0,700)");

        HomePage home = new HomePage(driver);                        //Creating object of Dashboard

        //*-------------------Click on Login button------------------*//
        Thread.sleep(3000);
        home.AddToCart();                                           //Calling method from HomePage
        Thread.sleep(3000);
        home.PrdCLick();                                           //Calling method from HomePage


       // driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]")).click();
       // driver.findElement(By.xpath("//body/div[@id='page']/div/header[@id='header']/div/div/div/div[@id='layer_cart']/div/div[2]")).click();
       // System.out.println(driver.getTitle());
        Thread.sleep(3000);

        Robot robot = new Robot();
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        home.ReOccur(); //Calling method from HomePage

        //_____________________________________________________________________________________________________________________________________________//

        //*************SEARCH AN ITEM AND ADD 5 OR MORE DIFFERENT ITEMS TO CART****************//
        AddToCart AddSearchItem = new AddToCart(driver);
        //String Item=null;

        AddSearchItem.SearchItem("Printed Summer Dress");                     //Calling method from HomePage

        AddSearchItem.Submit();                                                //Calling method from HomePage

        AddSearchItem.StringCom("Search - My Store");              //Calling method from HomePage

      //  driver.findElement(By.name("submit_search")).click();
        //String ActualTitle = driver.getTitle();
      //  System.out.println(ActualTitle);
       // String ExpectedTitle = "Search - My Store";
       // Assert.assertEquals(ActualTitle,ExpectedTitle);

       // driver.findElement(By.xpath("//h5[@itemprop='name']//a[@title='Printed Chiffon Dress'][normalize-space()='Printed Chiffon Dress']")).click();

         AddSearchItem.clickItem();
         AddSearchItem.ReOccur();
         Thread.sleep(1000);

      //  driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();

        AddSearchItem.ProductClick();
        Thread.sleep(5000);

        Actions act = new Actions(driver);

        //Double click on element
        WebElement wb2 = driver.findElement(By.xpath("//header[@id='header']//div[5]"));
        act.doubleClick(wb2).perform();
        Thread.sleep(3000);


        Robot robot1 = new Robot();
        robot1.delay(5000);
        robot1.keyPress(KeyEvent.VK_TAB);
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyPress(KeyEvent.VK_ENTER);



       // driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
      //  driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();

        AddSearchItem.layerCart();
        AddSearchItem.centerCol();
        Thread.sleep(3000);

       //********************** PROCEED TO CHECKOUT CREATE ACCOUNT ACCEPT TERMS  AND CONDITIONS**********************************************************************************************//

        CheckOutTwo check =new CheckOutTwo(driver);


        // driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("testgo4@gmail.com");
        check.setEmail_create("testgo6@gmail.com");

       // driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
        Thread.sleep(5000);
        check.createAccount("Testgo","goks","Admin@123");
        //driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
       // driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Testgo");
       // driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("goks");
       // driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Admin@123");
       // driver.findElement(By.xpath("//*[@id=\"days\"]")).click();
        Select date =new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
        date.selectByIndex(5);
     //   driver.findElement(By.xpath("//*[@id=\"months\"]")).click();
        Select months =new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
        months.selectByIndex(4);
       // driver.findElement(By.xpath("//*[@id=\"years\"]")).click();
        Select years =new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
        years.selectByIndex(6);
        check.address("TCS","ABC street","Chennai");
        //driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("TCS");
       // driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("ABC street");
       // driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Chennai");
      //  driver.findElement(By.xpath("//*[@id=\"id_state\"]")).click();
        Select state = new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
        state.selectByVisibleText("Alaska");
        driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("63600");


        //driver.findElement(By.xpath("//*[@id=\"id_country\"]")).click();
       // Select Country = new Select(driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")));
        driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
        driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();










        /*driver.findElement(By.xpath("(//span[contains(text(),'Add to cart')])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/div[@id='page']/div/header[@id='header']/div/div/div/div[@id='layer_cart']/div/div[1]")).click();
        //driver.findElement(By.id("search_query_top")).sendKeys("Printed Chiffon Dress");
       // driver.findElement(By.name("submit_search")).click();
        Thread.sleep(3000);
        Robot robot1 = new Robot();
        robot1.delay(5000);
        robot1.keyPress(KeyEvent.VK_TAB);
        robot1.delay(3000);
        robot1.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        driver.findElement(By.id("search_query_top")).clear();
        driver.findElement(By.id("search_query_top")).sendKeys("Printed Chiffon dress:");
        driver.findElement(By.name("submit_search")).click();

        System.out.println(driver.getTitle());*/
       // for (int i=0; i < 3; i ++) {
      //      driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
     //   }

       // driver.quit();


            }
        }

