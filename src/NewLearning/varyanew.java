package NewLearning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class varyanew {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\LearningNew\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://norinco.stagingzar.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Admin@123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[4]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[2]/a/div")).click();
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[2]/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"profileForm\"]/div[1]/div/div/label/span")).click();
        Thread.sleep(3000);
        String filepath ="C:\\Users\\Admin\\Downloads\\17031495261 (1) (1).jpg";
        StringSelection selection = new StringSelection (filepath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null); 
        Robot robot = new Robot();
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"layout-menu\"]/div[1]/a[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layout-menu\"]/ul/li[2]/a/div")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[1]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("New");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("User");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"designation\"]")).sendKeys("Helper");
        Thread.sleep(3000);
        WebElement Department = driver.findElement(By.xpath("//*[@id=\"department\"]"));  
        Select dropdown = new Select (Department);
        dropdown.selectByVisibleText("Mechanical");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("yasarjahid2025@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9632587410");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"employee_id\"]")).sendKeys("Nor@123");
        Thread.sleep(3000);
        WebElement Type = driver.findElement(By.xpath("//*[@id=\"user_type\"]"));
        Select dropdown1 = new Select (Type);
        dropdown1.selectByVisibleText("Engineer");
        Thread.sleep(3000);
        WebElement Gender = driver.findElement(By.xpath("//*[@id=\"gender\"]"));
        Select dropdown2 = new Select (Gender);
        dropdown2.selectByVisibleText("Male");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("chennai");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"engineerForm\"]/div[6]/button[1]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.scroll(0,5000)");
        Thread.sleep(3000);
        JavascriptExecutor jses = (JavascriptExecutor) driver;
	    jses.executeScript("window.scroll(0,-5000)");
        Thread.sleep(3000);
       // File FristSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       //File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\LearningNew\\snap\\img1.png");    //Screenshot Method 
       //FileHandler.copy(FristSrc, dest);
       //Thread.sleep(3000);
       //driver.findElement(By.xpath("//*[@id=\"layout-menu\"]/ul/li[2]/a/div")).click();
       //Thread.sleep(30000);
       // WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[1]/a"));
       //File eleSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       //File eledest = new File("C:\\Users\\Admin\\eclipse-workspace\\LearningNew\\snap\\img2.png");    //Element screenshot
       //FileHandler.copy(eleSrc, eledest);
       Thread.sleep(3000);
       
        
        		
	}

}
