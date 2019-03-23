/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;
 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
/**
 *
 * @author ShraddhaGanesh
 */
public class CostcoTest {
    private WebDriver driver;
    public CostcoTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();     
        
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

 
    
  //login module
    //@Test
    public void testCostcoLogin1() throws Exception {
    driver.get("https://www.costco.com/");
    driver.findElement(By.id("header_sign_in")).click();
    driver.findElement(By.id("logonId")).clear();
    Thread.sleep(2000);
    FileUtil util = new FileUtil();
    driver.findElement(By.id("logonId")).sendKeys(util.getLogin());
    Thread.sleep(2000);
    driver.findElement(By.id("logonPassword")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("logonPassword")).sendKeys(util.getPassword());
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remember Me'])[1]/following::input[1]")).click();
    driver.quit();
  }
    
    
//positive scenario search box module
 @Test
  public void testCostcoTest2() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).sendKeys("office desk");
    Thread.sleep(2000);
    driver.findElement(By.id("formcatsearch")).submit();
    driver.quit();
  }

  
  @Test //negative scenario search box module
  public void testCostcoTest3() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).sendKeys("di;uvbsebfs");
    Thread.sleep(2000);
    driver.findElement(By.id("formcatsearch")).submit();
    driver.quit();
  }

  
   
    @Test //positive scenario search box module
    public void testCostcoTest4() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).sendKeys("office desk");
    Thread.sleep(2000);
    driver.findElement(By.id("formcatsearch")).submit();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Color")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(1)'])[4]/following::label[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(1)'])[2]/following::label[1]")).click();
    driver.quit();
  }

  
    @Test //positive scenario search box module
    public void testCostcoTest5() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).sendKeys("office desk");
    Thread.sleep(2000);
    driver.findElement(By.id("formcatsearch")).submit();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Frame Color")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Frame Color'])[1]/following::label[1]")).click();
    driver.quit();
  }
  
  //Negative senario search box module
    @Test
    public void testCostcoTest6() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])[1]/following::i[1]")).click();
    driver.quit();
  }
    
    //preksha grocery module
  //  @Test
  public void testCostcoGrocery10() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("Home_Ancillary_0")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Kirkland Signature")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Price'])[1]/following::label[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Kirkland Signature Nut Bar, 1.41 oz, 30-count")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("add-to-cart-btn")).click();
    driver.quit(); 
  }
  
  //preksha grocery module
   //@Test
  public void testBrandTestCase7() throws Exception {
    driver.get("https://www.costco.com/Kirkland-Signature-Nut-Bar%2c-1.41-oz%2c-30-count.product.100321570.html");
    Thread.sleep(2000);
    driver.findElement(By.id("Home_Ancillary_0")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Canned & Packaged Foods'])[2]/following::div[4]")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Brand")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(3)'])[1]/following::label[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Austin Peanut Butter Sandwich Crackers, 1.38 oz, 45-count")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("add-to-cart-btn")).click();
    driver.quit();  
  }
    
@Test
    public void testCostcoTest9() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).sendKeys("office chair");
    Thread.sleep(2000);
    driver.findElement(By.id("formcatsearch")).submit();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Show more options")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(39)'])[1]/following::label[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Showing 1-26 of 26'])[2]/following::img[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("productOption00")).click();
    new Select(driver.findElement(By.id("productOption00"))).selectByVisibleText("Brown - $249.99");
    Thread.sleep(2000);  
    driver.findElement(By.id("productOption00")).click();
    Thread.sleep(2000);  
    driver.findElement(By.id("add-to-cart-btn")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Continue Shopping'])[1]/following::button[1]")).click();
  }

    
    
   @Test
   public void testCostco8() throws Exception {
   driver.get("https://www.costco.com/sunglasses.html?price=25-50&refine=MIN_PRICE%253A%2528%255B25%2B50%257D%2B50%2529|");
   Thread.sleep(2000);
   driver.findElement(By.linkText("Brand")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Brand'])[1]/following::label[1]")).click();
   Thread.sleep(2000);
   driver.findElement(By.linkText("Kirkland Signature M40 Matte Gunmetal Polarized Sunglasses")).click();
   Thread.sleep(2000);
   driver.findElement(By.id("minQtyText")).click();
   Thread.sleep(2000);
   driver.findElement(By.id("minQtyText")).clear();
   Thread.sleep(2000);
   driver.findElement(By.id("minQtyText")).sendKeys("2");
   driver.quit();
  }
    
  
}
  
  

