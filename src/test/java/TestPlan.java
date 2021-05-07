import java.util.Random;

public class TestPlan extends Methods

    {
        // open mainpage && control
        public void mainPage(){
            String mainPageURL = getUrl();
            String mainPageUrlConrol= "https://www.gittigidiyor.com/";

            if(mainPageURL.equals(mainPageUrlConrol)){
                log.info("You are in mainpage");
            }
            else{
                log.info("Not entered");
            }
        }

        // Login with mail and password && conrol
        public void logIn () throws InterruptedException {
            String mail ="talhabayhanonline@gmail.com";
            String password="testinium25";

            clickElement(WebElements.btn_login_first);
            Thread.sleep(1000);

            clickElement(WebElements.btn_login);

            findElement(WebElements.mail_input).sendKeys(mail);
            findElement(WebElements.password_input).sendKeys(password);

            String mailControl =findElement(WebElements.mail_input).getText();
            String passwordControl =findElement(WebElements.password_input).getText();


            clickElement(WebElements.btn_loginWithValues);


            /*if(mail.equals(mailControl) && password.equals(passwordControl)){

                log.info("Succefully logged in");
            }
            else{
                log.info("wrong mail or password");
            }*/
        }

        public void closeCookie(){
           clickElement(WebElements.cookie);
        }

        public void search(){
            String str ="Bilgisayar";
            findElement(WebElements.search).sendKeys(str);
            clickElement(WebElements.btn_search);
        }

        public void goSecondPage(){
            String pageControl ="https://www.gittigidiyor.com/arama/?k=Bilgisayar&sf=2";
            clickElement(WebElements.btn_second_page);
            String secondPageUrl= getUrl();

            if(secondPageUrl.equals(pageControl)){
                log.info("You are in 2nd page");
            }
            else{
                log.info("wrong page");
            }

        }

        public void addItem(){

            clickElement(WebElements.rnd_item);
        }

        public void addToBasket() throws InterruptedException {

            clickElement(WebElements.btn_add_to_basket);
            Thread.sleep(1000);

            clickElement(WebElements.btn_goto_basket);

            String p1= findElement(WebElements.price_on_basket).getText();
            String p2= findElement(WebElements.price_on_list).getText();


            if(p1.equals(p2)){
                System.out.println("same price");
            }
            else{
                System.out.println("not same price");
            }

        }

        public void addItem2() throws InterruptedException {
            String number ="2";
            clickElement(WebElements.add_item_number);
            String n1 = findElement(WebElements.add_item_number).getText();
            if(number.equals(n1)){
                System.out.println("2 items");
            }
            else {
                System.out.println("not 2 items");
            }
            Thread.sleep(2000);

        }

        public void deleteItem(){
            clickElement(WebElements.btn_delete_item);

        }

        public void checkForDeleted() throws InterruptedException {
            Thread.sleep(500);
            String str="Sepetinizde ürün bulunmamaktadır.";
            String strControl= findElement(WebElements.deleted_info).getText();
            Thread.sleep(2000);

            if(str.equals(strControl)){
                System.out.println("empty");
            }
            else{
                System.out.println("not empty");
            }
        }

        public void finish(){

            driver.close();
        }
    }
