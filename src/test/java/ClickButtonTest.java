import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickButtonTest {
  public static void main(String[] args) {
    // WebDriver'ı başlatıyoruz
    System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
    WebDriver driver = new ChromeDriver();

    // Sayfaya gidiyoruz
    driver.get("https://demoqa.com/elements");

    // "Buttons" sekmesine tıklıyoruz
    WebElement buttonsSection = driver.findElement(By.cssSelector("li#item-4"));
    buttonsSection.click();

    // "Click Me" butonuna tıklıyoruz
    WebElement clickMeButton = driver.findElement(By.cssSelector("button#V8Sc6"));
    clickMeButton.click();

    // Tıklama sonrasında çıkan mesajı kontrol ediyoruz
    WebElement message = driver.findElement(By.cssSelector("p#dynamicClickMessage"));
    if(message.getText().equals("You have done a dynamic click")) {
      System.out.println("Test Passed: Mesaj doğru");
    } else {
      System.out.println("Test Failed: Mesaj hatalı");
    }

    // Tarayıcıyı kapatıyoruz
    driver.quit();
  }
}