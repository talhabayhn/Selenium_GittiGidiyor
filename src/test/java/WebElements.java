import org.openqa.selenium.By;

import java.util.Random;

public class WebElements {
    static int r = ((int)(Math.random()*48));



    public static By btn_login_first = By.xpath("//div[@data-cy='header-user-menu']");
    public static By btn_login = By.cssSelector("[data-cy='header-login-button']");
    public static By mail_input= By.cssSelector("#L-UserNameField");
    public static By password_input= By.cssSelector("#L-PasswordField");
    public static By btn_loginWithValues= By.cssSelector("#gg-login-enter");
    public static By search= By.xpath("//input[@type='text']");
    public static By btn_search= By.cssSelector(".qjixn8-0.sc-1bydi5r-0.hKfdXF");
    public static By cookie= By.xpath("//*[@id=\"__next\"]/main/section/section/a");
    public static By btn_second_page= By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a");
    public static By rnd_item= By.xpath("//li[@product-index=\""+r+"\"]");
    public static By btn_add_to_basket= By.cssSelector("[id='purchaseSoldInfoActionButtons'] [id='add-to-basket']");

    public static By btn_goto_basket = By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/div/div/div/div[2]/div[4]/div[1]/a");
    public static By price_on_basket = By.cssSelector(".gg-d-8.detail-price");
    public static By price_on_list = By.cssSelector("div[class='total-price']");

    public static By text_totalAmount = By.cssSelector("li[class='clearfix total-price-sticky-container']>:nth-child(1)");
    public static By add_item_number = By.cssSelector("option[value='2']");

    public static By btn_delete_item = By.cssSelector("a[title='Sil']");
   // public static By deleted_info = By.cssSelector("div[class='gg-w-22 gg-d-22 gg-t-21 gg-m-18']>:nth-child(1)");
    public static By deleted_info = By.xpath("//*[@id=\"empty-cart-container\"]/div[1]/div[1]/div/div[2]/h2") ;



}
