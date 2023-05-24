package HWclass03;

import class03.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class OpenChromeBrowser {
    /*
    @here use css and xpath to dot this
HW1:
Open chrome browser
Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
fill in the complete form
     */
        public static void main(String[] args) throws InterruptedException {

            // creating instance
            WebDriver driver = new ChromeDriver();

            // navigate to url
            driver.get("http://practice.syntaxtechs.net/input-form-demo.php");

            // maximize screen
            driver.manage().window().maximize();

            // input firstName using xpath
            WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
            firstName.sendKeys("Sunny");

            // input lastName using CSS
            WebElement lastName = driver.findElement(By.cssSelector("input[name='last_name']"));
            lastName.sendKeys("Williams");

            // input email using CSS
            WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
            email.sendKeys("Swilliams@syntax.com");

            // input telephone number using xpath
            WebElement telephoneNum = driver.findElement(By.xpath("//input[@name='phone']"));
            telephoneNum.sendKeys("571-438-7798");

            // input address using CSS
            WebElement address = driver.findElement(By.cssSelector("input[placeholder='Address']"));
            address.sendKeys("60 east ave");

            // input city using xpath
            WebElement city = driver.findElement(By.xpath("//input[@placeholder='city']"));
            city.sendKeys("Falls Church");

            // selecting the state tab using xpath
            WebElement stateTab = driver.findElement(By.xpath("//select[@class='form-control selectpicker']"));
            stateTab.click();

            // selecting state
            Select selectState = new Select(stateTab);
            selectState.selectByVisibleText("VA");

            // input zip code using CSS
            WebElement zipCode = driver.findElement(By.cssSelector("input[name='zip']"));
            zipCode.sendKeys("22041");

            // input website/domain name using CSS
            WebElement website = driver.findElement(By.cssSelector("input[placeholder='Website or domain name']"));
            website.sendKeys("www.facebook.com");

            // clicking No for hosting
            WebElement no = driver.findElement(By.cssSelector("input[value='no']"));
            no.click();

            // Project description
            WebElement project = driver.findElement(By.cssSelector("textarea[class='form-control']"));
            project.sendKeys("Selenium");

            // wait 3 seconds to verify information
            Thread.sleep(2000);

            // click send
            WebElement send = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
            send.click();

        }
    }