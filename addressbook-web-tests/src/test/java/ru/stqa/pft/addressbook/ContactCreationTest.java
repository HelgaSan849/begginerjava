package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactCreationTest {
  private WebDriver dw;


  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    dw = new FirefoxDriver();
    dw.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    dw.get("http://localhost/group.php");
    login("admin", "secret");
  }

  private void login(String username, String password) {
    dw.findElement(By.name("user")).clear();
    dw.findElement(By.name("user")).sendKeys(username);
    dw.findElement(By.name("pass")).click();
    dw.findElement(By.name("pass")).clear();
    dw.findElement(By.name("pass")).sendKeys(password);
    dw.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testContactCreation() throws Exception {

    gotoNewContact();
    fillContactForm(new ContactData("Ann", "Smith", "title", "Company", "London"));
    submitNewContact();
    gotoHomePage();
  }

  private void gotoHomePage() {
    dw.findElement(By.name("home")).click();
  }

  private void submitNewContact() {
    dw.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  private void fillContactForm(ContactData contactData) {
    dw.findElement(By.name("firstname")).click();
    dw.findElement(By.name("firstname")).clear();
    dw.findElement(By.name("firstname")).sendKeys(contactData.getName());
    dw.findElement(By.name("lastname")).click();
    dw.findElement(By.name("lastname")).clear();
    dw.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
    dw.findElement(By.name("title")).click();
    dw.findElement(By.name("title")).clear();
    dw.findElement(By.name("title")).sendKeys(contactData.getTitle());
    dw.findElement(By.name("company")).click();
    dw.findElement(By.name("company")).clear();
    dw.findElement(By.name("company")).sendKeys(contactData.getCompany());
    dw.findElement(By.name("address")).click();
    dw.findElement(By.name("address")).clear();
    dw.findElement(By.name("address")).sendKeys(contactData.getAddress());
  }

  private void gotoNewContact() {
    dw.findElement(By.linkText("add new")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    dw.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      dw.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      dw.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
