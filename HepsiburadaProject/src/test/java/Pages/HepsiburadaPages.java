package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HepsiburadaPages {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By check = By.cssSelector("a[title='Hepsiburada'] > svg");

    static By accept = By.id("onetrust-accept-btn-handler");
    static By search = By.cssSelector(".theme-IYtZzqYPto8PhOx3ku3c");
    static By searchButton = By.cssSelector(".searchBoxOld-yDJzsIfi_S5gVgoapx6f");

    static By firstProduct =By.cssSelector("[type='comfort']:nth-of-type(1) .moria-ProductCard-gyqBb > [type='comfort']:nth-of-type(2)");




    public HepsiburadaPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {
        elementHelper.presenceElement(check);
    }

    public static void acceptCookie() {
        elementHelper.click(accept);
    }

    public static void clickSearch() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
        elementHelper.sendKey(search,"Macbook Pro");
    }

    public static void searchButton() {
        elementHelper.click(searchButton);
    }

    public static void firstProduct() {
        elementHelper.click(firstProduct);
        elementHelper.findElement(firstProduct);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //txt dosyasının kodlarını yaptım ama koda entegre edemedim o yüzden yorum gibi bıraktım.

        /*String productName = driver.findElement(By.id("productTitle")).getText().trim();
        String productPrice = driver.findElement(By.id("priceblock_ourprice")).getText().trim();
        String cpuModel = driver.findElement(By.xpath("//th[contains(text(), 'İşlemci Modeli')]/following-sibling::td")).getText().trim();


        try {
            FileWriter writer = new FileWriter("macbookpro.txt");
            writer.write("Model Adı: " + productName + "\n");
            writer.write("Fiyat: " + productPrice + "\n");
            writer.write("CPU Modeli: " + cpuModel + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
}

}