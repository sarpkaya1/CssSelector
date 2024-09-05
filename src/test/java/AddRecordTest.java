import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRecordTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/webtables");

        WebElement addButton = driver.findElement(By.cssSelector("button#addNewRecordButton"));
        addButton.click();

        WebElement firstNameField = driver.findElement(By.cssSelector("input#firstName"));
        firstNameField.sendKeys("Kemal");
        WebElement lastNameField = driver.findElement(By.cssSelector("input#lastName"));
        lastNameField.sendKeys("Aydın");
        WebElement emailField = driver.findElement(By.cssSelector("input#userEmail"));
        emailField.sendKeys("kaydın@example.com");
        WebElement ageField = driver.findElement(By.cssSelector("input#age"));
        ageField.sendKeys("30");
        WebElement salaryField = driver.findElement(By.cssSelector("input#salary"));
        salaryField.sendKeys("50000");
        WebElement departmentField = driver.findElement(By.cssSelector("input#department"));
        departmentField.sendKeys("Mühendis");


        WebElement submitButton = driver.findElement(By.cssSelector("button#submit"));
        submitButton.click();


        WebElement editButton = driver.findElement(By.cssSelector("span#edit-record-4"));
        editButton.click();


        WebElement editFirstNameField = driver.findElement(By.cssSelector("input#firstName"));
        editFirstNameField.clear();
        editFirstNameField.sendKeys("Elif");


        WebElement updateButton = driver.findElement(By.cssSelector("button#submit"));
        updateButton.click();


        WebElement updatedFirstName = driver.findElement(By.xpath("//div[@class='rt-td'][text()='Elif']"));
        if(updatedFirstName != null) {
            System.out.println("Test Passed: Kayıt başarıyla güncellendi");
        } else {
            System.out.println("Test Failed: Kayıt güncellenemedi");
        }

        // Tarayıcıyı kapatıyoruz
        driver.quit();
    }
}
